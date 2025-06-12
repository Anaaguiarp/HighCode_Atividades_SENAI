import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuracao {
    public static String configValue;
    public static String configValue2;
    public static String configValue3;
    public static String curso;
    public static String aluno;
    public static String ambiente;
    public static String databaseUrl;
    public static String apiKey;

    static {
        configValue = "valor padrão";
        System.out.println("ConfigValue: "+configValue);
    }

    static {
        configValue2 = "valor 2";
        System.out.println("ConfigValue2: "+configValue2);
    }

    static {
        configValue3 = "valor 3";
        System.out.println("ConfigValue3: "+configValue3);
    }

    public static void mostrarConfiguracao(){
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("arquivo.properties")) {
            props.load(fis);
            curso = props.getProperty("curso");
            aluno = props.getProperty("aluno");
        } catch (IOException e) {
            System.out.println("Erro ao carregar propriedades: " + e.getMessage());
            curso = "Indefinido";
            aluno = "Desconhecido";
        }
        System.out.println("Configuração carregada: \nCurso " + curso + ", Aluno " + aluno);
    }

    static {
        ambiente = System.getProperty("ambiente", "dev");

        switch (ambiente) {
            case "dev":
                databaseUrl = "jdbc:mysql://localhost:3306/devdb";
                apiKey = "DEV-1234";
                break;
            case "test":
                databaseUrl = "jdbc:mysql://localhost:3306/testdb";
                apiKey = "TEST-5678";
                break;
            case "prod":
                databaseUrl = "jdbc:mysql://prodserver:3306/proddb";
                apiKey = "PROD-9999";
                break;
            default:
                databaseUrl = "jdbc:mysql://localhost:3306/defaultdb";
                apiKey = "DEFAULT-0000";
        }

        System.out.println("Ambiente detectado: " + ambiente);
        System.out.println("Banco de Dados: " + databaseUrl);
        System.out.println("API Key: " + apiKey);
    }
}