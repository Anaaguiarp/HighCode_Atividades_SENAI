public class Aluno {
    public String nome;
    public int idade;
    public String curso;

    public Aluno(String nome){
        this(nome, 0, "Não informado!");
    }

    public Aluno(String nome, int idade){
        this(nome, idade, "Não informado!");
    }

    public Aluno(String nome, int idade, String curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public void exibirAluno(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Curso: "+this.curso);
    }
}
