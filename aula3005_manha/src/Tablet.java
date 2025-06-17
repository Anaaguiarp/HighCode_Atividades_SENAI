public class Tablet extends DispositivoEletronico {
    private String modelo;

    public Tablet(String modelo) {
        super();
        this.modelo = modelo;
    }

    @Override
    public void usar() {
        if (isLigado()) {
            System.out.println("Usando o tablet " + modelo + " para ler, assistir vídeos e jogar.");
        } else {
            System.out.println("Tablet desligado. Ligue o dispositivo para usar.");
        }
    }
}