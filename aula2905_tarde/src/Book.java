import java.util.List;

public class Book {
    private String title;
    private String author;
    private double price;
    private String genre;
    private int pageCount;

    private static final List<String> generos = List.of(
        "Ficção", "Não Ficção", "Romance", "Fantasia", "Mistério"
    );

    public Book(String title, String author, double price, int pageCount) {
        this.title = title;
        this.author = author;
        setPrice(price);
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title; 
    }

    public void setTitle(String title) { 
        this.title = title; 
    }

    public String getAuthor() {
        return author; 
    }

    public void setAuthor(String author) {
        this.author = author; 
    }

    public double getPrice() {
        return price; 
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.price = price;
    }

    public String getGenre() {
        return genre; 
    }
    
    public void setGenre(String genre) {
        if (generos.contains(genre)) {
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Gênero inválido. Gêneros permitidos: " + generos);
        }
    }

    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            price -= price * percent / 100;
        }
    }

    public void applyMultipleDiscounts(List<Double> discounts) {
        for (double d : discounts) {
            applyDiscount(d);
        }
    }

    public int estimatedReadingTime() {
        return pageCount;
    }

    public String toString() {
        return this.title + " por " + this.author + " - R$" + String.format("%.2f", this.price) + " (" + estimatedReadingTime() + " min)";
    }
}