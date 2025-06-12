public class ClonePessoa extends Pessoa{
    private String endereco;

    public ClonePessoa(String nome, int idade, String endereco){
        super(nome, idade);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void comparaEndereco(ClonePessoa comEndereco){
        if(this.endereco == null && comEndereco.endereco == null){
            throw new IllegalArgumentException("O endereço não pode ser nulo!");
        }else{
            if(this.endereco.replaceAll("[\\s,]", "").trim().equals(comEndereco.endereco)){
                System.out.println("Usuários com o mesmo endereço!");
            }else{
                System.out.println("Usuários possuem endereços divergentes!");
            }
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nEndereço: " + this.endereco;
    }
}