import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--------------------Exercício 1--------------------");
        Pessoa pessoa1 = new Pessoa("Adriana", 23);
        System.out.println(pessoa1.toString());
        Pessoa pessoa2 = new Pessoa("José", 45);
        System.out.println(pessoa2.toString());
        pessoa1.comparaIdades(pessoa2);

        ClonePessoa pessoa3 = new ClonePessoa("Isaías", 19, "Rua Laringologista Nunes, 300");
        System.out.println(pessoa3.toString());
        ClonePessoa pessoa4 = new ClonePessoa("Patricia", 20, "Rua Moises Ribeiro, 138");
        System.out.println(pessoa4.toString());
        pessoa3.comparaIdades(pessoa4);
        pessoa3.comparaEndereco(pessoa4);
        
        System.out.println("\nClone: \n"+pessoa4.clone());
        System.out.println(pessoa4.toString());

        System.out.println("\n--------------------Exercício 2--------------------");
        Cachorro c1 = new Cachorro("Tobi", "Pastor Alemão");
        System.out.println(c1.toString());
        Cachorro c2 = new Cachorro("Thor", "Shih tzu");
        System.out.println(c2.toString());
        System.out.println("Lista de Cachorros: \n"+Cachorro.getListaCachorros()+"\n");

        c1.latir();
        c1.latir();
        c2.latir();

        System.out.println("\n--------------------Exercício 3--------------------");
        Retangulo retangulo = new Retangulo(5, 6);
        System.out.println("Área: "+retangulo.Area());
        System.out.println("Perímetro: "+retangulo.Perimetro());
        Retangulo retangulo2 = new Retangulo(4, 5);
        System.out.println("Retângulo é maior que Retângulo (parâmetro)? "+(retangulo.comparaTamanhoRetangulo(retangulo2) ? "Sim" : "Não"));
        System.out.println("É possível sobrepor? "+(retangulo.sobreposicaoRetangulo(retangulo2) ? "Sim" : "Não"));

        System.out.println("\n--------------------Exercício 4--------------------");
        Funcionario funcionario = new Funcionario("Joana", "Analista", 3000, 2);
        Funcionario funcionario2 = new Funcionario("Adriano", "Supervisor", 4000, 4);
        Funcionario funcionario3 = new Funcionario("Luciana", "Analista Sênior", 6000, 6);

        System.out.println(Funcionario.getMaiorSalario());
        System.out.println("Bônus ("+funcionario.getNome()+"): "+funcionario.calcularBonus());
        funcionario2.atualizaSalario(5);
        funcionario3.salarioLiquido(10);

        System.out.println("\n--------------------Exercício 5--------------------");
        Banco banco = new Banco();
        
        Conta conta1 = new Conta("36454546", "Juliana", 500, false, 2500);
        Conta conta2 = new Conta("65462131", "Inês", 100, false, 1500);
        Conta conta3 = new Conta("49862132", "Isabela", 200, false, 2000);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);

        banco.depositar("36454546", 500);
        banco.sacar("36454546", 200);
        banco.transferir("36454546", "65462131", 200);
        banco.sacar("49862132", 300);

        banco.exibirHistorico("36454546");
        banco.exibirTop3Contas();

        System.out.println("\n--------------------Exercício 6--------------------");
        TrafficLight trafficLight = new TrafficLight("Amarelo", 10);
        trafficLight.VerificaCor("Verde");
        trafficLight.iniciarContagem();
        trafficLight.mudarCorComDuracaoAleatoria("Vermelho");
        trafficLight.ajustarPorDensidade(5);
        Cruzamento cruzamento = new Cruzamento();

        cruzamento.simular(5);

        System.out.println("\n--------------------Exercício 7--------------------");
        Funcionario2 f = new Funcionario2();
        f.setNome("Carlos Souza");
        f.setSalario(4500);
        f.setDataContratacao("2018-05-20"); // yyyy-MM-dd

        System.out.println("Anos de serviço: " + f.calcularAnosServico());
        System.out.println("Meses para próxima promoção: " + f.mesesParaProximaPromocao());
        System.out.println("Bônus: R$ " + String.format("%.2f", f.calcularBonus()));

        f.adicionarCargoAnterior("Assistente", 2);
        f.adicionarCargoAnterior("Analista", 3);

        System.out.println(f);

        System.out.println("Anos até aposentadoria (idade 40, aposenta 65): " + f.anosParaAposentadoria(40, 65));

        System.out.println("\n--------------------Exercício 8--------------------");
        Aluno aluno = new Aluno("Mariana", LocalDate.of(2023, 3, 1), 48);

        aluno.adicionarCurso("Matemática", 8.5);
        aluno.adicionarCurso("Física", 7.2);
        aluno.adicionarCurso("História", 6.8);

        aluno.registrarFrequencia(100, 85);

        System.out.println(aluno);

        aluno.removerCurso("História");

        System.out.println("\nDepois de remover História:");
        System.out.println(aluno);

        System.out.println("\n--------------------Exercício 9--------------------");
        Biblioteca bib = new Biblioteca();

        bib.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        bib.adicionarLivro(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"));
        bib.adicionarLivro(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling"));

        bib.listarLivros();

        System.out.println("\nBuscando 'harry':");
        for (Livro l : bib.buscarLivro("harry")) {
            System.out.println(l);
        }

        bib.removerLivro("Dom Casmurro");
        bib.listarLivros();

        System.out.println("\n--------------------Exercício 10--------------------");
        Aviao voo = new Aviao("AB1234", "São Paulo", LocalTime.of(14, 30), 180, 185, 900, 1500, 5000, 3);

        System.out.println(voo);

        System.out.println("Rota: " + voo.sugerirRotaAlternativa(true));

    }
}