public class Triangulo extends FormaGeometrica {

    public Triangulo(double altura, double largura){
        super(altura, largura);
    }
    
    public void calcularArea(){
        System.out.println("Área do Triângulo: "+((getAltura() * getLargura()) / 2));
    }
}