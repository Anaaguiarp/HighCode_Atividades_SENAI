public class Smartphone extends DispositivoEletronico {
    private String modelo;

    public Smartphone(String modelo) {
        super();
        this.modelo = modelo;
    }

    @Override
    public void usar() {
        if (isLigado()) {
            System.out.println("Usando o smartphone " + modelo + " para fazer ligações, navegar e apps.");
        } else {
            System.out.println("Smartphone desligado. Ligue o dispositivo para usar.");
        }
    }
}