public class Engenheiro extends Empregado {
    private double salarioBase;
    private double bonusProjeto;

    public Engenheiro(String nome, int idade, double salarioBase, double bonusProjeto) {
        super(nome, idade);
        this.salarioBase = salarioBase;
        this.bonusProjeto = bonusProjeto;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusProjeto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: Engenheiro, Salário: R$ " + calcularSalario();
    }
}