public class MotoEletrica extends VeiculoEletrico {
    private boolean possuiABS;

    public MotoEletrica(String modelo, double capacidadeBateria, boolean possuiABS) {
        super(modelo, capacidadeBateria);
        this.possuiABS = possuiABS;
    }

    public boolean isPossuiABS() {
        return possuiABS;
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando bateria da moto elétrica " + getModelo() + "...");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Possui ABS: " + (possuiABS ? "Sim" : "Não"));
    }
}