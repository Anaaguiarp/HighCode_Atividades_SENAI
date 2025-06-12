public class Retangulo extends FormaGeometrica{

    public Retangulo(double altura, double largura){
        super(altura, largura);
    }

    @Override
    public void calcularArea(){
        System.out.println("Área do RetÂngulo: "+(getAltura() * getLargura()));
    }
}
