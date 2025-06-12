public class Prato {
    private String nomePrato;
    private double preco;
    private TipoPrato tipo;

    public Prato(){}

    public Prato(String nomePrato, double preco, TipoPrato tipo){
        this.nomePrato = nomePrato;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNomePrato() {
        return this.nomePrato;
    }
    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }
    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public TipoPrato getTipo() {
        return this.tipo;
    }
    public void setTipo(TipoPrato tipo) {
        this.tipo = tipo;
    }

    public String exibirPrato(){
        return "Nome do Prato: "+this.nomePrato+
                "\nPreço: "+String.format("%.2f", this.preco)+
                "\nTipo do Prato: "+this.tipo+"\n";
    }

    
    
}
