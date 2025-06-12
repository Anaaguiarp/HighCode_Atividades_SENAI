public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro(String titulo){
        this.titulo = titulo;
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirLivro(){
        System.out.println("\nTítulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Ano de Publicação: "+this.anoPublicacao);
    }
}
