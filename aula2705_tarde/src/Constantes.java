public class Constantes {
    public static final double PI = 3.14159;
    public static final double CONSTANTE_DE_PITAGORAS = 1.4142135;
    public static final double CONSTANTE_DE_LIOUVILLE = 0.1100010;
    public static final double NUMERO_DE_EULER = 2.71828;
    public static final double MILES_TO_KM = 1.60934;
    public static final double METERS_TO_CM = 100;
    public static final double GRAVIDADE_TERRA = 9.80665;
    public static final double VELOCIDADE_DA_LUZ = 299_792_458;
    public static final double CONSTANTE_GRAVITACIONAL = 6.67430e-11;
    private static final String CURSO_NOME = "Curso de Java e .NET";
    private static final String ALUNO = "Ana Carolina Aguiar Pereira";

    public static void calcularArea(double raio){
        double area = PI * Math.pow(raio, 2);
        System.out.println("Área: "+area);
    }

    public static void exibirContantes(){
        System.out.println("Constante de Pitágoras: "+CONSTANTE_DE_PITAGORAS);
        System.out.println("Constante de Liouville: "+CONSTANTE_DE_LIOUVILLE);
        System.out.println("Número de Euler: "+NUMERO_DE_EULER);
    }

    public static double milhasParaKm(double milhas){
        return milhas * MILES_TO_KM;
    }

    public static double metrosParaCM(double metros){
        return metros * METERS_TO_CM;
    }

    public static void contantesFisicas(){
        System.out.println("Gravidade da Terra: "+GRAVIDADE_TERRA);
        System.out.println("Velocidade da Luz: "+VELOCIDADE_DA_LUZ);
        System.out.println("Constante Gravitacional: "+CONSTANTE_GRAVITACIONAL);
    }

    public static String getCursoNome(){
        return CURSO_NOME;
    }

    public static String getAluno(){
        return ALUNO;
    }
}
