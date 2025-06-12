import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComplexInitializer {
    public static int x;
    public static int y;
    public static int z;

    public static List<String> connectionPool;

    public static List<String> cacheDados;

    public static byte[] sementeCriptografica;

    public static int valorDinamico;

    static {
        System.out.println("Inicializando variáveis estáticas...");

        x = (int) (Math.random() * 100);
        y = (int) (System.currentTimeMillis() % 100);
        z = x + y;

        connectionPool = new ArrayList<>();
        connectionPool.add("Conexao_1");
        connectionPool.add("Conexao_2");
        connectionPool.add("Conexao_3");

        cacheDados = new ArrayList<>();
        cacheDados.add("Dado1");
        cacheDados.add("Dado2");
        cacheDados.add("Dado3");

        SecureRandom sr = new SecureRandom();
        sementeCriptografica = new byte[16];
        sr.nextBytes(sementeCriptografica);

        int cores = Runtime.getRuntime().availableProcessors();
        long memoria = Runtime.getRuntime().maxMemory() / (1024 * 1024);
        valorDinamico = cores * (int) memoria;

        System.out.println("Inicialização completa.");
    }
}