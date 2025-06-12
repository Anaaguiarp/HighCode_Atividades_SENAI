public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int anosServico;
    private static Funcionario maiorSalario;

    public Funcionario(String nome, String cargo, double salario, int anosServico){
        this.nome = nome;
        this.cargo = cargo;
        this.anosServico = anosServico;
        setSalario(salario);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return this.cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
        if(maiorSalario == null || salario > maiorSalario.getSalario()){
            maiorSalario = this;
        }
    }

    public int getAnosServico() {
        return this.anosServico;
    }

    public void setAnosServico(int anosServico) {
        this.anosServico = anosServico;
    }

    public static Funcionario getMaiorSalario() {
        return maiorSalario;
    }

    public void salarioLiquido(double porcentagemDesconto){
        double salarioLiquido = this.salario - (this.salario*(porcentagemDesconto / 100));
        System.out.printf("Salário Liquido: %.2f", salarioLiquido);
    }

    public void atualizaSalario(double porcentagemAumento){
        if (this.anosServico > 1) {
            this.salario += this.salario * (porcentagemAumento / 100);
            System.out.println("Salário Atualizado: R$ " + String.format("%.2f", this.salario));
            if (maiorSalario == null || this.salario > maiorSalario.getSalario()) {
                maiorSalario = this;
            }
        } else {
            System.out.println("Aumento não permitido. Funcionário deve ter mais de 1 ano de serviço.");
        }
    }

    public double calcularBonus() {
        return this.salario * 0.05 * this.anosServico;
    }

    public String toString(){
        return "\nNome: " + this.nome+
                "\nCargo: "+ this.cargo+
                "\nSalário: R$ "+ String.format("%.2f", this.salario)+
                "\nAnos de Serviço: "+this.anosServico;
    }
}