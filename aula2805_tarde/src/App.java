import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
/*        System.out.println("\n--------------------Exercício 1--------------------");
        Pessoa pessoa = new Pessoa("Isadora", 23, "Brasil");
        System.out.println(pessoa.toString());
        pessoa.setPais("Alemanha");
        System.out.println(pessoa.toString());
        System.out.println(pessoa.getHistoricoPaises());
        
        Pessoa pessoa2 = new Pessoa();
        System.out.println("Informe um nome: ");
        pessoa2.setNome(sc.next());
        System.out.println("Informe sua idade: ");
        pessoa2.setIdade(sc.nextInt());
        System.out.println("Informe um país: ");
        pessoa2.setPais(sc.next());
        pessoa2.nomeMaiuscula();
        pessoa2.validaMaiorDeIdade();
        System.out.println("Países: "+pessoa2.getHistoricoPaises());

        System.out.println("\n--------------------Exercício 2--------------------");
        BankAccount bankAccount = new BankAccount(0.1);
        System.out.println(bankAccount.toString());
        bankAccount.deposito(200);
        System.out.println(bankAccount.toString());
        bankAccount.saque(300);
        bankAccount.saque(150);
        System.out.println(bankAccount.toString());
        BankAccount bankAccount2 = new BankAccount(2);
        System.out.println(bankAccount2.toString());

        System.out.println("\n--------------------Exercício 3--------------------");
        Rectangle retangulo = new Rectangle(5, 5);
        System.out.println(retangulo.toString());
        System.out.println("É quadrado? "+(retangulo.ehQuadrado() ? "Sim" : "Não"));
        System.out.println("Informe o cumprimento do retângulo: ");
        double comp = sc.nextDouble();
        System.out.println("Informe a largura do retângulo: ");
        double larg = sc.nextDouble();
        Rectangle retangulo2 = new Rectangle(comp, larg);
        System.out.println(retangulo2.toString());
        System.out.println("É quadrado? "+(retangulo2.ehQuadrado() ? "Sim" : "Não"));
        System.out.printf("Comprimento diagonal: %.2f\n", retangulo2.comprimentoDiagonal());
        System.out.println("Testando redimencionamento pela largura 5...");
        retangulo2.redimencionarPelaLargura(5);
        System.out.println("Testando redimencionamento pelo comprimento 3...");
        retangulo2.redimencionarPorComprimento(3);
        System.out.println(retangulo2.toString());

        System.out.println("\n--------------------Exercício 4--------------------");
        Employee e1 = new Employee(1, "Ana Beatriz", 2000, LocalDate.of(2018, 3, 15));
        Employee e2 = new Employee(2, "João Souza", 1500, LocalDate.of(2020, 7, 1));

        e1.setDepartamento("TI");
        e2.setDepartamento("Financeiro");

        e1.exibirInfo();
        e2.exibirInfo();
        e1.setEmployeeSalary(1800);
        e2.setEmployeeSalary(1000);
        e2.setEmployeeSalary(1600);

        e2.exibirInfo();*/

        System.out.println("\n--------------------Exercício 5--------------------");

        sc.close();
    }
}