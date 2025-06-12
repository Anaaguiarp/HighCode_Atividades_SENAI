import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--------------------Exercício 1--------------------");
        int opc = 0;
        Restaurante restaurante = new Restaurante();
        do{
            System.out.println("============ OPÇÕES ============");
            System.out.println("1 - Cadastrar Restaurante\n2 - Adicionar Pratos ao Restaurante\n3 - Listar Pratos Disponíveis\n4 - Sair");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Qual o nome do restaurante? ");
                    sc.nextLine();
                    restaurante.setNome(sc.nextLine());
                    System.out.println("Qual o tipo de culinária do restaurante? ");
                    sc.nextLine();
                    restaurante.setTipoDeCulinaria(sc.nextLine());

                    break;
                case 2:
                    Prato prato = new Prato();
                    System.out.println("Qual o nome do prato? ");
                    sc.nextLine();
                    prato.setNomePrato(sc.nextLine());
                    System.out.println("Qual o preço do prato? ");
                    prato.setPreco(sc.nextDouble());
                    System.out.println("Qual o tipo do prato? \n1 - ENTRADA\n2 - PRINCIPAL\n3 - SOBREMESA");
                    int opcTipoPrato = sc.nextInt();
                    switch (opcTipoPrato) {
                        case 1:
                            prato.setTipo(TipoPrato.ENTRADA);
                            break;
                        case 2:
                            prato.setTipo(TipoPrato.PRINCIPAL);
                            break;
                        case 3:
                            prato.setTipo(TipoPrato.SOBREMESA);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    restaurante.addPrato(prato);
                    break;
                case 3:
                    System.out.println("LISTA DE PRATOS DISPONÍVEIS:\n");
                    restaurante.listarPratos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opc != 4);

        sc.close();
    }
}