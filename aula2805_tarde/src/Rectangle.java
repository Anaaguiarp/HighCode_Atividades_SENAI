public class Rectangle {
    private double comprimento;
    private double largura;
    private final double proporcao;

    public Rectangle(double comprimento, double largura){
        if(comprimento <= 0){
            throw new IllegalArgumentException("O cumprimento não pode ser negativo!");
        }
        if(largura <= 0){
            throw new IllegalArgumentException("A largura não pode ser negativa!");
        }
        this.comprimento = comprimento;
        this.largura = largura;
        this.proporcao = largura / comprimento;
    }

    public double getComprimento() {
        return this.comprimento;
    }
    public void setComprimento(double comprimento) {
        if(comprimento <= 0){
            throw new IllegalArgumentException("O cumprimento não pode ser negativo!");
        }
        this.comprimento = comprimento;
        this.largura = comprimento * proporcao; 
    }
    public double getLargura() {
        return this.largura;
    }
    public void setLargura(double largura) {
        if(largura <= 0){
            throw new IllegalArgumentException("A largura não pode ser negativa!");
        }
        this.largura = largura;
        this.comprimento = largura / proporcao;
    }

    public boolean ehQuadrado(){
        return comprimento == largura;
    }

    public double comprimentoDiagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(comprimento, 2));
    }

    public void redimencionarPorComprimento(double novoComprimento){
        setComprimento(novoComprimento);
        
    }

    public void redimencionarPelaLargura(double novaLargura){
        setLargura(novaLargura);
        
    }

    public String toString(){
        return "\nComprimento: "+this.comprimento+
                "\nLargura: "+this.largura+
                "\nProporção: "+this.proporcao;
    }
}