public class Calcular {
    public static final double PI = 3.14159;

    public static double calcularCircunferencia(double raio){
        return 2 * PI * raio;
    }

    public static double calcularVolume(double raio){
        return 4 * PI * Math.pow(raio, 3) / 3;
    }
}
