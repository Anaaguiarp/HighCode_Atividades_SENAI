import java.util.ArrayList;
import java.util.List;

public class ContaBanco {
    private int numeroConta;
    private double saldo;


    private static String nomeBanco = "Banco Padrão";
    private static double taxaJuros = 0.05; // 5%
    private static int totalContasCriadas = 0;

    private static List<String> transacoes = new ArrayList<>();

    public ContaBanco(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        totalContasCriadas++;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        registrarTransacao("Depósito de R$" + valor + " na conta " + numeroConta);
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            registrarTransacao("Saque de R$" + valor + " na conta " + numeroConta);
            return true;
        }
        return false;
    }

    public static String getNomeBanco() {
        return nomeBanco;
    }

    public static void setNomeBanco(String novoNome) {
        nomeBanco = novoNome;
    }

    public static double getTaxaJuros() {
        return taxaJuros;
    }

    public static void setTaxaJuros(double novaTaxa) {
        taxaJuros = novaTaxa;
        registrarTransacao("Taxa de juros atualizada para " + (novaTaxa * 100) + "%");
    }

    public static int getTotalContasCriadas() {
        return totalContasCriadas;
    }

    private static void registrarTransacao(String descricao) {
        transacoes.add(descricao);
    }

    public static List<String> getTransacoes() {
        return transacoes;
    }

    public void exibirDetalhes() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Banco: " + nomeBanco);
        System.out.println("Taxa de Juros: " + (taxaJuros * 100) + "%");
        System.out.println("-------------------------");
    }

    public static void atualizarTaxaJurosDinamicamente(double fator) {
        setTaxaJuros(taxaJuros * fator);
    }

    public static void setNomeBancoPorLocalizacao(String localizacao) {
        switch (localizacao.toLowerCase()) {
            case "sao paulo":
                nomeBanco = "Banco SP";
                break;
            case "rio de janeiro":
                nomeBanco = "Banco RJ";
                break;
            case "curitiba":
                nomeBanco = "Banco Curitiba";
                break;
            default:
                nomeBanco = "Banco Padrão";
        }
        registrarTransacao("Nome do banco alterado para " + nomeBanco + " baseado na localização: " + localizacao);
    }
}