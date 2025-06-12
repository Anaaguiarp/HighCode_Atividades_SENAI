public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String exibirDetalhes(){
        return "Carro: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano;
    }
}
