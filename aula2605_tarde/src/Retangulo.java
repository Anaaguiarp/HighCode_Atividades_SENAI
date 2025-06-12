public class Retangulo {
    public double comprimento;
    public double largura;

    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public Retangulo(Retangulo outroRetangulo){
        this.comprimento = outroRetangulo.comprimento;
        this.largura = outroRetangulo.largura;
    }

    public double retornaArea(){
        return comprimento * largura;
    }

    public void comparaRetangulos(Retangulo outrRetangulo){
        if(outrRetangulo.comprimento == this.comprimento && outrRetangulo.largura == this.largura){
            System.out.println("Os retângulos são iguais!");
        }else{
            System.out.println("Os retângulos NÃO são iguais!");
        }
    }

    public void modificarRetangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public boolean ehQuadrado(){
        return this.comprimento == this.largura;
    }

    public String toString(){
        return "Comprimento: "+this.comprimento+
                "\nLargura: "+this.largura+"\n";
    }
}
