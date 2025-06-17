public class Movie {
    private String title;
    private String director;
    private int duration;
    private String genre;
    private double ticketPrice;
    private int numberOfViewings;

    public Movie(String title, String director, int duration, String genre, double ticketPrice) {
        this.title = title;
        this.director = director;
        setDuration(duration);
        this.genre = genre;
        this.ticketPrice = ticketPrice;
        this.numberOfViewings = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration < 0) {
            System.out.println("Duração inválida! Definindo como 0.");
            this.duration = 0;
        } else {
            this.duration = duration;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfViewings() {
        return numberOfViewings;
    }

    public void incrementViewings() {
        this.numberOfViewings++;
    }

    public String getMovieDetails() {
        return String.format("Título: %s\nDiretor: %s\nDuração: %d minutos\nGênero: %s\nPreço do Ingresso: R$%.2f\nExibições: %d",
                title, director, duration, genre, ticketPrice, numberOfViewings);
    }

    public double calcularReceita() {
        return ticketPrice * numberOfViewings;
    }

    public static void filtrarPorGenero(Movie[] filmes, String generoDesejado) {
        System.out.println("Filmes do gênero: " + generoDesejado);
        for (Movie filme : filmes) {
            if (filme.getGenre().equalsIgnoreCase(generoDesejado)) {
                System.out.println("- " + filme.getTitle());
            }
        }
    }
}