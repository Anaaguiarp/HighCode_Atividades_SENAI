public class Vendedor extends Funcionario{
    private double vendas;
    private double comissao;

    public Vendedor(String nome, double salarioBase, double vendas, double comissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (vendas * comissao / 100);
    }
}