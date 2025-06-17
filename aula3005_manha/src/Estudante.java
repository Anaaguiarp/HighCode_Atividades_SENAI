public class Estudante extends Pessoa {
    private int matricula;

    public Estudante(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString(){
        return super.toString() + "Matrícula: " + this.matricula;
    }
}