public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pessoa outra = (Pessoa) obj;

        if (nome == null) {
            if (outra.nome != null)
                return false;
        } else if (!nome.equals(outra.nome))
            return false;

        return idade == outra.idade;
    }

    public String toString(){
        return "Nome: " + this.nome + 
                "Idade: " + this.idade;
    }
}