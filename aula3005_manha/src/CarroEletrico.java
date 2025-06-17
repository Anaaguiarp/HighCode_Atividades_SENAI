public class CarroEletrico extends VeiculoEletrico {
    private int autonomia; // em km

    public CarroEletrico(String modelo, double capacidadeBateria, int autonomia) {
        super(modelo, capacidadeBateria);
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return autonomia;
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando bateria do carro elétrico " + getModelo() + "...");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autonomia: " + autonomia + " km");
    }
}