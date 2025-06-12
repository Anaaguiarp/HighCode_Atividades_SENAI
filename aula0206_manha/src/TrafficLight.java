import java.util.Random;

public class TrafficLight {
    private String cor;
    private int duracao;

    public TrafficLight(String corInicial) {
        this.cor = corInicial;
    }

    public TrafficLight(String corInicial, int duracao){
        this.cor = corInicial;
        this.duracao = duracao;
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getDuracao() {
        return this.duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void mudarCor(String novaCor){
        this.cor = novaCor;
    }

    public void VerificaCor(String cor){
        if(cor.equalsIgnoreCase("Vermelho")){
            System.out.println("PARE!");
        }else if(cor.equalsIgnoreCase("Verde")){
            System.out.println("PODE SEGUIR!");
        }else if(cor.equalsIgnoreCase("Amarelo")){
            System.out.println("Atenção!");
        }else{
            System.err.println("Cor inválida! Informe 'Vermelho', 'Verde' ou 'Amarelo'!");
        }
    }

    public void iniciarContagem(){
        System.out.println("Sinal: "+this.cor+"\nTempo em segundos: "+this.duracao);
        for(int i = duracao; i > 0; i--){
            System.out.println("Tempo restante: "+i+" segundos");
        }
    }

    public void mudarCorComDuracaoAleatoria(String novaCor){
    this.cor = novaCor;
    if(novaCor.equalsIgnoreCase("Verde")){
        Random rand = new Random();
        this.duracao = rand.nextInt(11) + 5; // 5 a 15 segundos
    } else {
        // Duracão fixa para outras cores, exemplo:
        if(novaCor.equalsIgnoreCase("Amarelo")) {
            this.duracao = 3;
        } else if(novaCor.equalsIgnoreCase("Vermelho")) {
            this.duracao = 10;
        }
    }
    System.out.println("Cor alterada para " + cor + " com duração " + duracao + " segundos");
    }

    public void ajustarPorDensidade(int densidade) {
        if (densidade > 70) {
            this.cor = "Verde";
            this.duracao = 15;  // maior tempo para liberar tráfego
        } else if (densidade > 30) {
            this.cor = "Amarelo";
            this.duracao = 5;
        } else {
            this.cor = "Vermelho";
            this.duracao = 10;
        }
        System.out.println("Tráfego: " + densidade + "%, sinal ajustado para " + cor + " com duração " + duracao);
    }
}