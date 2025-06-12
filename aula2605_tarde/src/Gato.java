public class Gato {
    public String nome;
    public int idade;
    public String raca;
    public double peso;

    public Gato(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Gato(){
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    public void defineRaca(String raca){
        this.raca = raca;
    }

    public boolean ehGatinho(){
        if(this.idade < 1){
            return true;
        }else{
            return false;
        }
    }

    public void definePeso(double peso){
        this.peso = peso;
    }

    public void comparaIdades(Gato outroGato){
        if(this.idade > outroGato.idade){
            System.out.println("O gato "+this.nome+" é mais velho que o outro gato");
        }else if(this.idade < outroGato.idade){
            System.out.println("O gato "+outroGato.nome+" é mais velho que o outro gato");
        }else{
            System.out.println("Eles tem a mesma idade!");
        }
    }

    public String toString(){
        return "Nome: "+this.nome+"\nIdade: "+this.idade+"\nRaça: "+this.raca+"\nPeso: "+this.peso;
    }

}