public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--------------------Exercício 1--------------------");
        Contador count = new Contador();
        Contador count2 = new Contador();
        Contador count3 = new Contador();
        System.out.println(count.toString());
        System.out.println(count2.toString());
        System.out.println(count3.toString());

        System.out.println("\n--------------------Exercício 2--------------------");
        System.out.println("Soma: "+MathUtility.add(5, 2));
        System.out.println("Exponenciação: "+MathUtility.exponentiation(2, 3));
        System.out.println("Fatorial: "+MathUtility.factorial(8));
        System.out.println("Máximo: "+MathUtility.maxOfThree(56, 34, 8));

        System.out.println("\n--------------------Exercício 3--------------------");
        System.out.println("Initial Value (antes da instância): "+Inicializador.initialValue);
        System.out.println("Initial Value (depois da instância): "+Inicializador.initialValue);

        System.out.println("\n--------------------Exercício 4--------------------");
        Constantes.calcularArea(5);
        Constantes.exibirContantes();
        System.out.println("Milhas para KM: "+Constantes.milhasParaKm(3)+" KM");
        System.out.println("Metros para CM: "+Constantes.metrosParaCM(5)+" CM");
        Constantes.contantesFisicas();
        System.out.println("Curso: "+Constantes.getCursoNome());
        System.out.println("Aluno: "+Constantes.getAluno());

        System.out.println("\n--------------------Exercício 5--------------------");
        System.out.println(Configuracao.configValue);
        System.out.println(Configuracao.configValue2);
        System.out.println(Configuracao.configValue3);
        Configuracao.mostrarConfiguracao();
        System.out.println("Ambiente em uso: "+ Configuracao.ambiente);

        System.out.println("\n--------------------Exercício 6--------------------");
        System.out.println("ID 1: " + IDGenerator.generateID());
        System.out.println("ID 2: " + IDGenerator.generateID());

        IDGenerator.setPrefixo("USR-");
        System.out.println("ID 3 com prefixo: " + IDGenerator.generateID());

        System.out.println("UUID 1 com prefixo: " + IDGenerator.generateUUID());

        System.out.println("Total de IDs gerados: " + IDGenerator.getTotalGerados());

        IDGenerator.resetIDCounter();
        System.out.println("Após reset:");
        System.out.println("Novo ID: " + IDGenerator.generateID());

        System.out.println("\n--------------------Exercício 7--------------------");
        System.out.println("Valores das variáveis estáticas:");
        System.out.println("x = " + ComplexInitializer.x);
        System.out.println("y = " + ComplexInitializer.y);
        System.out.println("z = " + ComplexInitializer.z);

        System.out.println("\nPool de conexões:");
        for (String c : ComplexInitializer.connectionPool) {
            System.out.println(c);
        }

        System.out.println("\nDados pré-carregados:");
        for (String d : ComplexInitializer.cacheDados) {
            System.out.println(d);
        }

        System.out.println("\nSemente criptográfica (em hex):");
        System.out.print("0x");
        for (byte b : ComplexInitializer.sementeCriptografica) {
            System.out.printf("%02X", b);
        }
        System.out.println();

        System.out.println("\nValor dinâmico calculado (cores * memória MB): " + ComplexInitializer.valorDinamico);

        System.out.println("\n--------------------Exercício 8--------------------");
        ContaBanco conta1 = new ContaBanco(1001, 500.0);
        ContaBanco conta2 = new ContaBanco(1002, 1000.0);

        conta1.depositar(150);
        conta2.sacar(200);

        // Exibir contas antes da mudança do banco
        System.out.println("=== Antes da alteração do banco ===");
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        // Alterar nome do banco por localização
        ContaBanco.setNomeBancoPorLocalizacao("Rio de Janeiro");

        // Atualizar taxa de juros dinamicamente (exemplo multiplicar por 1.1 = aumento de 10%)
        ContaBanco.atualizarTaxaJurosDinamicamente(1.1);

        // Exibir contas após mudanças estáticas
        System.out.println("=== Depois da alteração do banco e taxa de juros ===");
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        // Total de contas criadas
        System.out.println("Total de contas criadas: " + ContaBanco.getTotalContasCriadas());

        // Mostrar transações registradas
        System.out.println("\n=== Histórico de transações ===");
        for (String t : ContaBanco.getTransacoes()) {
            System.out.println(t);
        }

    }
}