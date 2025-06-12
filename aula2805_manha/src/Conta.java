public class Conta {
    private static double TAXA_SAQUE = 3.00;
    private final int numeroConta;
    private String titular;
    private double saldo;
    private String senha;

    public Conta(int numeroConta, String titular, String senha){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.senha = senha;
        this.saldo = 0.0;
    }

    public Conta(int numeroConta, String titular, double saldoInicial, String senha){
        this.numeroConta = numeroConta;
        this.titular = titular;
        depositar(saldoInicial);
        this.senha = senha;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return this.saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Valor depositado com sucesso!");
        }else{
            System.out.println("O valor do depósito precisa ser positivo!");
        }
    }

    public void sacar(double valor){
        if(valor + TAXA_SAQUE > this.saldo){
            System.out.println("Saldo insuficiente para saque!");
        }else{
            this.saldo -= TAXA_SAQUE;
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public boolean validarLogin(int numeroContaDigitada, String senhaDigitada){
        return this.numeroConta == numeroContaDigitada && this.senha.equals(senhaDigitada);
    }

    public String toString(){
        return "_____DETALHES DA CONTA_____"+
                "\nNúmero da Conta: "+this.numeroConta+
                "\nTitular: "+this.titular+
                "\nSaldo: R$"+ String.format("%.2f", this.saldo)+"\n";
    }
}