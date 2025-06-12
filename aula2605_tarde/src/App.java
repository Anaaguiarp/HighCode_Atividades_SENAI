public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--------------------Exercício 1--------------------");
        Gato gato = new Gato("Jonas",5);
        Gato gato2 = new Gato("Bartolomeu", 2);
        System.out.println(gato.toString());
        gato.defineRaca("Siamês");
        System.out.println("\n"+gato.toString());
        System.out.println("É gatinho? " + (gato.ehGatinho() ? "Sim" : "Não"));
        gato.definePeso(2);
        System.out.println("\n"+gato.toString());
        gato.comparaIdades(gato2);

        System.out.println("\n--------------------Exercício 2--------------------");
        Cachorro c1 = new Cachorro("Totó", "Branco");
        c1.latir();
        c1.latir();
        System.out.println("Está treinando? " + (c1.treinando(true) ? "Sim" : "Não"));
        System.out.println("Está treinando? " + (c1.treinando(false) ? "Sim" : "Não"));
        Cachorro c2 = new Cachorro("Mel", "Marrom");
        c1.comparaCores(c2);
        System.out.println("A raça é grande? "+(c1.ehGrande(false) ? "Sim" : "Não"));

        System.out.println("\n--------------------Exercício 3--------------------");
        Livro livro = new Livro("'Grande sertão: Veredas'", "Guimarães Rosa", 54.7);
        System.out.println(livro.toString());
        int[] notas = {5,3,4,2,3,4};
        System.out.println("É best-seller? "+(livro.verificaBestSeller(true) ? "Sim" : "Não"));
        System.out.println("Classificação: "+livro.calculaClassificacao(notas));

        System.out.println("\n--------------------Exercício 4--------------------");
        Estudante estudante = new Estudante(1, "João", new double[]{2,9,7,8,9,5});
        Estudante estudante2 = new Estudante(2, "Maria", new double[]{8,7,7,8,9,5});
        System.out.println("\n\n"+estudante.toString());
        estudante.implementarSeries(2);
        estudante.verificaFrequencia(80, 60);
        estudante.verificaAprovacao();
        System.out.println("\n\n"+estudante2.toString());
        estudante2.implementarSeries(3);
        estudante.verificaFrequencia(80, 75);
        estudante2.verificaAprovacao();
        estudante.comparaNotas(estudante2);
        
        System.out.println("\n--------------------Exercício 5--------------------");
        Retangulo retangulo = new Retangulo(5, 2);
        System.out.println(retangulo.toString());
        System.out.println("Área do retângulo: "+retangulo.retornaArea()+"\n");
        Retangulo retangulo2 = new Retangulo(retangulo);
        System.out.println(retangulo2.toString());
        Retangulo retangulo3 = new Retangulo(3, 2);
        System.out.println(retangulo3.toString());
        retangulo.comparaRetangulos(retangulo3);
        retangulo3.modificarRetangulo(5, 3);
        System.out.println(retangulo3.toString());
        System.out.println("É quadrado? "+(retangulo3.ehQuadrado() ? "Sim" : "Não"));

        System.out.println("\n--------------------Exercício 6--------------------"); 
        Conta conta1 = new Conta(654213, 200.0);
        conta1.depositar(500);
        conta1.sacar(1000);
        System.out.println(conta1.toString());
        conta1.calculaJuros(200,10);
        System.out.println(conta1.verHistorico());
        conta1.verificaSaldoMinimo(1000);
    }
}