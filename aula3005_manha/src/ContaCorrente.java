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

    public boolean sacar(double valor){
        if(valor > 0 && (getSaldo() + limite) >= valor){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return super.toString() + "Limite: R$ " + String.format("%.2f", this.limite);
    }
}