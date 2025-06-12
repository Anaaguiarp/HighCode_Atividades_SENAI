import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1=1, num2=2, num3=3;
        System.out.println("\n----------Exercício 1----------");
        System.out.println(num1+", "+num2+", "+num3);

        System.out.println("\n----------Exercício 2----------");
        System.out.println("Informe seu nome: ");
        String nome = sc.next();
        System.out.println("Olá, "+nome);

        System.out.println("\n----------Exercício 3----------");
        System.out.println("Informe um número inteiro: ");
        int numInt1 = sc.nextInt();
        int numInt2 = sc.nextInt();
        System.out.println(numInt1+", "+numInt2);

        System.out.println("\n----------Exercício 4----------");
        System.out.println("Informe um número decimal: ");
        double numDecimal = sc.nextDouble();
        int numDecimalInt = (int)numDecimal;
        System.out.println(numDecimalInt);

        System.out.println("\n----------Exercício 5----------");
        int numInt = 10;
        double numDecimal_5 = 1.5;
        char caractere = 'A';
        boolean isTrue = true;
        System.out.println(numInt+", "+numDecimal_5+", "+caractere+", "+isTrue);

        System.out.println("\n----------Exercício 6----------");
        System.out.println("Informe seu nome: ");
        String nome_5 = sc.next();
        System.out.println("Informe sua idade: ");
        int idade_5 = sc.nextInt();
        System.out.println("Olá, "+nome_5+"! Você tem "+idade_5+" anos.");

        System.out.println("\n----------Exercício 7----------");
        System.out.println("Informe dois números inteiros: ");
        int num_7 = sc.nextInt();
        int num2_7 = sc.nextInt();
        System.out.println("Resultado da soma: "+(num_7+num2_7));

        System.out.println("\n----------Exercício 8----------");
        System.out.println("Informe dois números: ");
        double num_8 = sc.nextDouble();
        double num2_8 = sc.nextDouble();
        System.out.println("Resultado da subtração: "+(num_8-num2_8));

        System.out.println("\n----------Exercício 9----------");
        System.out.println("Informe dois números: ");
        double num_9 = sc.nextDouble();
        double num2_9 = sc.nextDouble();
        System.out.println("Produto: "+(num_9*num2_9));

        System.out.println("\n----------Exercício 10----------");
        System.out.println("Informe dois números: ");
        double num_10 = sc.nextDouble();
        double num2_10 = sc.nextDouble();
        System.out.println("Resultado da Divisão: "+(num_10/num2_10));

        System.out.println("\n----------Exercício 11----------");
        System.out.println("Informe três números: ");
        double num1_11 = sc.nextDouble();
        double num2_11 = sc.nextDouble();
        double num3_11 = sc.nextDouble();
        System.out.println("Resultado da média: "+((num1_11+num2_11+num3_11)/3));

        System.out.println("\n----------Exercício 12----------");
        System.out.println("Informe um número: ");
        double num_12 = sc.nextDouble();
        System.out.println("Número ao quadrado: "+(Math.pow(num_12, 2)));

        System.out.println("\n----------Exercício 13----------");
        System.out.println("Informe dois números: ");
        double num1_13 = sc.nextDouble();
        double num2_13 = sc.nextDouble();
        System.out.println("Resto da divisão: "+(num1_13%num2_13));

        System.out.println("\n----------Exercício 14----------");
        System.out.println("Informe a base do retângulo: ");
        double baseRetangulo = sc.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        double alturaRetangulo = sc.nextDouble();
        System.out.println("Área do Retângulo: "+(baseRetangulo*alturaRetangulo));

        System.out.println("\n----------Exercício 15----------");
        System.out.println("Informe seu peso: ");
        double pesoPessoa = sc.nextDouble();
        System.out.println("Informe sua altura em metros: ");
        double alturaPessoa = sc.nextDouble();
        System.out.printf("Índice de Massa Corporal(IMC): %.2f", (pesoPessoa/(alturaPessoa*alturaPessoa)));

        System.out.println("\n----------Exercício 16----------");
        System.out.println("Informe uma temperatura em Celsius: ");
        double celcius = sc.nextDouble();
        System.out.println("Conversão para Fahrenheit: "+((celcius*1.8) + 32));

        System.out.println("\n----------Exercício 16.2----------");
        System.out.println("Informe o preço do produto: ");
        double precoProduto = sc.nextDouble();
        System.out.println("Informe o porcentual do desconto: ");
        double porcentualProduto = sc.nextDouble();
        System.out.println("Valor final: "+(precoProduto+(precoProduto*(porcentualProduto/100))));

        System.out.println("\n----------Exercício 17----------");
        System.out.println("Informe o salário: ");
        double salarioFuncionario = sc.nextDouble();
        System.out.println("Informe a porcentagem de aumento: ");
        double porcentualAumento = sc.nextDouble();
        System.out.println("Salário com aumento: "+(salarioFuncionario+(salarioFuncionario*(porcentualAumento/100))));

        System.out.println("\n----------Exercício 18----------");
        System.out.println("Informe uma temperatura em Celsius: ");
        double celcius_18 = sc.nextDouble();
        System.out.println("Equivalente em Fahrenheit: "+((celcius_18*1.8) + 32));

        System.out.println("\n----------Exercício 19----------");
        System.out.println("Informe um valor em reais: ");
        double valorReais = sc.nextDouble();
        System.out.println("Informe a cotação do dólar: ");
        double cotacaoDolar = sc.nextDouble();
        System.out.println("Conversão para dólar: "+(valorReais/cotacaoDolar));

        System.out.println("\n----------Exercício 20----------");
        System.out.println("Informe a distância e a velocidade do carro: ");
        double distaciaCarro = sc.nextDouble();
        double velocidadeCarro = sc.nextDouble();
        System.out.println("Tempo estimado de viagem: "+(distaciaCarro*velocidadeCarro));

        System.out.println("\n----------Exercício 21----------");
        System.out.println("Informe a quantidade de kWh consumidos: ");
        double kwh = sc.nextDouble();
        System.out.println("Informe o valor do kWh: ");
        double valorKwh = sc.nextDouble();
        System.out.println("Total da Conta de Energia: "+(kwh*valorKwh));

        System.out.println("\n----------Exercício 22----------");
        System.out.println("Informe o valor da compra: ");
        double valorCompra = sc.nextDouble();
        System.out.println("Informe a quantidade de parcelas: ");
        int parcelasCompra = sc.nextInt();
        System.out.printf("Valor de cada parcela: %.2f", (valorCompra/parcelasCompra));

        System.out.println("\n----------Exercício 23----------");
        System.out.println("Informe um valor investido: ");
        double valorInvestido = sc.nextDouble();
        System.out.println("Informe a taxa de juros mensal: ");
        double taxaJurosMensal = sc.nextDouble();
        System.out.println("Valor total após um mês de rendimento: "+(valorInvestido+(valorInvestido*(taxaJurosMensal/100))));
        sc.close();
    }
}