public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String toString(){
        return "Produto: " + this.nome + " | Preço: R$ " + this.preco;
    }
}
