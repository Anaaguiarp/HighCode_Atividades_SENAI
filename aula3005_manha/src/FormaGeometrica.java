public abstract class FormaGeometrica {
    private double altura;
    private double largura;

    public FormaGeometrica(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public abstract void calcularArea();
}