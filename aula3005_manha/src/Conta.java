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
}