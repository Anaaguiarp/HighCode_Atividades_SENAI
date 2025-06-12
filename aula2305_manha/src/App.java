import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--------------------Exercício 1--------------------");
        int[] vetor = new int[10];
        for(int i_1 = 0; i_1 < 10; i_1++){
            System.out.println("Digite um número: ");
            vetor[i_1] = sc.nextInt();
        }
        for(int i_1 = 0; i_1 < 10; i_1++){
            System.out.print(vetor[i_1]+" ");
        }

        System.out.println("\n--------------------Exercício 2--------------------");
        System.out.println("Quantos elementos deseja adicionar ao Array?");
        int tamanho = sc.nextInt();
        int[] vetor2 = new int[tamanho];

        for(int i_2 = 0; i_2 < tamanho; i_2++){
            System.out.println("Informe um número inteiro: ");
            vetor2[i_2] = sc.nextInt();
        }

        int maior = vetor2[0];
        int menor = vetor2[0];

        for(int i_2 = 0; i_2 < tamanho; i_2++){
            if(vetor2[i_2] > maior){
                maior = vetor2[i_2];
            }
            if(vetor2[i_2] < menor){
                menor = vetor2[i_2];
            }
        }

        System.out.println("Maior: "+maior+"\nMenor: "+menor);

        System.out.println("\n--------------------Exercício 3--------------------");
        System.out.println("Quantos elementos deseja adicionar ao Array?");
        int tamanho3 = sc.nextInt();
        double soma = 0; 
        int[] listaNumeros = new int[tamanho3];

        for(int i_3 = 0; i_3 < tamanho3; i_3++){
            System.out.println("Informe um número: ");
            listaNumeros[i_3] = sc.nextInt();
            soma += listaNumeros[i_3];
        }

        System.out.println("Média: "+(soma / tamanho3));

        System.out.println("\n--------------------Exercício 4--------------------");
        int[] vetor4 = {7, 3, 8, 5, 2, 5, 8, 5, 3, 22};
        Arrays.sort(vetor4);
        System.out.println("Vetor ordenado: "+Arrays.toString(vetor4));

        System.out.println("\n--------------------Exercício 5--------------------");
        HashSet<Integer> vistos = new HashSet<>();
        int[] vetor5 = {7, 3, 8, 5, 2, 5, 8, 5, 3, 22};
        int[] resultado = new int[vetor5.length];
        int index = 0;

        for(int i_5 = 0; i_5 < vetor5.length; i_5++){
            if(!vistos.contains(vetor5[i_5])){
                vistos.add(vetor5[i_5]);
                resultado[index++] = vetor5[i_5];
            }
        }
        System.out.println("Sem duplicatas: ");
        for(int i_5 = 0; i_5 < index; i_5++){
            System.out.print(resultado[i_5] + " ");
        }

        System.out.println("\n--------------------Exercício 6--------------------");
        int[][] matriz = new int[3][3];
        for(int i_6 = 0; i_6 < 3; i_6++){
            for(int j_6 = 0; j_6 < 3; j_6++){
                System.out.println("Informe um número inteiro: ");
                matriz[i_6][j_6] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i_6 = 0; i_6 < 3; i_6++){
            for(int j_6 = 0; j_6 < 3; j_6++){
                System.out.print(matriz[i_6][j_6]);
            }
            System.out.println();
        }

        System.out.println("\n--------------------Exercício 7--------------------");
        int[][] matriz7 = new int[3][3];
        double soma7 = 0;
        for(int i_6 = 0; i_6 < 3; i_6++){
            for(int j_6 = 0; j_6 < 3; j_6++){
                System.out.println("Informe um número inteiro: ");
                matriz7[i_6][j_6] = sc.nextInt();
                soma7 += matriz7[i_6][j_6];
            }
            System.out.println();
        }

        System.out.print("Soma: "+soma7);

        System.out.println("\n--------------------Exercício 8--------------------");
        int[][] matriz8 = new int[3][3];

        for(int i_8 = 0; i_8 < 3; i_8++){
            for(int j_8 = 0; j_8 < 3; j_8++){
                System.out.println("Informe um número inteiro: ");
                matriz8[i_8][j_8] = sc.nextInt();
            }
            System.out.println();
        }

        int maior8 = matriz8[0][0];
        int menor8 = matriz8[0][0];

        for(int i_8 = 0; i_8 < 3; i_8++){
            for(int j_8 = 0; j_8 < 3; j_8++){
                if(matriz8[i_8][j_8] > maior8){
                    maior8 = matriz8[i_8][j_8];
                }
                if(matriz8[i_8][j_8] < menor8){
                    menor8 = matriz8[i_8][j_8];
                }
            }
        }

        System.out.println("Maior: "+maior8+"\nMenor: "+menor8);

        System.out.println("\n--------------------Exercício 9--------------------");
        int[][] matriz9 = new int[3][3];

        matriz9[0][0] = 1; matriz9[0][1] = 2; matriz9[0][2] = 3;
        matriz9[1][0] = 4; matriz9[1][1] = 5; matriz9[1][2] = 6;
        matriz9[2][0] = 7; matriz9[2][1] = 8; matriz9[2][2] = 9;

        for(int i_9 = 0; i_9 < 3; i_9++){
            for(int j_9 = 0; j_9 < 3; j_9++){
                System.out.print(matriz9[i_9][j_9]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i_9 = 0; i_9 < 3; i_9++){
            for(int j_9 = 0; j_9 < 3; j_9++){
                System.out.print(matriz9[j_9][i_9]);
            }
            System.out.println();
        }

        System.out.println("\n--------------------Exercício 10--------------------");
        int[][] matriz1_10 = {
            {3, 2},
            {5, 6}
        };

        int[][] matriz2_10 = {
            {5, 7},
            {4, 2}
        };

        int[][] resultado10 = new int[2][2];

        for(int i_10 = 0; i_10 < 2; i_10++){
            for(int j_10 = 0; j_10 < 2; j_10++){
                System.out.print(matriz1_10[i_10][j_10]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i_10 = 0; i_10 < 2; i_10++){
            for(int j_10 = 0; j_10 < 2; j_10++){
                System.out.print(matriz2_10[i_10][j_10]+" ");
            }
            System.out.println();
        }

        for(int i_10 = 0; i_10 < 2; i_10++){
            for(int j_10 = 0; j_10 < 2; j_10++){
                resultado10[i_10][j_10] = 0;
                for(int k_10 = 0; k_10 < 2; k_10++){
                    resultado10[i_10][j_10] += (matriz1_10[i_10][k_10] * matriz2_10[k_10][j_10]);
                }
            }
        }
            
        System.out.println();
        System.out.println("Multiplicação: ");

        for(int i_10 = 0; i_10 < 2; i_10++){
            for(int j_10 = 0; j_10 < 2; j_10++){
                System.out.print(resultado10[i_10][j_10]+" ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------Exercício 11--------------------");
        boolean ehSimetrico = true;
        int[][] matriz1_11 = {
            {3, 2},
            {5, 6}
        };

        int[][] matriz2_11 = {
            {3, 2},
            {4, 6}
        };

        for(int i_11 = 0; i_11 < 2; i_11++){
            for(int j_11 = 0; j_11 < 2; j_11++){
                if(matriz1_11[i_11][j_11] != matriz2_11[i_11][j_11]){
                    ehSimetrico = false;
                }
            }
        }

        System.out.println("É simétrico? "+ (ehSimetrico ? "Sim" : "Não"));

        System.out.println("\n--------------------Exercício 12--------------------");
        Random random = new Random();
        int[][] matriz12 = new int[3][3];

        for(int i_12 = 0; i_12 < 3; i_12++){
            for(int j_12 = 0; j_12 < 3; j_12++){
                matriz12[i_12][j_12] = random.nextInt(100) + 1;
            }
        }

        for(int i_12 = 0; i_12 < 3; i_12++){
            for(int j_12 = 0; j_12 < 3; j_12++){
                System.out.print(matriz12[i_12][j_12]+" ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------Exercício 13--------------------");
        int[] vetor13 = {3, 2, 3, 5, 2, 4, 6, 7};
        int index13 = 0;
        System.out.println("Informe um número inteiro: ");
        int num = sc.nextInt();

        for(int i_13 = 0; i_13 < 8; i_13++){
            if(vetor13[i_13] == num){
                index13++;
            }
        }

        System.out.println("Quantidade de vezes que esse número aparece no vetor: "+index13);

        System.out.println("\n--------------------Exercício 14--------------------");
        int[][] matriz14 = new int[3][3];
        for(int i_14 = 0; i_14 < matriz14.length; i_14++){
            for(int j_14 = 0; j_14 < matriz14[i_14].length; j_14++){
                matriz14[i_14][j_14] = random.nextInt(2); 
            }
        }

        for(int i_14 = 0; i_14 < matriz14.length; i_14++){
            for(int j_14 = 0; j_14 < matriz14[i_14].length; j_14++){
                System.out.print(matriz14[i_14][j_14]); 
            }
            System.out.println();
        }

        System.out.println("\n--------------------Exercício 15--------------------");
        int[][] matriz1_15 = {
            {1, 0, 0},
            {0, 8, 0},
            {0, 0, 3}
        };

        int[][] matriz2_15 ={
            {3, 0, 0},
            {3, 7, 4},
            {9, 8, 3}
        };

        if(ehDiagonal(matriz1_15)){
            System.out.println("É uma matriz diagonal não nula!");
        }else{
            System.out.println("Não é uma diagonal não nula!");
        }

        if(ehDiagonal(matriz2_15)){
            System.out.println("É uma matriz diagonal não nula!");
        }else{
            System.out.println("Não é uma diagonal não nula!");
        }

        System.out.println("\n--------------------Exercício 16--------------------");
        int[][] matriz1_16 = new int[3][3];
        int[][] matriz2_16 = new int[3][3];
        int[][] resultado16 = new int[3][3];

        for(int i_16 = 0; i_16 < matriz1_16.length; i_16++){
            for(int j_16 = 0; j_16 < matriz1_16[i_16].length; j_16++){
                System.out.println("Informe um número inteiro: ");
                matriz1_16[i_16][j_16] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println();

        for(int i_16 = 0; i_16 < matriz2_16.length; i_16++){
            for(int j_16 = 0; j_16 < matriz2_16[i_16].length; j_16++){
                System.out.println("Informe um número inteiro: ");
                matriz2_16[i_16][j_16] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i_10 = 0; i_10 < 3; i_10++){
            for(int j_10 = 0; j_10 < 3; j_10++){
                resultado16[i_10][j_10] = (matriz1_16[i_10][j_10] + matriz2_16[i_10][j_10]);
            }
        }

        for(int i_16 = 0; i_16 < matriz2_16.length; i_16++){
            for(int j_16 = 0; j_16 < matriz2_16[i_16].length; j_16++){
                System.out.print(resultado16[i_16][j_16]+" ");
            }
            System.out.println();
        }

        System.out.println("\n--------------------Exercício 17--------------------");
        int[][] matriz_17 = {
            {1, 0, 0},
            {0, 8, 0},
            {0, 0, 3}
        };

        int soma17 = 0;
        for(int i_17 = 0; i_17 < matriz_17.length; i_17++){
            soma17 += matriz_17[i_17][i_17];
        }

        System.out.println("Soma dos elementos em diagonal: "+soma17);

        System.out.println("\n--------------------Exercício 18--------------------");
        int[][] matriz_18 = {
            {1, 0, 0},
            {0, 8, 0},
            {0, 0, 3}
        };
        System.out.println("Matriz:");
        for(int i_18 = 0; i_18 < matriz_18.length; i_18++){
            for(int j_18 = 0; j_18 < matriz_18[i_18].length; j_18++){
                System.out.printf("%4d", matriz_18[i_18][j_18]);
            }
            System.out.println();
        }

        System.out.println("\n--------------------Exercício 19--------------------");
        int[] vetor19 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int par = 0, impar = 0;

        for(int i_19 = 0; i_19 < vetor19.length; i_19++){
            if(vetor19[i_19]%2 == 0){
                par++;
            }else{
                impar++;
            }
        }

        System.out.printf("Quantidade de números pares: %d\nQuantidade de números ímpares: %d", par, impar);

        System.out.println("\n--------------------Exercício 20--------------------");
        int[][] matriz_20 = {
            {1, 0, 0},
            {0, 8, 0},
            {0, 0, 3}
        };

        int linhas = matriz_20.length;
        int colunas = matriz_20[0].length;
        
        int[] vetor20 = new int[linhas * colunas];
        int pos = 0;

        for(int i_20 = 0; i_20 < linhas; i_20++){
            for(int j_20 = 0; j_20 < colunas; j_20++){
                vetor20[pos] = matriz_20[i_20][j_20];
                pos++;
            }
        }

        for(int i_20 = 0; i_20 < vetor20.length; i_20++){
            System.out.print(vetor20[i_20]+" ");
        }
        
        sc.close();
    }
    public static boolean ehDiagonal(int[][] matriz){
        int n = matriz.length;
        
        for (int i = 0; i < n; i++) {
            if (matriz[i].length != n) {
                System.out.println("Matriz não é quadrada!");
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (matriz[i][j] == 0) {
                        return false;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}