public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double salarioLiquido(){
        return this.salarioBruto - this.imposto;
    }

    public void aumentarSalario(int porcentagem){
        System.out.println("Qual a porcentagem de aumento? " + porcentagem);
        System.out.println("\nDados atualizados:");
        double salarioAtualizado = salarioLiquido() + (salarioBruto * porcentagem/100.0);
        System.out.printf("Empregado: %s, Salario R$%.2f", this.nome, salarioAtualizado);
    }

    public String toString(){
        return "Nome: "+this.nome+"\nSalario Bruto: "+String.format("%.2f", this.salarioBruto)+"\nImposto: "+ String.format("%.2f", this.imposto);
    }
}