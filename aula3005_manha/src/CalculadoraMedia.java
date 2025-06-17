public class CalculadoraMedia {

    public double calcularMedia(int[] numeros) {
        if (numeros.length == 0) return 0;
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return (double) soma / numeros.length;
    }

    public double calcularMedia(double[] numeros) {
        if (numeros.length == 0) return 0;
        double soma = 0;
        for (double n : numeros) {
            soma += n;
        }
        return soma / numeros.length;
    }

    public float calcularMedia(float[] numeros) {
        if (numeros.length == 0) return 0;
        float soma = 0;
        for (float n : numeros) {
            soma += n;
        }
        return soma / numeros.length;
    }
}