public class BankAccount {
    private static int contadorContas = 100000000;
    private int accountNumber;
    private double balance;

    public BankAccount(double saldoInicial){
        this.accountNumber = contadorContas++;
        if(saldoInicial < 0){
            throw new IllegalArgumentException("O saldo não pode ser negativo!");
        }
        deposito(saldoInicial);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }

    public void saque(double valor){
        if(this.balance < valor){
            System.out.println("Saldo insuficiente!");
        }else{
            this.balance -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void deposito(double valor){
        if(valor <= 0){
            System.out.println("O valor de depósito não pode ser 0!");
        }else{
            this.balance += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    public String toString(){
        return "\nNúmero da Conta: "+this.accountNumber+
                "\nBalanço: "+ String.format("%.2f", this.balance);
    }
}