import java.util.ArrayList;

abstract class ContaBancaria {
    protected String numeroConta;
    protected double saldo;
    protected double taxaDeServico = 2.50;
    protected ArrayList<String> historicoTransacoes = new ArrayList<>();

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        adicionarTransacao("Conta criada com saldo inicial: R$ " + saldo);
    }

    public void deposito(double valor) {
        saldo += valor;
        adicionarTransacao("Depósito de R$ " + valor);
    }

    public abstract boolean retirada(double valor);

    public boolean transferirDinheiro(ContaBancaria destino, double valor) {
        if (this.retirada(valor)) {
            destino.deposito(valor);
            adicionarTransacao("Transferência de R$ " + valor + " para conta " + destino.numeroConta);
            return true;
        }
        adicionarTransacao("Transferência falhou: saldo ou limite insuficiente.");
        return false;
    }

    protected void adicionarTransacao(String descricao) {
        historicoTransacoes.add(descricao);
    }

    public void exibirHistorico() {
        System.out.println("Histórico da conta " + numeroConta + ":");
        for (String t : historicoTransacoes) {
            System.out.println("- " + t);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}

class SaldoConta extends ContaBancaria {

    public SaldoConta(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public boolean retirada(double valor) {
        double total = valor + taxaDeServico;
        if (saldo >= total) {
            saldo -= total;
            adicionarTransacao("Retirada de R$ " + valor + " (saldo conta, taxa R$ " + taxaDeServico + ")");
            return true;
        } else {
            adicionarTransacao("Retirada falhou: saldo insuficiente.");
            return false;
        }
    }
}

class ChecarConta extends ContaBancaria {
    private double limiteChequeEspecial = 500.0;

    public ChecarConta(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public boolean retirada(double valor) {
        double total = valor + taxaDeServico;
        if (saldo + limiteChequeEspecial >= total) {
            saldo -= total;
            adicionarTransacao("Retirada de R$ " + valor + " (com cheque especial, taxa R$ " + taxaDeServico + ")");
            return true;
        } else {
            adicionarTransacao("Retirada falhou: limite de cheque especial excedido.");
            return false;
        }
    }
}

public class ContaBancariaTeste {
    public static void main(String[] args) {
        SaldoConta conta1 = new SaldoConta("123-1", 1000.00);
        ChecarConta conta2 = new ChecarConta("456-2", 200.00);

        conta1.deposito(300);
        conta1.retirada(150);
        conta1.transferirDinheiro(conta2, 600);

        conta2.retirada(400);
        conta2.retirada(700);

        System.out.println("\n--- Saldo Final ---");
        System.out.println("Conta " + conta1.getNumeroConta() + ": R$ " + conta1.getSaldo());
        System.out.println("Conta " + conta2.getNumeroConta() + ": R$ " + conta2.getSaldo());

        System.out.println("\n--- Histórico Conta 1 ---");
        conta1.exibirHistorico();

        System.out.println("\n--- Histórico Conta 2 ---");
        conta2.exibirHistorico();
    }
}