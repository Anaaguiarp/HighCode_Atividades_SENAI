public class Pessoa {
    private String nome;
    private int idade;
    private static int contador = 0;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        contador++;
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

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pessoa.contador = contador;
    }

    public void comparaIdades(Pessoa outraPessoa){
        if(this.idade > outraPessoa.idade){
            System.out.println(this.nome + " é mais velho que " + outraPessoa.nome);
        }else if(this.idade < outraPessoa.idade){
            System.out.println(outraPessoa.nome + " é mais velho que " + this.nome);
        }else{
            System.out.println(this.nome + " e " + outraPessoa.nome + " têm a mesma idade");
        }
    }

    @Override
    public String toString(){
        return "Nome: "+this.nome+
                "\nIdade: "+this.idade+
                "\nQuantidade de pessoas registradas até o momento: "+contador;

    }

    @Override
    public Pessoa clone(){
        return new Pessoa(nome, idade);
    }
}