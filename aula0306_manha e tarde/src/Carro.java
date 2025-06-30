public class Carro extends Veiculo{
    public Carro(String modelo, int ano, double distanciaPercorrida){
        super(modelo, ano, distanciaPercorrida);
    }
    
    public double calcularConsumo(double valorCombustivel){
        return valorCombustivel * 15000;
    }
}