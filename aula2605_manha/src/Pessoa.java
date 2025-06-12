public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String apresentar(){
        return "Olá, meu nome é "+this.nome+", tenho "+this.idade+" anos e minha altura é "+this.altura +" metros.";
    }
}