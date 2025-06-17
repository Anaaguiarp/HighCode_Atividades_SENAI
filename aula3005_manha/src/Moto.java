public class Moto extends Veiculo {
    private String tipoMotor;

    public Moto(String nome, int ano, String tipoMotor){
        super(nome, ano);
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String toString() {
        return super.toString() + "Tipo do Motor: " + this.tipoMotor;
    }

    
}