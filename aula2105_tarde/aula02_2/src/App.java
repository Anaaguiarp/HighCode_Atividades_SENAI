import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------Exercício 1------------------");
        for(int i=1;i <= 10; i++){
            System.out.print(i+", ");
        }

        System.out.println("\n------------------Exercício 2------------------");
        int i_2 = 0;
        while (i_2 <= 20) {
            System.out.print(i_2+", ");
            i_2++;
        }

        System.out.println("\n------------------Exercício 3------------------");
        int i_3 = 1, soma = 0;
        do{
            soma+=i_3;
            i_3++;
        }while(i_3 <= 100);
        System.out.println("Soma: "+soma);
       
        System.out.println("\n------------------Exercício 4------------------");
        System.out.println("informe um número inteiro: ");
        int num_4 = sc.nextInt();
        for(int i_4=1; i_4<=10; i_4++){
            System.out.println(num_4+" x "+i_4+" = "+num_4*i_4);
        }

        System.out.println("\n------------------Exercício 5------------------");
        for(int i_5=10; i_5>0; i_5--){
            System.out.print(i_5+", ");
        }

        System.out.println("\n------------------Exercício 6------------------");
        int contador = 0, i_6 = 1;
        while(i_6<=50){
            if(i_6%3 == 0){
                contador++;
            }
            i_6++;
        }
        System.out.println("Quantidade de números divisíveis por 3: "+contador);

        System.out.println("\n------------------Exercício 7------------------");
        double entrada, contador_7 = 0.0, soma_7 = 0.0;
        do{
            System.out.println("0 - Sair\nInforme um número:");
            entrada = sc.nextDouble();
            if(entrada != 0){
                contador_7++;
                soma_7 += entrada;
            }
        }while(entrada != 0);
        System.out.printf("Média: %.3f", (soma_7/contador_7));

        System.out.println("\n------------------Exercício 8------------------");
        System.out.println("Informe o valor de N: ");
        int n = sc.nextInt();
        for(int i_8 = 1; i_8 <= n; i_8++){
            for(int j = 1; j <= (n - i_8); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i_8 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n------------------Exercício 9------------------");
        for(int i_9 = 1; i_9 <= 100; i_9++){
            if(i_9%3 == 0 && i_9%5 == 0){
                System.out.print("FizzBuzz ");
            }else if(i_9%3 == 0){
                System.out.print("Fizz ");
            }else if(i_9%5 == 0){
                System.out.print("Buzz ");
            }else{
                System.out.print(i_9+" ");
            }
        }

        System.out.println("\n------------------Exercício 10------------------");
        System.out.println("Informe o limite: ");
        int limite = sc.nextInt(); //0 1 1 2 3 5 8 13 21 34
        int fib = 0, num_10 = 1, i_10 = 0;
        while (i_10 < limite) {
            System.out.print(fib + " ");
            int proximo = fib + num_10;
            fib = num_10;
            num_10 = proximo;
            i_10++;
        }

        System.out.println("\n------------------Exercício 11------------------");
        ArrayList<String> listaNomes = new ArrayList<>();
        String finalizar = "fim";
        boolean salvar = true;
        do{
            System.out.println("Digite um nome: ");
            String nomes = sc.next();
            listaNomes.add(nomes);
            for(int i_11 = 0; i_11 < listaNomes.size(); i_11++){
                if(listaNomes.get(i_11).equals(finalizar)){
                    listaNomes.remove(i_11);
                    salvar = false;
                }
            }
        }while(salvar);

        System.out.println(listaNomes);

        System.out.println("\n------------------Exercício 12------------------");
        System.out.println("Informe um número : ");
        int num_12 = sc.nextInt();
        int fatorial = 1;
        while(num_12 > 1){
            fatorial *= num_12;
            num_12--;
        }
        System.out.print(fatorial + " ");

        System.out.println("\n------------------Exercício 13-----------------");
        System.out.println("Informe um número: ");
        double num_13 = sc.nextDouble();
        for(int i_13 = 1; i_13 <= 10; i_13++){
            System.out.println(num_13 +" x "+ i_13 +" = "+(num_13 * i_13));
        }

        System.out.println("\n------------------Exercício 14-----------------");
        int contadorPar = 0, contadorImpar = 0;
        for(int i_14 = 1; i_14 <= 100; i_14++){
            if(i_14%2 == 0){
                contadorPar++;
            }else{
                contadorImpar++;
            }
        }
        System.out.printf("Quantidade de Pares: %d\nQuantidade de Ímpares: %d", contadorPar, contadorImpar);

        System.out.println("\n------------------Exercício 15-----------------");
        String senha = "Admin123";
        int i_15 = 1;
        while (i_15 <= 3) {
            System.out.println("Digite a senha: ");
            String senhaDigitada = sc.next();
            if(senha.equals(senhaDigitada)){
                System.out.println("Senha Correta!");
                break;
            }else{
                System.out.println("Senha Incorreta!");
            }
            i_15++;
        }

        System.out.println("\n------------------Exercício 16-----------------");
        int[][] matriz = new int[3][3];
        for(int i_16 = 0; i_16 < 3; i_16++){
            for(int j_16 = 0; j_16 < 3; j_16++){
                matriz[i_16][j_16] = (int) ((Math.random() * 9) + 1);
            }
        }
        System.out.println("Matriz aleatória: ");
        for(int i_16 = 0; i_16 < 3; i_16++){
            for(int j_16 = 0; j_16 < 3; j_16++){
                System.out.print(matriz[i_16][j_16] + " ");
            }
            System.out.println();
        }

        System.out.println("\n------------------Exercício 17-----------------");
        System.out.println("Informe um número inteiro: ");
        int num_17 = sc.nextInt();
        int soma_17 = 0;
        while(num_17 > 0){
            int digito = num_17%10;
            soma_17 += digito;
            num_17 = num_17 / 10;
        }
        System.out.println(soma_17);

        System.out.println("\n------------------Exercício 18-----------------");
        boolean finaliza = false;
        do{
            int numAleatorio_18 = (int)(Math.random() * 101) + 1;
            if(numAleatorio_18 > 90){
                finaliza = true;
                System.out.println(numAleatorio_18);
                break;
            }
            System.out.println(numAleatorio_18);
        }while(!finaliza);

        System.out.println("\n------------------Exercício 19-----------------");
        boolean finaliza2 = false;
        int i_19 = 0;
        double soma_19 = 0;
        ArrayList<Double> listaNotas = new ArrayList<>();
        do{
            System.out.printf("0 - Sair\nInforme a nota %d: ", i_19);
            double entrada_19 = sc.nextDouble();
            soma_19 += entrada_19;
            listaNotas.add(entrada_19);
            if(entrada_19 == 0){
                finaliza2 = true;
                break;
            }
            i_19++;
        }while(!finaliza2);
        if(!listaNotas.isEmpty()){
            soma_19 /= (listaNotas.size()-1);
            System.out.println(soma_19);
        }
        
        System.out.println("\n------------------Exercício 20-----------------");
        int i_20 = 1;
        do{
            if(i_20%4==0){
                System.out.println("Quatro");
            }else{
                System.out.println(i_20);
            }
            i_20++;
        }while(i_20 <= 100);

        sc.close();
    }
}