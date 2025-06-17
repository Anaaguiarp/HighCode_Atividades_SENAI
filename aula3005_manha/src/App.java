public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--------------------Exercício 1--------------------");
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        gato.emitirSom();
        cachorro.emitirSom();

        System.out.println("\n--------------------Exercício 2--------------------");
        Veiculo carro = new Carro("Fiat", 2021, 4);
        Veiculo moto = new Moto("Honda", 2023, "monocilíndrico");

        System.out.println(carro.toString());
        System.out.println(moto.toString());

        System.out.println("\n--------------------Exercício 3--------------------");
        FormaGeometrica retangulo = new Retangulo(5, 3);
        FormaGeometrica triangulo = new Triangulo(6, 3);
        FormaGeometrica circulo = new Circulo(3);

        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        System.out.println("Área do Círculo: " + circulo.calcularArea());

        System.out.println("\n--------------------Exercício 4--------------------");
        Pessoa pessoa = new Pessoa("João", 40);
        Estudante estudante = new Estudante("Maria", 20, 12345);

        System.out.println("Pessoa:");
        System.out.println(pessoa.toString());

        System.out.println("\nEstudante:");
        System.out.println(estudante.toString());

        System.out.println("\n--------------------Exercício 5--------------------");
        ContaCorrente cc = new ContaCorrente("João Silva", "1234-5", 1000.0, 500.0);
        ContaPoupanca cp = new ContaPoupanca("Maria Souza", "9876-5", 2000.0, 0.5);

        System.out.println(cc.toString());
        System.out.println("Saque de R$ 1200: " + (cc.sacar(1200) ? "Sucesso" : "Falha"));
        System.out.println(cc.toString());

        System.out.println();

        System.out.println(cp.toString());
        cp.aplicarJuros();
        System.out.println("Após aplicação de juros:");
        System.out.println(cp.toString());

        System.out.println("\n--------------------Exercício 6--------------------");
        gato.comer();
        cachorro.comer();

        System.out.println("\n--------------------Exercício 7--------------------");
        Funcionario func = new Funcionario("Carlos", 2000);
        Gerente gerente = new Gerente("Ana", 3000, 1000);
        Vendedor vendedor = new Vendedor("Paulo", 1500, 50000, 5);

        System.out.println(func.getNome() + ": R$ " + func.calcularSalario());
        System.out.println(gerente.getNome() + ": R$ " + gerente.calcularSalario());
        System.out.println(vendedor.getNome() + ": R$ " + vendedor.calcularSalario());

        System.out.println("\n--------------------Exercício 8--------------------");
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3));
        System.out.println(calc.somar(1, 2, 3));
        System.out.println(calc.somar(2.5, 3.7));
        System.out.println(calc.somar(2, 3.5));

        System.out.println("\n--------------------Exercício 9--------------------");
        Carro c1 = new Carro("Fusca", 1975, 2);
        System.out.println(c1.toString());

        System.out.println("\n--------------------Exercício 10--------------------");
        FormaGeometrica c = new Circulo(5);
        FormaGeometrica r = new Retangulo(4, 7);
        FormaGeometrica t = new Triangulo(3, 6);

        System.out.println(c.toString());
        System.out.println(r.toString());
        System.out.println(t.toString());

        System.out.println("\n--------------------Exercício 11--------------------");
        Calculadora calc2 = new Calculadora();

        System.out.println(calc2.somar(2, 3));
        System.out.println(calc2.somar(1, 2, 3));
        System.out.println(calc2.somar(4, 5, 6, 7));
        System.out.println(calc2.somar(1.5, 2.5));
        System.out.println(calc2.somar(5, 2.5)); 

        System.out.println("\n--------------------Exercício 12--------------------");
        CalculadoraVolume calc3 = new CalculadoraVolume();

        double volumeCubo = calc3.calcularVolume(3);
        double volumeCilindro = calc3.calcularVolume(2, 5);

        System.out.println("Volume do cubo: " + volumeCubo);
        System.out.println("Volume do cilindro: " + volumeCilindro);

        System.out.println("\n--------------------Exercício 13--------------------");
        Produto p1 = new Produto("Caneta", 2.5, 100);
        Produto p2 = new Produto("Lápis", 1.0);
        Produto p3 = new Produto("Borracha");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println("\n--------------------Exercício 14--------------------");
        Exibidor exibidor = new Exibidor();

        exibidor.exibir("Olá, mundo!");
        exibidor.exibir(42);
        exibidor.exibir(3.1415);
        exibidor.exibir(new Produto("Caneta", 2.5, 100));

        System.out.println("\n--------------------Exercício 15--------------------");
        CalculadoraMedia calc4 = new CalculadoraMedia();

        int[] numsInt = {1, 2, 3, 4, 5};
        double[] numsDouble = {1.5, 2.5, 3.5};
        float[] numsFloat = {1.2f, 2.4f, 3.6f};

        System.out.println("Média int: " + calc4.calcularMedia(numsInt));
        System.out.println("Média double: " + calc4.calcularMedia(numsDouble));
        System.out.println("Média float: " + calc4.calcularMedia(numsFloat));
/*
        System.out.println("\n--------------------Exercício 16--------------------");
        Animal animal = new Animal();
        animal.emitirSom();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.emitirSom();

        Animal pet = new Cachorro();
        pet.emitirSom();

        System.out.println("\n--------------------Exercício 17--------------------");
        Conta conta1 = new Conta("Jonas", "123456", 150.00);
        System.out.println(conta1.toString());
        System.out.println(cc.toString());
        System.out.println(cp.toString());

        System.out.println("\n--------------------Exercício 18--------------------");
        Pessoa p4 = new Pessoa("Ana", 30);
        Pessoa p5 = new Pessoa("Ana", 30);
        Pessoa p6 = new Pessoa("Carlos", 25);

        System.out.println(p4.equals(p5));
        System.out.println(p4.equals(p6));
        System.out.println(p4.equals(null));

        System.out.println("\n--------------------Exercício 19--------------------");
        Animal animal2 = new Animal();
        animal2.emitirSom();

        Gato gato2 = new Gato();
        gato2.emitirSom();

        Animal pet2 = new Gato();
        pet2.emitirSom();
*/
        System.out.println("\n--------------------Exercício 20--------------------");
        Mensagem boasVindas = new MensagemBoasVindas();
        Mensagem despedida = new MensagemDespedida();

        boasVindas.exibirMensagem();
        despedida.exibirMensagem();

        System.out.println("\n--------------------Exercício 21--------------------");
        Pagamento pagamentoCartao = new PagamentoCartao("1234-5678-9876-5432");
        Pagamento pagamentoPix = new PagamentoPix("meuemail@exemplo.com");

        pagamentoCartao.realizarPagamento(150.0);
        pagamentoPix.realizarPagamento(200.0);

        System.out.println("\n--------------------Exercício 22--------------------");
        Empregado engenheiro = new Engenheiro("Ana", 30, 8000.0, 1500.0);
        Empregado professor = new Professor("Carlos", 45, 100.0, 160);

        System.out.println(engenheiro);
        System.out.println(professor);

        System.out.println("\n--------------------Exercício 23--------------------");
        Veiculo carro2 = new Carro("Fiat Uno", 2010, 4);
        Veiculo moto2 = new Moto("Honda CG", 2015, "Motor 160cc");

        System.out.println(carro2);
        System.out.println(moto2);

        System.out.println("\n--------------------Exercício 24--------------------");
        VeiculoEletrico carro3 = new CarroEletrico("Tesla Model 3", 75, 500);
        VeiculoEletrico moto3 = new MotoEletrica("Zero SR/F", 14.4, true);

        carro3.mostrarInfo();
        carro3.carregarBateria();

        System.out.println();

        moto3.mostrarInfo();
        moto3.carregarBateria();

        System.out.println("\n--------------------Exercício 25--------------------");
        Smartphone smartphone = new Smartphone("Galaxy S21");
        Tablet tablet = new Tablet("iPad Pro");

        smartphone.ligar();
        smartphone.usar();
        smartphone.carregar(10);

        System.out.println();

        tablet.usar();
        tablet.ligar();
        tablet.usar();
        tablet.desligar();

        System.out.println("\n--------------------Exercício 26--------------------");
        Animal[] animais = { new Leao(), new Passaro(), new Elefante() };

        for (Animal a : animais) {
            a.emitirSom();
        }

    }
}