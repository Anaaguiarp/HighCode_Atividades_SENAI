public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--------------------Exercício 1--------------------");
        System.out.println("Celsius para Fahrenheit: "+ConversorTemperatura.celsiusParaFahrenheit(35));
        System.out.println("Fahrenheit para Celsius: "+ConversorTemperatura.fahrenheitParaCelsius(95));

        System.out.println("\n--------------------Exercício 2--------------------");
        System.out.println("Soma: "+Calculadora.somar(5, 2));
        System.out.println("Subtração: "+Calculadora.subtrair(5, 2));
        System.out.println("Multiplicação: "+Calculadora.multiplicar(5, 0));
        System.out.println("Divisão: "+Calculadora.dividir(5, 2));

        System.out.println("\n--------------------Exercício 3--------------------");
        System.out.printf("Circunferência: %.2f\n", Calcular.calcularCircunferencia(5));
        System.out.printf("Volume: %.2f", Calcular.calcularVolume(5));

        System.out.println("\n--------------------Exercício 4--------------------");
        Carro carro = new Carro();
        carro.exibirInfo();
        Carro carro2 = new Carro("Fiat", "Strada", 2019);
        carro2.exibirInfo();

        System.out.println("\n--------------------Exercício 5--------------------");
        Aluno aluno = new Aluno("José");
        aluno.exibirAluno();
        Aluno aluno2 = new Aluno("Mariana", 36);
        aluno2.exibirAluno();
        Aluno aluno3 = new Aluno("Adriana", 23, "Análise e Desenvolvimento de Sistemas");
        aluno3.exibirAluno();

        System.out.println("\n--------------------Exercício 6--------------------");
        Retangulo retangulo = new Retangulo(5);
        System.out.println(retangulo.toString());
        Retangulo retangulo2 = new Retangulo(5, 3);
        System.out.println("Área: "+retangulo2.calcularArea());

        System.out.println("\n--------------------Exercício 7--------------------");
        ContaBancaria conta = new ContaBancaria("Luiza");
        conta.exibirSaldo();
        ContaBancaria conta2 = new ContaBancaria("Mariana", 500);
        conta2.exibirSaldo();

        System.out.println("\n--------------------Exercício 8--------------------");
        Livro livro = new Livro("Vidas Secas");
        livro.exibirLivro();
        Livro livro2 = new Livro("A bolsa amarela", "Lygia Bojunga");
        livro2.exibirLivro();
        Livro livro3 = new Livro("A Insustentável Leveza do Ser", "Milan Kundera", 1984);
        livro3.exibirLivro();

        System.out.println("\n--------------------Exercício 9--------------------");
        Celular celular = new Celular("Samsung");
        celular.exibirCelular();
        Celular celular2 = new Celular("Nokia", "110 4g (2024)");
        celular2.exibirCelular();
        Celular celular3 = new Celular("Iphone", "11 PRO", 2000);
        celular3.exibirCelular();
    }
}