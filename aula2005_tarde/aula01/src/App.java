import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Exercícios 8-----------");
        System.out.println("Informe uma idade: ");
        int idade = sc.nextInt();
        if(idade > 0){
            if(idade < 12){
                System.out.println("Você é uma criança!");
            }else if(idade >= 12 && idade <= 17){
                System.out.println("Você é um adolescente!");
            }else if(idade >= 18 && idade <= 59){
                System.out.println("Você é um adulto!");
            }else if(idade >= 60){
                System.out.println("Você é um idoso!");
            }
        }else{
            System.out.println("Informe uma idade válida!");
        }
        
        System.out.println("-----------Exercícios 9-----------");
        String login = "admin";
        String senha = "admin123";
        System.out.println("Login: ");
        String loginDigitado = sc.next();
        System.out.println("Senha: ");
        String senhaDigitada = sc.next();
        if(loginDigitado.equals(login) && senhaDigitada.equals(senha)){
            System.out.println("Seja bem-vindo!");
        }else{
            System.out.println("Login inválido!");
        }

        System.out.println("-----------Exercícios 10-----------");
        System.out.println("Informe uma nota de 0 a 10: ");
        double nota = sc.nextDouble();
        if(nota < 0 || nota > 10){
            System.out.println("ERRO! Informe uma nota válida!");
        }

        System.out.println("-----------Exercícios 11-----------");
        for(int i=1; i<=20;i++){
            System.out.print(i+", ");
        }

        System.out.println("-----------Exercícios 12-----------");
        int i=10;
        while (i>0) {
            System.out.print(i+", ");
            i--;
        }

        System.out.println("-----------Exercícios 13-----------");
        int i_13 = 1, soma = 0;
        do{
            if(i_13%2 == 0){
                soma += i_13;
            }
            i_13++;
            
        }while(i_13>0 && i_13<=100);
        System.out.println(soma);

        System.out.println("-----------Exercícios 14-----------");
        int numAleatorio = (int)(Math.random() * 11);
        int numInformado = 0;
        do{
            System.out.println(numAleatorio);
            System.out.println("Informe um palpite");
            numInformado = sc.nextInt();
        }while(numInformado != numAleatorio);
        System.out.println("Parabéns!!");

        System.out.println("-----------Exercícios 15-----------");
        System.out.println("Informe um número: ");
        double numTabuada = sc.nextDouble();
        for(int i_15=1; i_15<=10; i_15++){
            System.out.println(numTabuada+" x "+i_15+" = "+numTabuada*i_15);
        }

        System.out.println("-----------Exercícios 16-----------");
        System.out.println("Informe um número: ");
        double x = sc.nextDouble();
        System.out.println(dobro(x));

        System.out.println("-----------Exercícios 17-----------");
        System.out.println("Informe dois números: ");
        double num1_10 = sc.nextDouble();
        double num2_10 = sc.nextDouble();
        System.out.println(retornaMaior(num1_10, num2_10));

        System.out.println("-----------Exercícios 18-----------");
        System.out.println("Digite a senha: ");
        String senha_18 = sc.next();
        System.out.println(validaSenha(senha_18));

        System.out.println("-----------Exercícios 19-----------");
        String[] pessoas = {
            "João, 25", 
            "Maria, 30", 
            "Pedro, 22"
        };

        Path caminhoArquivo = Paths.get("pessoas.txt");

        try {
            Files.write(caminhoArquivo, Arrays.asList(pessoas));
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }

        System.out.println("-----------Exercícios 20-----------");
        Path caminhoArquivo2 = Paths.get("pessoas.txt");

        try {
            String conteudo = new String(Files.readAllBytes(caminhoArquivo2));

            String[] palavras = conteudo.split("[\\s,;.!?\\-\\r\\n]+");

            int numeroDePalavras = palavras.length;

            System.out.println("O arquivo contém " + numeroDePalavras + " palavras.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
        sc.close();
    }
    public static double dobro(double x){
        return x*=2;
    }
    public static double retornaMaior(double num1, double num2){
            if(num1 > num2){
                return num1;
            }else{
                return num2;
            }
    }
    public static boolean validaSenha(String senha){
        if(senha.length() < 8){
            return false;
        }
        boolean temNumero = false;
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
                temNumero = true;
                break;
            }
        }
        return temNumero;
    }
}