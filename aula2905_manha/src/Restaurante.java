import java.util.ArrayList;

public class Restaurante {
    private String nome;
    private String tipoDeCulinaria;
    private ArrayList<Prato> listaPratosDisponiveis;

    public Restaurante(){
        this.listaPratosDisponiveis = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoDeCulinaria() {
        return this.tipoDeCulinaria;
    }
    public void setTipoDeCulinaria(String tipoDeCulinaria) {
        this.tipoDeCulinaria = tipoDeCulinaria;
    }
    public ArrayList<Prato> getListaPratosDisponiveis() {
        return this.listaPratosDisponiveis;
    }
    public void setListaPratosDisponiveis(ArrayList<Prato> listaPratosDisponiveis) {
        this.listaPratosDisponiveis = listaPratosDisponiveis;
    }

    public void cadastrarRestaurante(String nome, String tipoDeCulinaria){
        this.nome = nome;
        this.tipoDeCulinaria = tipoDeCulinaria;
    }

    public void addPrato(Prato prato){
        listaPratosDisponiveis.add(prato);
        System.out.println("Prato "+ prato.getNomePrato() + " adicionado com sucesso.");
    }

    public void listarPratos(){
        for (Prato prato : listaPratosDisponiveis) {
            System.out.println(prato.exibirPrato());
        }
    }
}
