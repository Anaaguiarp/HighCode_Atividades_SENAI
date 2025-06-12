import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String numero;
    private String titular;
    private double saldo;
    private boolean chequeEspecial;
    private double limiteChequeEspecial;
    private List<String> historicoTransacoes;

    public Conta(String numero, String titular, double saldoInicial, boolean chequeEspecial, double limiteChequeEspecial){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.chequeEspecial = chequeEspecial;
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.historicoTransacoes = new ArrayList<>();
        registrarTransacao("Conta Criada! Saldo Inicial: R$"+String.format("%.2f", saldoInicial));
    }

    public String getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean isChequeEspecial() {
        return this.chequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }

    public List<String> getHistoricoTransacoes() {
        return this.historicoTransacoes;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            registrarTransacao("Depósito de R$ " + valor);
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            registrarTransacao("Saque de R$ " + valor);
            return true;
        } else if (chequeEspecial && (saldo + limiteChequeEspecial) >= valor) {
            saldo -= valor;
            registrarTransacao("Saque com cheque especial de R$ " + valor);
            return true;
        }
        return false;
    }

    private void registrarTransacao(String descricao) {
        historicoTransacoes.add(descricao);
    }

    public String toString(){
        return "\nConta: "+this.numero+
                "\nTitular: "+this.titular+
                "\nSaldo: "+this.saldo;
    }

}
