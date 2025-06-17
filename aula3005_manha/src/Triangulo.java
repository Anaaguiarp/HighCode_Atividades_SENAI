public class Triangulo extends FormaGeometrica {
    public Triangulo(double altura, double largura){
        super(altura, largura);
    }
    
    @Override
    public double calcularArea(){
        return (getAltura() * getLargura()) / 2;
    }

    @Override
    public String toString(){
        return "Triângulo - Altura: " + getAltura() + ", Base: " + getLargura() + ", Área: " + calcularArea();
    }
}