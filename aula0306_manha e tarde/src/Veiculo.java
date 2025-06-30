public abstract class Veiculo {
    private String modelo;
    private int ano;
    private double distanciaPercorrida;

    public Veiculo(String modelo, int ano, double distanciaPercorrida) {
        this.modelo = modelo;
        this.ano = ano;
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public abstract double calcularConsumo(double valorCombustivel);

}