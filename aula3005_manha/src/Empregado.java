public abstract class Empregado {
    private String nome;
    private int idade;

    public Empregado(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}