import java.util.ArrayList;
import java.util.Arrays;

public class Cachorro {
    private String nome;
    private String raca;
    private int ID;
    private static int contadorID = 1;
    private static ArrayList<Cachorro> listaCachorros = new ArrayList<>();
    private int contadorLatidos;
    private static final ArrayList<String> racasValidas = new ArrayList<>(Arrays.asList("Pastor Alemão", "Bulldog", "Labrador", "Poodle", "Beagle", "Shih Tzu"));


    public Cachorro(String nome, String raca){
        this.nome = nome;
        setRaca(raca);
        this.ID = contadorID++;
        listaCachorros.add(this);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        for (String racaValida : racasValidas) {
            if(racaValida.equalsIgnoreCase(raca)){
                this.raca = racaValida;
                return;
            }
        }
        System.out.println("Raça inválida!");
    }

    public int getID() {
        return ID;
    }

    public static ArrayList<Cachorro> getListaCachorros() {
        return listaCachorros;
    }

    public static void setListaCachorros(ArrayList<Cachorro> listaCachorros) {
        Cachorro.listaCachorros = listaCachorros;
    }

    public int getContadorLatidos() {
        return contadorLatidos;
    }
    
    public void setContadorLatidos(int contadorLatidos) {
        this.contadorLatidos = contadorLatidos;
    }

    public static ArrayList<String> getRacasValidas(){
        return racasValidas;
    }

    public static Cachorro LocalizaID(int id){
        for (Cachorro c : listaCachorros) {
            if(c.getID() == id){
                return c;
            }
        }
        return null;
    }

    public void latir(){
        this.contadorLatidos++;
        System.out.println("Quantidade de latidos: "+this.contadorLatidos);
    }

    public String toString(){
        return "\nID: "+this.ID+
                "\nNome: "+this.nome+
                "\nRaça: "+this.raca+
                "\nQuantidade de Latidos: "+this.contadorLatidos;
    }
}