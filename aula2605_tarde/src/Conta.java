public class Conta {
    public int numeroConta;
    public double saldo;
    public int balancoDepositos = 0;
    public int balancoSaques = 0;
    public int tentativas = 0;

    public Conta(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        
    }

    public Conta(){
        this.numeroConta = 1;
        this.saldo = 0.0;
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            this.tentativas++;
            System.out.println("Saldo insuficiente para sacar!\n");
        }else{
            this.saldo -= valor;
            this.balancoSaques++;
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
        this.balancoDepositos++;
    }

    public void verificaSaldoMinimo(double saldoMinimo){
        if(this.saldo == saldoMinimo){
            System.out.println("O saldo corresponde ao saldo mínimo!");
        }else if(this.saldo > saldoMinimo){
            System.out.println("o saldo é maior que o saldo mínimo!");
        }else{
            System.out.println("O saldo é inferior ao saldo mínimo!");
        }
    }

    public void calculaJuros(double valor, double juros){
        double comJuros = valor +(valor*(juros/100));
        System.out.printf("Taxa de Juros: %.2f%%\n", juros);
        System.out.println("Valor com os juros: "+comJuros+"\n");
    }

    public String verHistorico(){
        return "***HISTÓRICO DE TRANSAÇÕES***\n"+
                "\nQuantidade de Depósitos: "+this.balancoDepositos+
                "\nQuantidade de Saques: "+this.balancoSaques+
                "\nQuantidade de tentativas(falhas): "+this.tentativas;
    }

    public String toString(){
        return "Número da Conta: "+this.numeroConta+
                "\nSaldo: "+this.saldo+"\n";
    }
}