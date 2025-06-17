public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
    
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public int somar(int... numeros) {
        int total = 0;
        for (int num : numeros) {
            total += num;
        }
        return total;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double somar(int a, double b) {
        return a + b;
    }
}
