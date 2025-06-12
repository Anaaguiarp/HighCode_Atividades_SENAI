public class Curriculo {
    public String nome;
    public int idade;
    public String profissao;
    public String experiencias;

    public Curriculo(String nome, int idade, String profissao, String experiencias){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.experiencias = experiencias;
    }

    public String sobreMim(){
        return "Olá, eu sou " + this.nome + ", tenho " + this.idade + " anos, trabalho como " + this.profissao + ", e tenho experiência com " + this.experiencias;
    }
}
