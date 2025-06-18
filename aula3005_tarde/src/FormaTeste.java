abstract class Forma {

    public abstract void desenhar();

    public abstract double calcularArea();

    public void renderizar3D() {
        System.out.println("Renderizando forma em 3D...");
    }

    public double calcularVolume() {
        return 0;
    }

    public abstract void redimensionar(double fator);

    public abstract boolean pontoDentro(double x, double y, double z);
}

class Circulo extends Forma {
    private double raio;
    private double centroX, centroY;

    public Circulo(double raio, double centroX, double centroY) {
        this.raio = raio;
        this.centroX = centroX;
        this.centroY = centroY;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo com raio " + raio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public void redimensionar(double fator) {
        raio *= fator;
        System.out.println("Raio redimensionado para: " + raio);
    }

    @Override
    public boolean pontoDentro(double x, double y, double z) {
        if (z != 0) return false;
        double distancia = Math.sqrt(Math.pow(x - centroX, 2) + Math.pow(y - centroY, 2));
        return distancia <= raio;
    }
}

class Cilindro extends Forma {
    private double raio;
    private double altura;
    private double centroX, centroY;

    public Cilindro(double raio, double altura, double centroX, double centroY) {
        this.raio = raio;
        this.altura = altura;
        this.centroX = centroX;
        this.centroY = centroY;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um cilindro com raio " + raio + " e altura " + altura);
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * raio * altura + 2 * Math.PI * raio * raio;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * raio * raio * altura;
    }

    @Override
    public void redimensionar(double fator) {
        raio *= fator;
        altura *= fator;
        System.out.println("Raio redimensionado para: " + raio);
        System.out.println("Altura redimensionada para: " + altura);
    }

    @Override
    public boolean pontoDentro(double x, double y, double z) {
        double distancia = Math.sqrt(Math.pow(x - centroX, 2) + Math.pow(y - centroY, 2));
        return (distancia <= raio) && (z >= 0 && z <= altura);
    }
}

public class FormaTeste {
    public static void main(String[] args) {
        Circulo c = new Circulo(5, 0, 0);
        Cilindro cyl = new Cilindro(3, 10, 0, 0);

        System.out.println("=== Círculo ===");
        c.desenhar();
        System.out.println("Área: " + c.calcularArea());
        c.renderizar3D();
        System.out.println("Volume (deve ser 0): " + c.calcularVolume());
        c.redimensionar(2);
        System.out.println("Área após redimensionar: " + c.calcularArea());
        System.out.println("Ponto (3,4,0) dentro? " + c.pontoDentro(3, 4, 0));
        System.out.println("Ponto (6,0,0) dentro? " + c.pontoDentro(6, 0, 0));

        System.out.println("\n=== Cilindro ===");
        cyl.desenhar();
        System.out.println("Área total: " + cyl.calcularArea());
        cyl.renderizar3D();
        System.out.println("Volume: " + cyl.calcularVolume());
        cyl.redimensionar(0.5);
        System.out.println("Área após redimensionar: " + cyl.calcularArea());
        System.out.println("Ponto (2,0,5) dentro? " + cyl.pontoDentro(2, 0, 5));
        System.out.println("Ponto (4,0,5) dentro? " + cyl.pontoDentro(4, 0, 5));
        System.out.println("Ponto (2,0,11) dentro? " + cyl.pontoDentro(2, 0, 11));
    }
}