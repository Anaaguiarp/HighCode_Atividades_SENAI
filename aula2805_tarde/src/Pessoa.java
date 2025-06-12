import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private String pais;
    private ArrayList<String> historicoPaises;

    public Pessoa(){
        this.historicoPaises = new ArrayList<>();
    }

    public Pessoa(String nome, int idade, String pais){
        setNome(nome);
        this.idade = idade;
        this.pais = pais;
        this.historicoPaises = new ArrayList<>();
        historicoPaises.add(pais);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode estar vazio!");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String outroPais) {
        this.pais = outroPais;
        historicoPaises.add(outroPais);
    }

    public ArrayList<String> getHistoricoPaises() {
        return new ArrayList<>(historicoPaises);
    }

    public void setHistoricoPaises(ArrayList<String> historicoPaises) {
        this.historicoPaises = historicoPaises;
    }

    public boolean validaMaiorDeIdade() {
        if (this.idade < 0) {
            System.out.println("Idade inválida!");
        }
        if (this.idade >= 18) {
            System.out.println("Maior de Idade!");
            return true;
        } else {
            System.out.println("Menor de idade!");
            return false;
        }
    }

    public void nomeMaiuscula(){
        System.out.println("Nome completo: "+this.nome.toUpperCase());
    }

    public String toString(){
        return "\nNome: "+this.nome+
                "\nIdade: "+this.idade+
                "\nPaís: "+this.pais;
    }
}