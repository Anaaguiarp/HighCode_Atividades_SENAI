public class ContaBancaria {
    public String titular;
    public double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void atualizarSaldo(double valor){
        this.saldo += valor;
    }

    public String toString(){
        return "Titular: "+this.titular+", Saldo: "+this.saldo;
    }
}