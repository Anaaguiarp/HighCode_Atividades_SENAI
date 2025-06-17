import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String password;

    private boolean isBlocked = false;
    private int failedAttempts = 0;

    private static final int MAX_FAILED_ATTEMPTS = 3;

    private List<String> transactionHistory = new ArrayList<>();

    public Account(String accountNumber, String accountHolder, double initialBalance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.password = password;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Depósito: R$" + amount);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void saque(double amount) {
        if (amount <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }
        if (amount > balance) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        balance -= amount;
        transactionHistory.add("Saque: R$" + amount);
    }

    public double calcularJuros(double taxaAnual, int anos) {
        return balance * taxaAnual * anos;
    }

    public void mostrarHistorico() {
        System.out.println("Histórico da conta:");
        for (String transacao : transactionHistory) {
            System.out.println(transacao);
        }
    }

    public boolean autenticar(String tentativaSenha) {
        if (isBlocked) {
            System.out.println("Conta bloqueada por múltiplas tentativas incorretas.");
            return false;
        }

        if (this.password.equals(tentativaSenha)) {
            failedAttempts = 0;
            return true;
        } else {
            failedAttempts++;
            System.out.println("Senha incorreta. Tentativas: " + failedAttempts);
            if (failedAttempts >= MAX_FAILED_ATTEMPTS) {
                isBlocked = true;
                System.out.println("Conta bloqueada após 3 tentativas.");
            }
            return false;
        }
    }

    public boolean isBlocked() {
        return isBlocked;
    }
}