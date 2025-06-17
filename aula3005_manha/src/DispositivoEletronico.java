public abstract class DispositivoEletronico {
    private boolean ligado;
    private int nivelBateria;

    public DispositivoEletronico() {
        this.ligado = false;
        this.nivelBateria = 100;
    }

    public void ligar() {
        if (!ligado && nivelBateria > 0) {
            ligado = true;
            System.out.println("Dispositivo ligado.");
        } else if (ligado) {
            System.out.println("Dispositivo já está ligado.");
        } else {
            System.out.println("Bateria insuficiente para ligar.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Dispositivo desligado.");
        } else {
            System.out.println("Dispositivo já está desligado.");
        }
    }

    public void carregar(int percentual) {
        if (percentual > 0) {
            nivelBateria += percentual;
            if (nivelBateria > 100) nivelBateria = 100;
            System.out.println("Carregado. Nível da bateria: " + nivelBateria + "%");
        } else {
            System.out.println("Percentual inválido para carregar.");
        }
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public boolean isLigado() {
        return ligado;
    }

    public abstract void usar();
}