public class CalculadoraVolume {

    public double calcularVolume(double lado) {
        return Math.pow(lado, 3);
    }

    public double calcularVolume(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}
