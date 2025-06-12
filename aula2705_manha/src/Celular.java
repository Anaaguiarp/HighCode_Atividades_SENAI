public class Celular {
    public String marca;
    public String modelo;
    public double preco;

    public Celular(String marca){
        this.marca = marca;
        this.modelo = "Não informado";
        this.preco = 0.0;
    }

    public Celular(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Celular(String marca, String modelo, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public void exibirCelular(){
        System.out.println("\n\nMarca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.printf("Preço: %.2f", this.preco);
    }
}
