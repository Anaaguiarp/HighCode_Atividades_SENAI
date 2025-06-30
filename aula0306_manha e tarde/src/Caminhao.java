public class Caminhao extends Veiculo{
    private int qtdToneladas;

    public Caminhao(String modelo, int ano, double distanciaPercorrida, int qtdToneladas){
        super(modelo, ano, distanciaPercorrida);
        this.qtdToneladas = qtdToneladas;
    }

    public int getQtdToneladas() {
        return qtdToneladas;
    }

    public void setQtdToneladas(int qtdToneladas) {
        this.qtdToneladas = qtdToneladas;
    }

    public double calcularConsumo(double valorCombustivel){
        double kmPorLitro = qtdToneladas - (500 * qtdToneladas);
        return valorCombustivel * kmPorLitro;
    }
}