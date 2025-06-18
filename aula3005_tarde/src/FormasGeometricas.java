abstract class FormaGeometrica {
    public abstract double area();
    public abstract double perimetro();

    public boolean cabeDentro(FormaGeometrica outraForma) {
        return this.area() <= outraForma.area();
    }
}

class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    public boolean ehQuadradoPerfeito() {
        int raiz = (int) Math.sqrt(lado);
        boolean perfeito = raiz * raiz == lado;
        System.out.println("Quadrado é perfeito? " + perfeito);
        return perfeito;
    }

    public double getLado() {
        return lado;
    }
}

class Triangulo extends FormaGeometrica {
    private double ladoA, ladoB, ladoC;
    private double anguloA, anguloB, anguloC;

    public Triangulo(double ladoA, double ladoB, double ladoC, double anguloA, double anguloB, double anguloC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.anguloA = anguloA;
        this.anguloB = anguloB;
        this.anguloC = anguloC;
    }

    @Override
    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    @Override
    public double perimetro() {
        return ladoA + ladoB + ladoC;
    }

    public boolean ehIsosceles() {
        boolean isosceles = (ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC);
        System.out.println("Triângulo é isósceles? " + isosceles);
        return isosceles;
    }

    public void classificarPorAngulos() {
        if (anguloA < 90 && anguloB < 90 && anguloC < 90) {
            System.out.println("Triângulo acutângulo (todos ângulos agudos).");
        } else if (anguloA == 90 || anguloB == 90 || anguloC == 90) {
            System.out.println("Triângulo retângulo (um ângulo reto).");
        } else {
            System.out.println("Triângulo obtusângulo (um ângulo obtuso).");
        }
    }
}

public class FormasGeometricas {
    public static void main(String[] args) {
        System.out.println("=== Quadrado ===");
        Quadrado q = new Quadrado(16);
        System.out.println("Área: " + q.area());
        System.out.println("Perímetro: " + q.perimetro());
        q.ehQuadradoPerfeito();

        System.out.println("\n=== Triângulo ===");
        Triangulo t = new Triangulo(5, 5, 8, 50, 50, 80);
        System.out.println("Área: " + t.area());
        System.out.println("Perímetro: " + t.perimetro());
        t.ehIsosceles();
        t.classificarPorAngulos();

        System.out.println("\n=== Verificação de Contenção ===");
        boolean cabe = t.cabeDentro(q);
        System.out.println("Triângulo cabe dentro do quadrado? " + cabe);
    }
}