import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------Exercício 1--------------------");
        ArrayList<Contribuinte> contribuintes = new ArrayList<>();
        contribuintes.add(new PessoaFisica("Joao Silva", 50000, 2000));
        //System.out.println(contribuintes.toString());
        //PessoaFisica pessoaFisica2 = new PessoaFisica("Maria Souza", 15000, 0.00);
        contribuintes.add(new PessoaFisica("Maria Souza", 15000, 0.00));
        //System.out.println(contribuintes.toString());
        contribuintes.add(new PessoaJuridica("Senai Solutions", 400000, 25));
        //PessoaJuridica pessoaJuridica = new PessoaJuridica("Senai Solutions", 400000, 25);
        System.out.println(contribuintes.toString());
        double totalArrecadado= 0.0;

        for (Contribuinte contribuinte : contribuintes) {
            double imposto = contribuinte.calcularImposto();
            totalArrecadado += imposto;
        }

        System.out.printf("Total de imposto arrecadado: R$%.2f", totalArrecadado);

        System.out.println("--------------------Exercício 2--------------------");
        

    }
}