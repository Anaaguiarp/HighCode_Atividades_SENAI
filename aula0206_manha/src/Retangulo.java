public class Retangulo {
    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double Area(){
        return this.largura * this.altura;
    }

    public double Perimetro(){
        return 2 * (this.largura + this.altura);
    }

    public boolean comparaTamanhoRetangulo(Retangulo outroRetangulo){
        if(outroRetangulo.Area() < Area()){
            return true;
        }else{
            return false;
        }
    }

    public boolean sobreposicaoRetangulo(Retangulo outroRetangulo){
        if(outroRetangulo.Area() == Area()){
            return true;
        }else{
            return false;
        }
    }
}