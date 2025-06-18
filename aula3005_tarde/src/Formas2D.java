abstract class Shape2D {
    protected String cor;

    public Shape2D(String cor) {
        this.cor = cor;
    }

    public abstract void desenhar();
    public abstract void redimensionar(double fator);
    public abstract void girar(double angulo);
}

class Retangulo extends Shape2D {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura, String cor) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo de cor " + cor + " com largura " + largura + " e altura " + altura);
    }

    @Override
    public void redimensionar(double fator) {
        largura *= fator;
        altura *= fator;
        System.out.println("Retângulo redimensionado por fator " + fator + ": nova largura = " + largura + ", nova altura = " + altura);
    }

    public void redimensionarDinamico(double novaLargura, double novaAltura) {
        this.largura = novaLargura;
        this.altura = novaAltura;
        System.out.println("Redimensionado dinamicamente: largura = " + largura + ", altura = " + altura);
    }

    public boolean ehQuadrado() {
        boolean quadrado = largura == altura;
        System.out.println("É quadrado? " + quadrado);
        return quadrado;
    }

    @Override
    public void girar(double angulo) {
        System.out.println("Girando retângulo em " + angulo + " graus.");
    }
}

class Circulo extends Shape2D {
    private double raio;
    private double centroX;
    private double centroY;

    public Circulo(double raio, double centroX, double centroY, String cor) {
        super(cor);
        this.raio = raio;
        this.centroX = centroX;
        this.centroY = centroY;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando círculo de cor " + cor + " com raio " + raio);
    }

    @Override
    public void redimensionar(double fator) {
        raio *= fator;
        System.out.println("Círculo redimensionado por fator " + fator + ": novo raio = " + raio);
    }

    public boolean contemPonto(double x, double y) {
        double distancia = Math.sqrt(Math.pow(x - centroX, 2) + Math.pow(y - centroY, 2));
        boolean dentro = distancia <= raio;
        System.out.println("Ponto (" + x + ", " + y + ") está dentro do círculo? " + dentro);
        return dentro;
    }

    @Override
    public void girar(double angulo) {
        System.out.println("Girando círculo em " + angulo + " graus (sem alteração visual).");
    }
}

public class Formas2D {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(10, 10, "Azul");
        ret.desenhar();
        ret.ehQuadrado();
        ret.redimensionar(1.5);
        ret.redimensionarDinamico(5, 8);
        ret.girar(90);

        System.out.println();

        Circulo circ = new Circulo(5, 0, 0, "Vermelho");
        circ.desenhar();
        circ.contemPonto(3, 4);  // dentro
        circ.contemPonto(6, 0);  // fora
        circ.redimensionar(2);
        circ.girar(45);
    }
}