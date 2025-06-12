public class ContaBancaria {
    public String titular;
    public double saldo;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo: "+this.saldo);
    }
}