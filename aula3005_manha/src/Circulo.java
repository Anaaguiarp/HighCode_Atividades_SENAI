public class Circulo extends FormaGeometrica {
    public Circulo(double raio){
        super(raio, 0);
    }

    @Override
    public double calcularArea(){
        double raio = getAltura();
        return Math.PI * raio * raio;
    }

    @Override
    public String toString(){
        return "Círculo - Raio: " + getAltura() + ", Área: " + calcularArea();
    }
}