public class Livro {
    public String titulo;
    public String autor;
    public double preco;

    public Livro(String titulo, String autor, double preco, boolean bestSeller){
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.preco = 0.0;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 0.0;
    }

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void descontoLivro(int desconto){
        double precoDesconto = this.preco - (this.preco * (desconto/100.0));
        System.out.printf("Preço com desconto R$%.2f: ", precoDesconto);
    }

    public void comparaPrecos(Livro outroLivro){
        if(this.preco < outroLivro.preco){
            System.out.println("O valor do livro "+ this.titulo +" é mais barato!");
        }else if(this.preco > outroLivro.preco){
            System.out.println("O valor do livro "+outroLivro.titulo+" é mais barato!");
        }else{
            System.out.println("Os valores são iguais!");
        }
    }

    public boolean verificaBestSeller(boolean bestSeller){
        return bestSeller;
    }

    public double calculaClassificacao(int[] resenhas){
        if(resenhas.length == 0) return 0;
        double soma = 0;
        for(double nota : resenhas){
            soma += nota;
        }
        return soma / resenhas.length;
    }

    public String toString(){
        return "Título: "+this.titulo+"\nAutor: "+this.autor+"\nPreço: "+this.preco;
    }
}