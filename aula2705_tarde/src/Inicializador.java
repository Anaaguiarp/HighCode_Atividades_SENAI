import java.time.LocalDateTime;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Inicializador {
    public static int initialValue;
    public static LocalDateTime dataHoraInicializacao;
    public static String ambiente;
    public static String bancoDeDados;
    public static String usuario;
    public static String senha;

    static {
        initialValue = 1000;
        System.out.println("Bloco 1: "+initialValue);
    }

    static {
        int valor1 = 10;
        System.out.println("Bloco 2: "+valor1);
    }

    static {
        int valor2 = 20;
        System.out.println("Bloco 3: "+valor2);
    }

    static {
        int valor3 = 30;
        System.out.println("Bloco 4: "+valor3);
    }

    static {
        int valor4 = 40;
        System.out.println("Bloco 5: "+valor4);
    }

    static {
        dataHoraInicializacao = LocalDateTime.now();
        System.out.println("Inicialização em: "+dataHoraInicializacao);
    }

    static {
        ambiente = "dev";
        if(ambiente.equals("dev")){
            bancoDeDados = "localhost:3006/dev_db";
        }else if(ambiente.equals("test")){
            bancoDeDados = "localhost:3006/test_db";
        }else if(ambiente.equals("prod")){
            bancoDeDados = "prod.server.com:3006/prod_db";
        }else{
            System.out.println("Ambiente não encontrado!");
        }

        System.out.println("Ambiente: "+ambiente);
        System.out.println("Banco de Dados:"+bancoDeDados);
    }

    static {
        try{
        BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            if (linha != null) {
                String[] partes = linha.split(",");
                usuario = partes[0];
                senha = partes[1];
            }
            reader.close();
            System.out.println("Usuário: " + usuario);
            System.out.println("Senha: " + senha);
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}