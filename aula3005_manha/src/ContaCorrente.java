public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(String titular, String numConta, double saldo, double limite){
        super(titular, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}