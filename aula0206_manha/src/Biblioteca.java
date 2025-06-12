import java.util.ArrayList;
import java.util.List;

class Livro {
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }
}

class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public void removerLivro(String titulo) {
        livros.removeIf(l -> l.titulo.equalsIgnoreCase(titulo));
        System.out.println("Livro removido: " + titulo);
    }

    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public List<Livro> buscarLivro(String termo) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro l : livros) {
            if (l.titulo.toLowerCase().contains(termo.toLowerCase()) ||
                l.autor.toLowerCase().contains(termo.toLowerCase())) {
                resultado.add(l);
            }
        }
        return resultado;
    }
}