public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String titular, String numConta, double saldo, double taxaJuros){
        super(titular, numConta, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return this.taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros(){
        double juros = getSaldo() * (taxaJuros / 100);
        setSaldo(getSaldo() + juros);
    }

    @Override
    public String toString(){
        return super.toString() + "Taxa de Juros: " + this.taxaJuros + "%";
    }
}