import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        System.out.println("\n--------------------Exercício 1--------------------");
        Pessoa pessoa = new Pessoa("Adriana", 23, 1.78);
        System.out.println(pessoa.apresentar());

        System.out.println("\n--------------------Exercício 2--------------------");
        Carro carro = new Carro("Toyota", "Corolla", 2019);
        System.out.println(carro.exibirDetalhes());

        System.out.println("\n--------------------Exercício 3--------------------");
        Produto produto = new Produto("Notebook", 3500.0);
        System.out.println(produto.toString());

        System.out.println("\n--------------------Exercício 4--------------------");
        Curriculo curriculo = new Curriculo("Adriana", 23, "Desenvolvedora de Software", "Java e .NET");
        System.out.println(curriculo.sobreMim());

        System.out.println("\n--------------------Exercício 5--------------------");
        Retangulo retangulo = new Retangulo(3.00, 4.00);
        System.out.printf("AREA = %.2f \nPERIMETRO = %.2f", retangulo.area(), retangulo.perimetro());

        System.out.println("\n--------------------Exercício 6--------------------");
        Funcionario funcionario = new Funcionario("Pedro Silva", 6000.0, 1000.00);
        System.out.println(funcionario.toString()+"\n");
        System.out.printf("Empregado: %s, Salario R$%.2f", funcionario.nome, funcionario.salarioLiquido());
        funcionario.aumentarSalario(10);

        System.out.println("\n--------------------Exercício 7--------------------");
        Aluno aluno = new Aluno("José", 20, 65, 45);
        System.out.printf("Nota Final: %.2f\n", aluno.notaFinal());
        if(aluno.notaFinal() >= 60){
            System.out.println("PASS!!");
        }else{
            System.out.println("FAILED!!");
            System.out.printf("Faltam %.2f pontos...", (60-aluno.notaFinal()));
        }

        System.out.println("\n--------------------Exercício 8--------------------");
        ContaBancaria conta = new ContaBancaria("Ana", 120);
        System.out.println(conta.toString());
        conta.atualizarSaldo(80);
        System.out.println(conta.toString());
    }
}