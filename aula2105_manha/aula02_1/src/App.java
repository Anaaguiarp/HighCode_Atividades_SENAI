import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n---------------Exercício 1---------------");
        System.out.println("Informe dois números inteiros: ");
        int num1_1 = sc.nextInt();
        int num2_1 = sc.nextInt();
        System.out.println("Soma: "+(num1_1+num2_1));

        System.out.println("\n---------------Exercício 2---------------");
        System.out.println("Informe três números: ");
        double num1_2 = sc.nextDouble();
        double num2_2 = sc.nextDouble();
        double num3_2 = sc.nextDouble();
        System.out.println("Média: "+((num1_2+num2_2+num3_2)/3));

        System.out.println("\n---------------Exercício 3---------------");
        System.out.println("Informe um número: ");
        double num_3 = sc.nextDouble();
        if(num_3%2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É ímpar");
        }

        System.out.println("\n---------------Exercício 4---------------");
        System.out.println("Informe dois números: ");
        double num1_4 = sc.nextDouble();  
        double num2_4 = sc.nextDouble();
        System.out.println("Produto: "+(num1_4*num2_4));

        System.out.println("\n---------------Exercício 5---------------");
        System.out.println("Informe um número: ");
        double num_5 = sc.nextDouble();
        if(num_5 < 0){
            System.out.println("É negativo!");
        }else if(num_5 == 0){
            System.out.println("É neutro!");
        }else{
            System.out.println("É positivo!");
        }

        System.out.println("\n---------------Exercício 6---------------");
        System.out.println("Informe um número: ");
        double num_6 = sc.nextDouble();
        if(num_6 >= 10 && num_6 <=20){
            System.out.println("Este número está entre 10 e 20!");
        }else{
            System.out.println("Este número NÃO está entre 10 e 20!");
        }

        System.out.println("\n---------------Exercício 7---------------");
        System.out.println("Informe um número: ");
        double base_7 = sc.nextDouble();
        System.out.println("Informe o expoente desejada: ");
        double expoente_7 = sc.nextDouble();
        double res = 1;
        for(int i = 0; i < expoente_7; i++){
            res *= base_7;
        }
        System.out.println(base_7+"^"+expoente_7+" = "+res);

        System.out.println("\n---------------Exercício 8---------------");
        System.out.println("Informe dois números: ");
        double num1_8 = sc.nextDouble();
        double num2_8 = sc.nextDouble();
        if(num1_8 == num2_8){
            System.out.println("São IGUAIS!");
        }else{
            System.out.println("NÃO são iguais!");
        }

        System.out.println("\n---------------Exercício 9---------------");
        System.out.println("Informe um número: ");
        double num_9 = sc.nextDouble();
        if(num_9%5 == 0){
            System.out.println("É múltiplo de 5!");
        }else{
            System.out.println("NÃO é múltiplo de 5!");
        }

        System.out.println("\n---------------Exercício 10---------------");
        boolean carteiraMotorista = false;
        System.out.println("Informe uma idade: ");
        int idade_10 = sc.nextInt();
        if(idade_10 >= 18){
            System.out.println("Você possui carteira de motorista? \n1- Sim\n2- Não");
            int opc = sc.nextInt();
            if(opc == 1){
                carteiraMotorista = true;
                System.out.println("Carteira de Motorista: "+carteiraMotorista);
            }else{
                System.out.println("Carteira de Motorista: "+carteiraMotorista);
            }
        }else{
            System.out.println("Você é menor de idade e não pode ter carteira de motorista");
        }

        System.out.println("\n---------------Exercício 11---------------");
        System.out.println("Informe dois números inteiros: ");
        int num1_11 = sc.nextInt();
        int num2_11 = sc.nextInt();
        System.out.println("Resto da divisão: "+(num1_11%num2_11));

        System.out.println("\n---------------Exercício 12---------------");
        System.out.println("Informe um número: ");
        int num_12 = sc.nextInt();
        int divisivel = 0;
        for(int i_12=2; i_12<num_12; i_12++){
            if(num_12%i_12 == 0){
                divisivel++;
            }
        }
        if(divisivel==0){
            System.out.println("É primo!");
        }else{
            System.out.println("Não é primo!");
        }
        
        System.out.println("\n---------------Exercício 13---------------");
        System.out.println("Informe a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Fahrenheit: "+fahrenheit);

        System.out.println("\n---------------Exercício 14---------------");
        System.out.println("Informe o valor do produto: ");
        double valorProduto = sc.nextDouble();
        System.out.println("Desconto sobre o valor do produto: "+(valorProduto-(valorProduto*0.15)));

        System.out.println("\n---------------Exercício 15---------------");
        String senha = "admin123";
        System.out.println("Senha: ");
        String senhaInformada = sc.next();

        if(senha.equals(senhaInformada)){
            System.out.println("Senha iguais!");
        }else{
            System.out.println("Senhas divergentes!");
        }

        System.out.println("\n---------------Exercício 16---------------");
        System.out.println("Informe o ano em formato AAAA: ");
        int anoBissexto = sc.nextInt();
        if(anoBissexto%4 == 0 && anoBissexto%100 != 0){
            System.out.println("O ano é bissexto!");
        }else if(anoBissexto%400 == 0){
            System.out.println("O ano é bissexto!");
        }else{
            System.out.println("O ano não é bissexto!");
        }

        System.out.println("\n---------------Exercício 17---------------");
        System.out.println("Informe a largura e a altura do retângulo: ");
        double larguraRetangulo = sc.nextDouble();
        double alturaRetangulo = sc.nextDouble();
        System.out.println("Área do Retângulo: "+(larguraRetangulo*alturaRetangulo));

        System.out.println("\n---------------Exercício 18---------------");
        System.out.println("Escreva dois textos: ");
        String text1 = sc.next();
        String text2 = sc.next();

        if(text1.equals(text2)){
            System.out.println("Os textos são IGUAIS!");
        }else{
            System.out.println("Os textos NÃO são iguais!");
        }

        System.out.println("\n---------------Exercício 19---------------");
        System.out.println("Informe um número: ");
        double num_19 = sc.nextDouble();
        if(num_19%3 == 0 && num_19%4 == 0){
            System.out.println("Este número é divisível por 3 e por 4!");
        }else{
            System.out.println("Esse número NÃO é divisível por 3 e por 4!");
        }

        System.out.println("\n---------------Exercício 20---------------");
        System.out.println("Informe o valor final de uma compra: ");
        double valorCompra = sc.nextDouble();
        System.out.println("Valor com o imposto: "+(valorCompra+(valorCompra*0.10)));

        sc.close();
    }
}