public abstract class VeiculoEletrico {
    private String modelo;
    private double capacidadeBateria; // em kWh

    public VeiculoEletrico(String modelo, double capacidadeBateria) {
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    // Método abstrato que deve ser implementado por cada veículo elétrico
    public abstract void carregarBateria();

    // Método concreto
    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo + ", Capacidade da bateria: " + capacidadeBateria + " kWh");
    }
}
