import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--------------------Exercício 1--------------------");
        Student student = new Student();
        //System.out.println("Informe um nome: ");
        //student.setStudent_name("");
        //student.setStudent_name(sc.next());
        student.addGrade(0, 10);

        System.out.println("\n--------------------Exercício 2--------------------");
        Book book = new Book("1984", "George Orwell", 34.00, 336);

        try {
            book.setGenre("Ficção");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        book.applyDiscount(10);
        List<Double> descontos = List.of(5.0, 5.0);
        book.applyMultipleDiscounts(descontos);
        System.out.println(book.toString());

        System.out.println("\n--------------------Exercício 3--------------------");
        Smartphone smartphone = new Smartphone("Apple", "iPhone 13", 128);

        smartphone.displaySpecifications();

        smartphone.boostStorage(64);
        smartphone.displaySpecifications();

        try {
            smartphone.boostStorage(500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        smartphone.displaySpecifications();

        smartphone.useBattery(50);
        smartphone.displaySpecifications();

        System.out.println("\n--------------------Exercício 4--------------------");
        Desktop desktop = new Desktop("Dell", "Intel i5", 16);
        desktop.displaySpecs();

        desktop.setProcessor("Intel i7");
        desktop.upgradeRam(32);
        desktop.displaySpecs();

        desktop.upgradeRam(32);
        desktop.displaySpecs();

        boolean compat = desktop.isCompatible("Intel i7", 32);
        System.out.println("Compatível com o software? " + (compat ? "Sim" : "Não"));

        desktop.setProcessor("Celeron");

        System.out.println("\n--------------------Exercício 5--------------------");
        House house = new House("Rua das Flores, 123", 3, 120);

        house.setGarage(true);
        house.setPool(false);
        house.setGarden(true);
        house.exibirInformacoes();

        double precoPorMetro = 2500.0;
        System.out.println("\nPreço base: R$" + house.calculaPrice(precoPorMetro));

        double precoReformaPorMetro = 500.0;
        System.out.println("Custo estimado da reforma: R$" + house.estimaCustoReforma(precoReformaPorMetro));

        System.out.println("Preço total com adicionais: R$" + house.calculaPrecoTotalComExtras(precoPorMetro));

        System.out.println("\n--------------------Exercício 6--------------------");
        Account conta = new Account("12345", "João Silva", 1000.0, "senha123");

        System.out.print("Digite a senha para acessar a conta: ");
        String entradaSenha = sc.nextLine();

        if (!conta.autenticar(entradaSenha)) {
            return;
        }

        conta.deposit(500);
        conta.saque(200);
        conta.saque(2000);
        conta.deposit(-50);

        conta.mostrarHistorico();

        double juros = conta.calcularJuros(0.05, 2);
        System.out.println("Juros após 2 anos: R$" + juros);

        System.out.println("Saldo atual: R$" + conta.getBalance());

        System.out.println("\n--------------------Exercício 7--------------------");
        Movie filme = new Movie("Estrelas Além do Tempo", "Theodore Melfi", 148, "Ficção", 35.00);

        filme.incrementViewings();
        filme.incrementViewings();
        filme.incrementViewings();

        System.out.println(filme.getMovieDetails());

        System.out.println("Receita esperada: R$" + filme.calcularReceita());

        Movie filme2 = new Movie("Interstellar", "Christopher Nolan", 169, "Ficção", 40.00);
        Movie filme3 = new Movie("Gladiador", "Ridley Scott", 155, "Ação", 30.00);

        Movie[] lista = { filme, filme2, filme3 };

        System.out.println("\n--- Filmes do gênero 'Ficção' ---");
        Movie.filtrarPorGenero(lista, "Ficção");

        System.out.println("\n--------------------Exercício 8--------------------");
        Product produto = new Product("Mouse Gamer", "M001", 150.00, "Eletrônicos");

        System.out.println("Antes do desconto:");
        System.out.println(produto.getProductDetails());

        produto.applyDiscount(20);

        produto.sell(4);

        System.out.println("\nDepois do desconto:");
        System.out.println(produto.getProductDetails());

        System.out.printf("\nReceita total: R$%.2f\n", produto.calcularReceitaTotal());

        sc.close();
    }
}