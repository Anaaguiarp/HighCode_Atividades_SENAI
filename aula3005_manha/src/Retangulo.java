public class Retangulo extends FormaGeometrica{
    public Retangulo(double altura, double largura){
        super(altura, largura);
    }

    @Override
    public double calcularArea(){
        return getAltura() * getLargura();
    }

    @Override
    public String toString(){
        return "Retângulo - Altura: " + getAltura() + ", Largura: " + getLargura() + ", Área: " + calcularArea();
    }
}