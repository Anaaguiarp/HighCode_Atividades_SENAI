public class Moto extends Veiculo {
    public Moto(String modelo, int ano, double distanciaPercorrida){
        super(modelo, ano, distanciaPercorrida);
    }

    public double calcularConsumo(double valorCombustivel){
        return valorCombustivel * 30000;
    }
}