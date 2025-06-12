public class Retangulo {
    public double largura;
    public double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(double largura){
        this.largura = largura;
        this.altura = largura;
        System.out.println("O retângulo é um quadrado!");
    }
    
    public double calcularArea(){
        return this.largura * altura;
    }

    public String toString(){
        return "Largura: "+this.largura+
                "\nAltura: "+this.altura;
    }
}
