public abstract class Contribuinte {
    private String nome;
    private double rendaAnual;

    public Contribuinte(){}

    public Contribuinte(String nome, double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getRendaAnual() {
        return this.rendaAnual;
    }
    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract double calcularImposto();

    public String toString(){
        return this.nome + ": R$" + String.format("%.2f", calcularImposto());
    }

}