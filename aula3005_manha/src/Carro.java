public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String nome, int ano, int numPortas){
        super(nome, ano);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}