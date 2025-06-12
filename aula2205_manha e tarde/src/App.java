import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------Exercício 1--------------------");
        System.out.println("Informe um número: ");
        int num1 = sc.nextInt();
        if(num1 > 0){
            System.out.println("Positivo!");
        }else if(num1 == 0){
            System.out.println("É neutro!");
        }else{
            System.out.println("É negativo!");
        }


        System.out.println("--------------------Exercício 2--------------------");
        System.out.println("Informe o ano: ");
        int anoBissexto = sc.nextInt();
        if(anoBissexto%4 == 0 && anoBissexto%100 != 0){
            System.out.println("O ano é bissexto!");
        }else if(anoBissexto%400 == 0){
            System.out.println("O ano é bissexto!");
        }else{
            System.out.println("O ano não é bissexto!");
        }


        System.out.println("--------------------Exercício 3--------------------");
        System.out.println("Informe uma idade: ");
        int idade_3 = sc.nextInt();
        if(idade_3 < 12){
            System.out.println("CRIANÇA!");
        }else if(idade_3 >= 12 && idade_3 < 18){
            System.out.println("ADOLESCENTE!");
        }else if(idade_3 >= 18 && idade_3 < 60){
            System.out.println("ADULTO!");
        }else if(idade_3 >= 60){
            System.out.println("IDOSO!");
        }

        System.out.println("--------------------Exercício 4--------------------");
        int opc;
        do{
            System.out.println("Informe um número para realizar a operação: ");
            double num1_4 = sc.nextDouble();
            System.out.println("Informe um número para realizar a operação: ");
            double num2_4 = sc.nextDouble();
            System.out.println("Informe a operação de deseja realizar:\n1 - Somar\n2 - Substração\n3 - Multiplicação\n4 - Divisão\n0 - Sair");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Resultado da Soma: "+ (num1_4 + num2_4));
                    break;
                case 2:
                    System.out.println("Resultado da Subtração: "+ (num1_4 - num2_4));
                    break;
                case 3:
                    System.out.println("Resultado da Multiplicação: "+ (num1_4 * num2_4));
                    break;
                case 4:
                    System.out.println("Resultado da Divisão: "+ (num1_4 / num2_4));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }while(opc != 0);

        System.out.println("--------------------Exercício 5--------------------");
        System.out.println("Informe uma letra: ");
        String a = sc.nextLine();
        char letra = a.toLowerCase().charAt(0);
        if("aeiou".indexOf(letra) != -1){
            System.out.println("É uma vogal!");
        }else{
            System.out.println("É uma consoante!");
        }

        System.out.println("--------------------Exercício 6--------------------");
        System.out.println("Informe três números: ");
        int num1_6 = sc.nextInt();
        int num2_6 = sc.nextInt();
        int num3_6 = sc.nextInt();
        if(num1_6 > num2_6 && num1_6 > num3_6){
            System.out.println("Maior número: "+ num1_6);
        }else if(num2_6 > num1_6 && num2_6 > num3_6){
            System.out.println("Maior número: "+ num2_6);
        }else{
            System.out.println("Maior número: " + num3_6);
        }
        
        System.out.println("--------------------Exercício 7--------------------");
        System.out.println("Informe uma nota: ");
        double nota_7 = sc.nextDouble();
        if(nota_7 >= 6){
            System.out.println("APROVADO!");
        }else{
            System.out.println("REPROVADO!");
        }

        System.out.println("--------------------Exercício 8--------------------");
        LocalTime horarioAtual = LocalTime.now();
        int hora = horarioAtual.getHour();
        if(hora >= 5 && hora <= 12){
            System.out.println("Bom dia!");
        }else if(hora > 12 && hora < 18){
            System.out.println("Boa tarde!");
        }else{
            System.out.println("Boa noite!");
        }

        System.out.println("--------------------Exercício 9--------------------");
        String senhaCorreta = "admin123";
        System.out.println("Informe a senha: ");
        String senhaDigitada = sc.next();

        if(senhaDigitada.equals(senhaCorreta)){
            System.out.println("Você informou a senha correta!");
        }else{
            System.out.println("Senha incorreta!");
        }

        System.out.println("--------------------Exercício 10--------------------");
        System.out.println("Informe o valor de x: ");
        double x = sc.nextDouble();
        System.out.println("Informe o valor de y: ");
        double y = sc.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("Quadrante I");
        }else if(x < 0 && y > 0){
            System.out.println("Quadrante II");
        }else if(x < 0 && y < 0){
            System.out.println("Quadrante III");
        }else{
            System.out.println("Quadrante IV");
        }

        System.out.println("--------------------Exercício 11--------------------");
        for(int i_11=1; i_11 <= 100; i_11++){
            System.out.print(i_11 + " ");
            if(i_11 == 50){
                System.out.println();
            }
        }

        System.out.println("--------------------Exercício 12--------------------");
        int i_12 = 1;
        while(i_12 <= 50){
            if(i_12%2 == 0){
                System.out.print(i_12 + " ");
            }
            i_12++;
        }

        System.out.println("\n--------------------Exercício 13--------------------");
        System.out.println("Informe um número: ");
        int fatorial = sc.nextInt();
        int result = 1; 
        for(int i_13 = 1; i_13 <= fatorial; i_13++){
            result *= i_13;
        }
        System.out.println(result);

        System.out.println("\n--------------------Exercício 14--------------------");
        double entrada_14 = 0, soma = 0;
        while(entrada_14 != -1) {
            System.out.println("Informe um número: ");
            entrada_14 = sc.nextDouble();
            soma += entrada_14;
        }
        System.out.println("Resultado da Soma: " + (soma+1));

        System.out.println("\n--------------------Exercício 15--------------------");
        System.out.println("Informe um número: ");
        double num_15 = sc.nextDouble();
        for(int i_15 = 1; i_15 <= 10; i_15++){
            System.out.println(num_15 + " x " + i_15 + " = " + (num_15 * i_15));
        }

        System.out.println("\n--------------------Exercício 16--------------------");
        int contador_16 = 0;
        for(int i_16 = 1; i_16 <= 1000; i_16++){
            if(i_16%7 == 0){
                contador_16++;
            }
        }
        System.out.println("Quantidadade de números múltiplos por 7: " + contador_16);

        System.out.println("\n--------------------Exercício 17--------------------");
        System.out.println("Informe a altura da pirâmide: ");
        int alturaPiramide = sc.nextInt();
        for(int i_17 = 1; i_17 <= alturaPiramide; i_17++){
            for(int k_17 = 1; k_17 <= alturaPiramide - i_17; k_17++){ // diminui os espaços a cada repetição (alturaPiramide - i_17)
                System.out.print(" "); //espaços antes dos *
            }
            for(int j_17 = 1; j_17 <= (2 * i_17) - 1; j_17++){// adiciona os * 
                System.out.print("*");
            }
            System.out.println();
        }

        /*
          *     
         *** <- a cada linha, aumenta 2, por isso o "(2 * i_17) - 1" por exemplo altura 3 com uma base de 5 asteriscos
        *****
        */

        System.out.println("\n--------------------Exercício 18--------------------");
        int [][] matriz = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        for(int i_18 = 0; i_18 < matriz.length; i_18++){
            for(int j_18 = 0; j_18 < matriz[i_18].length; j_18++){
                System.out.print(matriz[i_18][j_18]);
            }
            System.out.println();
        }
    

        System.out.println("\n--------------------Exercício 19--------------------");
        ArrayList<String> nomes = new ArrayList<>();
        boolean salvar = true;
        int i_19 = 0;
        do{
            System.out.println("Informe um nome: ");
            nomes.add(sc.next());
            if(nomes.get(i_19).equals("fim")){
                nomes.remove(i_19);
                System.out.println(nomes);
                salvar = false;
            }
            i_19++;
        }while(salvar);

        System.out.println("\n--------------------Exercício 20--------------------");
        for(int i_20 = 1; i_20 <= 100; i_20++){
            if(i_20%2 == 0){}else{
                System.out.print(i_20 + " ");
            }
        }

        System.out.println("\n--------------------Exercício 21--------------------");
        int numNegativo = 0, numPositivo = 0, entrada_21;   
        do{
            System.out.println("Digite um número: ");
            entrada_21 = sc.nextInt();
            if(entrada_21 > 0){
                numPositivo += entrada_21;
            }else if(entrada_21 < 0){
                numNegativo += entrada_21;
            }else{
                System.out.printf("Soma dos POSITIVOS: %d\nSoma dos NEGATIVOS: %d", numPositivo, numNegativo);
            }
        }while(entrada_21 != 0);
            
        System.out.println("\n--------------------Exercício 22--------------------");
        do{
            System.out.println("\nInforme a operação que deseja realizar:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n0 - Sair");
            opc = sc.nextInt();
            double num1_22, num2_22;
            switch (opc) {
                case 1:
                    System.out.println("Digite um número: ");
                    num1_22 = sc.nextDouble();
                    System.out.println("Digite um número: ");
                    num2_22 = sc.nextDouble();
                    System.out.println("Soma: "+(num1_22 + num2_22));
                    break;
                case 2:
                    System.out.println("Digite um número: ");
                    num1_22 = sc.nextDouble();
                    System.out.println("Digite um número: ");
                    num2_22 = sc.nextDouble();
                    System.out.println("Subtração: "+(num1_22 - num2_22));
                    break;
                case 3:
                    System.out.println("Digite um número: ");
                    num1_22 = sc.nextDouble();
                    System.out.println("Digite um número: ");
                    num2_22 = sc.nextDouble();
                    System.out.println("Multiplicação: "+(num1_22 * num2_22));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("ERRO Opção inválida!");
                    break;
            }
        }while(opc != 0);

        System.out.println("\n--------------------Exercício 23--------------------");

        for(int i_23 = 1; i_23 <= 10; i_23++){
            for(int j_23 = 1; j_23 <= 10; j_23++){
                System.out.printf("%4d", j_23*i_23);
            }
            System.out.println();
        }

        System.out.println("\n--------------------Exercício 24--------------------");
        int opc2 = 0;
        double num1_22, num2_22;
        do{
            System.out.println("\nInforme a operação que deseja realizar:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n0 - Sair");
            opc2 = sc.nextInt();
            switch (opc2) {
                case 1:
                    System.out.println("Digite um número: ");
                    num1_22 = sc.nextDouble();
                    System.out.println("Digite um número: ");
                    num2_22 = sc.nextDouble();
                    System.out.println("Soma: "+(num1_22 + num2_22));
                    break;
                case 2:
                    System.out.println("Digite um número: ");
                    num1_22 = sc.nextDouble();
                    System.out.println("Digite um número: ");
                    num2_22 = sc.nextDouble();
                    System.out.println("Subtração: "+(num1_22 - num2_22));
                    break;
                case 3:
                    System.out.println("Digite um número: ");
                    num1_22 = sc.nextDouble();
                    System.out.println("Digite um número: ");
                    num2_22 = sc.nextDouble();
                    System.out.println("Multiplicação: "+(num1_22 * num2_22));
                    break;
                case 4:
                    System.out.println("Digite um número: ");
                    num1_22 = sc.nextDouble();
                    System.out.println("Digite um número: ");
                    num2_22 = sc.nextDouble();
                    System.out.println("Multiplicação: "+(num1_22 * num2_22));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("ERRO Opção inválida!");
                    break;
            }
        }while(opc != 0);

        System.out.println("\n--------------------Exercício 25--------------------");
        System.out.println("Informe um número: ");
        int num_25 = sc.nextInt();
        for(int i_25 = 1; i_25 < 100; i_25++){
            if(num_25%i_25 == 0){
                System.out.print(i_25 + ", ");
            }
        }

        System.out.println("\n--------------------Exercício 26--------------------");
        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();
        char[] inverso = palavra.toCharArray();
        boolean ehPalindromo = true;

        for(int i_26 = 0; i_26 < inverso.length; i_26++){
            if(inverso[i_26] != inverso[inverso.length - i_26 - 1]){//análise de trás pra frente 
                ehPalindromo = false;
            }
        }

        if(ehPalindromo){
            System.out.println("É palíndromo!");
        }else{
            System.out.println("Não é palíndromo");
        }

        System.out.println("\n--------------------Exercício 27--------------------");
        System.out.println("Informe um número: ");
        int limite = sc.nextInt();
        for(int i_27 = 2; i_27 <= limite; i_27++){
            boolean ehPrimo = true;
            for(int j_27 = 2; j_27 < i_27; j_27++){
                if(i_27%j_27 == 0){
                    ehPrimo = false;
                    break;
                }
            }
            if(ehPrimo){
                System.out.print(i_27 + " ");
            }     
        }
        
        System.out.println("\n--------------------Exercício 28--------------------");
        System.out.println("****************** JOGO DA VELHA ******************");
        System.out.println("JOGADOR 1: X | JOGADOR 2: O");
        boolean velha = false;
        int jogadas = 0;
        String[][] tabuleiro = {
            {"_0,0_", "_0,1_", "_0,2_"},
            {"_1,0_", "_1,1_", "_1,2_"},
            {" 2,0 ", " 2,1 ", " 2,2 "}
        };

        System.out.println("_____|_____|_____");
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     \n");
        do {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + "|");
                }
                System.out.println();
            }

            int jogador = (jogadas % 2 == 0) ? 1 : 2;
            String simbolo = (jogador == 1) ? " X " : " O ";

            System.out.println("Jogador " + simbolo.trim() + ", digite a posição (ex: 0,0): ");
            String entrada = sc.nextLine();

            String[] partes = entrada.split(",");
            if (partes.length != 2) {
                System.out.println("Entrada inválida! Use o formato linha,coluna (ex: 0,0).");
                continue;
            }

            int linha, coluna;
            try {
                linha = Integer.parseInt(partes[0].trim());
                coluna = Integer.parseInt(partes[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Números inválidos! Digite novamente.");
                continue;
            }

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição fora do tabuleiro. Tente novamente.");
                continue;
            }

            if (!tabuleiro[linha][coluna].contains("X") && !tabuleiro[linha][coluna].contains("O")) {
                tabuleiro[linha][coluna] = " " + simbolo + " ";
                jogadas++;
            } else {
                System.out.println("Posição já ocupada. Escolha outra.");
                continue;
            }

            if (verificaVencedor(tabuleiro, simbolo)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tabuleiro[i][j] + "|");
                    }
                    System.out.println();
                }
                System.out.println("Parabéns! Jogador " + simbolo.trim() + " venceu!");
                break;
            }

            if (jogadas == 9) {
                velha = true;
                System.out.println("Deu velha! Empate.");
            }

        } while (!velha);

        System.out.println("\n--------------------Exercício 29--------------------");
        System.out.println("Quantos números deseja adicionar ao vetor?");
        int tamanho = sc.nextInt();

        int[] vetorInteiros = new int [tamanho];

        for(int i_29 = 0; i_29 < tamanho; i_29++){
            System.out.println("Digite o número: ");
            vetorInteiros[i_29] = sc.nextInt(); 
        }

        for (int i = 0; i < vetorInteiros.length - 1; i++) {
            for (int j = 0; j < vetorInteiros.length - 1 - i; j++) {
                if (vetorInteiros[j] > vetorInteiros[j + 1]) {
                    int temp = vetorInteiros[j];
                    vetorInteiros[j] = vetorInteiros[j + 1];
                    vetorInteiros[j + 1] = temp;
                }
            }
        }

        System.out.println("\nVetor em ordem:");
        for (int n : vetorInteiros) {
            System.out.print(n + ", ");
        }

        System.out.println("\n--------------------Exercício 30--------------------");
        System.out.println("Digite um número: ");
        int num_30 = sc.nextInt();
        int soma_30 = 0;

        while(num_30 > 0){
            int digito = num_30%10;
            soma_30 += digito;
            num_30 /= 10;
        }
        
        System.out.println("Soma dos digitos: "+soma_30);

        System.out.println("\n--------------------Exercício 31--------------------");
        System.out.println("Informe um número de 1 a 7: ");
        int diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Dia da Semana: Domingo");
                break;
            case 2:
                System.out.println("Dia da Semana: Segunda-feira");
                break;
            case 3:
                System.out.println("Dia da Semana: Terça-feira");
                break;
            case 4:
                System.out.println("Dia da Semana: Quarta-feira");
                break;
            case 5:
                System.out.println("Dia da Semana: Quinta-feira");
                break;
            case 6:
                System.out.println("Dia da Semana: Sexta-feira");
                break;
            case 7:
                System.out.println("Dia da Semana: Sábado");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("\n--------------------Exercício 32--------------------");
        System.out.println("Digite a senha: ");
        String senhaInformada = sc.next();
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;
        boolean temCaractereEspecial = false;
        

        String caracteresEspeciais = "@!#%$&*()+=-";

        for (int i = 0; i < senhaInformada.length(); i++) {
            char c = senhaInformada.charAt(i);

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            } else if (Character.isLowerCase(c)) {
                temMinuscula = true;
            } else if (Character.isDigit(c)) {
                temNumero = true;
            } else if (caracteresEspeciais.contains(String.valueOf(c))) {
                temCaractereEspecial = true;
            }
        }

        boolean senhaForte = temMaiuscula && temMinuscula && temNumero && temCaractereEspecial;

        if(senhaForte){
            System.out.println("Senha Forte!");
        }else{
            System.out.println("Senha Fraca!");
        }

        System.out.println("\n--------------------Exercício 33--------------------");
        String login = "admin";
        String senha = "1234";
        int i_33 = 0;

        while (i_33 < 3) {
            System.out.println("Informe o login: ");
            String loginDigitado = sc.next();
            System.out.println("Informe a senha: ");
            String senhaDigitada_33 = sc.next();
            if(!senha.equals(senhaDigitada_33) && !login.equals(loginDigitado)){
                System.out.println("Login/senha incorretos!");
            }else{
                System.out.println("Seja bem-vindo!");
                break;
            }
            i_33++;
        }

        System.out.println("\n--------------------Exercício 34--------------------");
        int[] vetor = {2, 4, 7, 10, 14, 18, 21};
        int valorBuscado = 10;

        int resultado = buscaBinaria(vetor, valorBuscado);

        if (resultado != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado no índice " + resultado);
        } else {
            System.out.println("Valor " + valorBuscado + " não encontrado no vetor.");
        }

        System.out.println("\n--------------------Exercício 35--------------------");
        System.out.println("Informe um número para realizamos a contagem regressiva: ");
        int n_35 = sc.nextInt();
        for(int i_35 = n_35; i_35 >= 0; i_35--){
            System.out.print(i_35+"...\t");
        }

        System.out.println("\n--------------------Exercício 36--------------------");
        int[][] matriz_36 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i_36 = 0; i_36 < matriz_36.length; i_36++){
            for(int j_36 = 0; j_36 < matriz_36[i_36].length; j_36++){
                System.out.print(matriz_36[i_36][j_36]);
            }
            System.out.println();
        }

        System.out.println("\n--------------------Exercício 37--------------------");
        int[] vetor_37 = new int[10];
        for(int i_37 = 0; i_37 < 10; i_37++){
            System.out.println("Informe um número: ");
            vetor_37[i_37] = sc.nextInt(); 
        }
        for(int i_37 = 0; i_37 < 10; i_37++){
            System.out.print(vetor_37[i_37]+" ");
        }

        System.out.println("\n--------------------Exercício 38--------------------");
        int[][] matriz_38 = new int[3][3]; 
        
        for(int i_38 = 0; i_38 < 3; i_38++){
            for(int j_38 = 0; j_38 < 3; j_38++){
                System.out.println("Informe um número inteiro: ");
                matriz_38[i_38][j_38] = sc.nextInt();
            }
            System.out.println();
        }
        double somaDiagonal = 0;
        for(int i_38 = 0; i_38 < 3; i_38++){
            somaDiagonal += matriz_38[i_38][i_38];
        }

        System.out.println("Soma da Diagonal: "+somaDiagonal);

        System.out.println("\n--------------------Exercício 39--------------------");
        int[] vetor_39 = new int[20];
        Random random_39 = new Random();
        int maior_39;

        for (int i = 0; i < vetor_39.length; i++) {
            vetor_39[i] = random_39.nextInt(100) + 1;
            System.out.println("vetor[" + (i+1) + "] = " + vetor_39[i]);
        }

        maior_39 = vetor_39[0];

        for (int i = 1; i < vetor_39.length; i++) {
            if (vetor_39[i] > maior_39) {
                maior_39 = vetor_39[i];
            }
        }

        System.out.println("\nO maior valor do vetor é: " + maior_39);

        System.out.println("\n--------------------Exercício 40--------------------");
        int[][] matrizA_40 = new int[2][2];
        int[][] matrizB_40 = new int[2][2];
        int[][] matrizSoma_40 = new int[2][2];

        System.out.println("Digite os valores da matriz A (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA_40[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nDigite os valores da matriz B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB_40[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSoma_40[i][j] = matrizA_40[i][j] + matrizB_40[i][j];
            }
        }

        System.out.println("\nMatriz Soma (A + B):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizSoma_40[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--------------------Exercício 41--------------------");
        System.out.print("Digite o tamanho do vetor (N): ");
        int n = sc.nextInt();

        int[] vetor_41 = new int[n];

        System.out.println("Digite " + n + " valores:");
        for (int i = 0; i < n; i++) {
            System.out.print("vetor[" + i + "]: ");
            vetor_41[i] = sc.nextInt();
        }

        Arrays.sort(vetor_41);

        System.out.println("\nVetor ordenado em ordem crescente:");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor_41[i] + " ");
        }

        System.out.println("\n--------------------Exercício 42--------------------");
        System.out.println("Soma: "+ Soma(5, 5));

        System.out.println("\n--------------------Exercício 43--------------------");
        exibirMensagem("Hello Word!");

        System.out.println("\n--------------------Exercício 44--------------------");
        ehParOuImpar(5);

        System.out.println("\n--------------------Exercício 45--------------------");
        fatorial(5);

        System.out.println("\n--------------------Exercício 46--------------------");
        int[][] matriz_46 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        exibirMatriz(matriz_46);

        System.out.println("\n--------------------Exercício 47--------------------");
        String original = "arara";
        String invertida = inverter(original);

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);

        if (original.equalsIgnoreCase(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        System.out.println("\n--------------------Exercício 48--------------------");
        int[] numeros_48 = {5, 12, 8, 20, 3, 15};
        int maior_48 = encontrarMaior(numeros_48);

        System.out.println("O maior valor do vetor é: " + maior_48);

        System.out.println("\n--------------------Exercício 49--------------------");
        exibirMedia(2.3, 8);

        System.out.println("\n--------------------Exercício 50--------------------");
        double tempFahrenheit = celsiusParaFahrenheit(25);

        System.out.println("Fahrenheit: " + tempFahrenheit + "°F");

        System.out.println("\n--------------------Exercício 51--------------------");
        int dia = 29, mes = 2, ano = 2024;

        if (dataValida(dia, mes, ano)) {
            System.out.println(dia + "/" + mes + "/" + ano + " é uma data válida.");
        } else {
            System.out.println(dia + "/" + mes + "/" + ano + " é uma data inválida.");
        }

        System.out.println("\n--------------------Exercício 52--------------------");
        imprimirAteN(5);

        System.out.println("\n--------------------Exercício 53--------------------");
        int base = 2;
        int expoente = 5;

        int resultado_53 = potencia(base, expoente);
        System.out.println(base + "^" + expoente + " = " + resultado_53);

        System.out.println("\n--------------------Exercício 54--------------------");
        boolean resultado_54 = saoIguais("TCS", "SENAI");
        System.out.println("As strings são iguais? " + (resultado_54 ? "Sim" : "Não"));

        System.out.println("\n--------------------Exercício 55--------------------");
        String[] nomes_55 = {"Ana Carolina", "Matheus", "Maria", "Ana Beatriz"};

        exibirElementos(nomes_55);

        System.out.println("\n--------------------Exercício 56--------------------");
        double[] notas_56 = {7.5, 8.0, 9.2, 6.8};

        double media_56 = calcularMedia(notas_56);
        System.out.println("A média é: " + media_56);

        System.out.println("\n--------------------Exercício 57--------------------");
        double area_57 = calcularAreaCirculo(5.0);
        System.out.println("A área do círculo é: " + area_57);

        System.out.println("\n--------------------Exercício 58--------------------");
        System.out.print("Quantos nomes deseja digitar? ");
        int quantidade_58 = sc.nextInt();
        sc.nextLine();

        lerEExibirNomes(quantidade_58);

        System.out.println("\n--------------------Exercício 59--------------------");
        int termo_59 = 7;

        System.out.println("Fibonacci de " + termo_59 + " = " + fibonacci(termo_59));

        System.out.println("\n--------------------Exercício 60--------------------");
        int[] vetorA_60 = {1, 2, 3, 4};
        int[] vetorB_60 = {7, 8, 3, 10};

        boolean resultado_60 = temElementoEmComum(vetorA_60, vetorB_60);
        System.out.println("Tem elemento em comum? " + (resultado_60 ? "Sim" : "Não"));

        System.out.println("\n--------------------Exercício 60--------------------");
        int[] numeros_61 = {5, 2, 9, 1, 7, 3};
        ordenarEExibir(numeros_61);

        sc.close();
    }

    public static double Soma(double num1, double num2){
        return num1 + num2;
    }

    public static void exibirMensagem(String mensagem){
        System.out.println("Mensagem: "+mensagem);
    }

    public static void ehParOuImpar(int num){
        if(num%2 == 0){
            System.out.println("É par!");
        }else{
            System.out.println("É ímpar!");
        }
    }

    public static void fatorial(int num){
        int result = 1; 
        for(int i_13 = 1; i_13 <= num; i_13++){
            result *= i_13;
        }
        System.out.println(result);
    }

    public static void exibirMatriz(int[][] matriz) {
        System.out.println("Elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static String inverter(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        return invertida;
    }

    public static int encontrarMaior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static void exibirMedia(double num1, double num2) {
        double media = (num1 + num2) / 2;
        System.out.println("A média aritmética é: " + media);
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static boolean dataValida(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && isAnoBissexto(ano)) {
            diasPorMes[1] = 29;
        }

        return dia <= diasPorMes[mes - 1];
    }

    public static void imprimirAteN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
    }

    public static int potencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static boolean saoIguais(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void exibirElementos(String[] vetor) {
        for (String elemento : vetor) {
            System.out.println(elemento);
        }
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0;

        for (double numero : vetor) {
            soma += numero;
        }

        return soma / vetor.length;
    }

    public static double calcularAreaCirculo(double raio) {
        double pi = 3.14;
        return pi * raio * raio;
    }

    public static void lerEExibirNomes(int n) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nNomes lidos:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean temElementoEmComum(int[] vetor1, int[] vetor2) {
        for (int i : vetor1) {
            for (int j : vetor2) {
                if (i == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void ordenarEExibir(int[] vetor) {
        int n = vetor.length;
        boolean trocou;

        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);

        System.out.println("Vetor ordenado:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static boolean verificaVencedor(String[][] t, String simbolo) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0].contains(simbolo) && t[i][1].contains(simbolo) && t[i][2].contains(simbolo)) return true;
            if (t[0][i].contains(simbolo) && t[1][i].contains(simbolo) && t[2][i].contains(simbolo)) return true;
        }
        if (t[0][0].contains(simbolo) && t[1][1].contains(simbolo) && t[2][2].contains(simbolo)) return true;
        if (t[0][2].contains(simbolo) && t[1][1].contains(simbolo) && t[2][0].contains(simbolo)) return true;

        return false;
    }

    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetor[meio] == valor) {
                return meio;
            } else if (valor < vetor[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }
}