public class Conta {
    private String titular;
    private String numConta;
    private double saldo;

    public Conta(String titular, String numConta, double saldo){
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getNumConta() {
        return this.numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }

    public String toString(){
        return "Titular: " + this.titular +
                "Número da Conta: " + this.numConta + 
                "Saldo: R$ " + String.format("%.2f", this.saldo);
    }
}