import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--------------------Exercício 1--------------------");
        Conta conta1 = new Conta(568797, "Adriana de Souza", "");
        System.out.println(conta1.toString());
        Conta conta2 = new Conta(989660, "Leonardo Gouveia Sebastião", "");
        System.out.println(conta2.toString());
        conta2.sacar(100);
        System.out.println(conta2.toString());
        conta2.sacar(100);
        System.out.println(conta2.toString());

        System.out.println("\n--------------------Exercício 2--------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("_____________CADASTRO DE CONTA BANCÁRIA_____________");
        System.out.println("Informe o número da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Informe o nome do titular");
        String titular = sc.next();
        System.out.println("Informe uma senha:");
        String senha = sc.next();
        Conta conta3 = new Conta(numConta, titular, senha);
        System.out.println("Deseja realizar um depósito inicial? \n1 - Sim\n2 - Não");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Informe o valor que deseja depositar: ");
                double deposito = sc.nextDouble();
                conta3.depositar(deposito);
                break;
            case 2:
                break;
            default:
                System.out.println("Informe uma opção válida!");
                break;
        }

        System.out.println(conta3.toString());

        System.out.println("_________________LOGIN_________________");
        int i = 0, tentativasLogin = 0;
        boolean loginSucesso = false;
        while (i < 3 || !loginSucesso) {
            System.out.println("Informe o número da conta: ");
            int numContaDigitado = sc.nextInt();
            System.out.println("Informe a senha: ");
            String senhaDigitada = sc.next();
            conta3.validarLogin(numContaDigitado, senhaDigitada);
            i++;
            if (conta3.validarLogin(numContaDigitado, senhaDigitada) == false) {
                tentativasLogin++;
                System.out.println("Número da Conta ou Senha incorretos! Você tentou "+i+" vezes de 3.");
                if(tentativasLogin == 3){
                    System.out.println("Conta bloqueada devido ao excesso de tentativas!");
                    return;
                }
            }else{
                System.out.println("Seja bem-vindo!");
                loginSucesso = true;
                break;
            }
        }
        
        do{
            System.out.println("\n________________MENU________________");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Ver Saldo ");
            System.out.println("2 - Depositar ");
            System.out.println("3 - Sacar ");
            System.out.println("4 - Alterar Nome do Titular ");
            System.out.println("5 - Mostrar detalhes da conta ");
            System.out.println("6 - Sair");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.printf("Saldo: %.2f", conta3.getSaldo());
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar?");
                    double deposito = sc.nextDouble(); 
                    conta3.depositar(deposito);
                    break;
                case 3:
                    System.out.println("Quanto deseja sacar?");
                    double saque = sc.nextDouble();
                    conta3.sacar(saque);
                    break;
                case 4:
                    System.out.println("Qual o novo nome do titular? ");
                    titular = sc.next();
                    conta3.setTitular(titular);
                    break;
                case 5:
                    System.out.println(conta3.toString());
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }while (opc != 6);
        sc.close();
    }
}