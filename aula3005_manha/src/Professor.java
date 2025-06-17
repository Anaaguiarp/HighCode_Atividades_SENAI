public class Professor extends Empregado {
    private double salarioPorHora;
    private int horasAula;

    public Professor(String nome, int idade, double salarioPorHora, int horasAula) {
        super(nome, idade);
        this.salarioPorHora = salarioPorHora;
        this.horasAula = horasAula;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasAula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: Professor, Salário: R$ " + calcularSalario();
    }
}