public class Retangulo {
    public double altura;
    public double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double area(){
        return this.altura * this.largura; 
    }

    public double perimetro(){
        return 2 * (this.altura + this.largura);
    }
}
