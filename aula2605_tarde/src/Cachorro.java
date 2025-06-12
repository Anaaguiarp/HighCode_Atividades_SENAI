public class Cachorro {
    public String nome;
    public String cor;
    public int latidos;

    public Cachorro(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
        this.latidos = 0;
    }

    public void latir(){
        this.latidos++;
        System.out.println("Quantidade de latidos: "+this.latidos);
    }

    public boolean treinando(boolean estaTreinando){
        return estaTreinando;
    }

    public void comparaCores(Cachorro outroCachorro){
        if(!outroCachorro.cor.equals(this.cor)){
            System.out.println("As cores são diferentes!");
        }else{
            System.out.println("As cores são iguais!");
        }
    }

    public boolean ehGrande(boolean grande){
        return grande;
    }

}
