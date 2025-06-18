abstract class Instrumento {
    protected String tipoSom;

    public Instrumento(String tipoSom) {
        this.tipoSom = tipoSom;
    }

    public String getTipoSom() {
        return tipoSom;
    }

    public void setTipoSom(String tipoSom) {
        this.tipoSom = tipoSom;
    }

    public abstract void tocar();
    public abstract void afinar();
}

class Sinos extends Instrumento {

    public Sinos() {
        super("Som metálico e ressonante");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando os sinos com som: " + tipoSom);
    }

    @Override
    public void afinar() {
        System.out.println("Afinando os sinos com precisão manual.");
    }

    public void tocarMelodia(String melodia) {
        System.out.println("Sinos tocando a melodia: " + melodia);
    }
}

class Violino extends Instrumento {
    private int tensaoCordas;
    private boolean afinado;

    public Violino() {
        super("Som suave e melodioso de cordas");
        this.tensaoCordas = 5; // valor padrão
        this.afinado = false;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando o violino com som: " + tipoSom);
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o violino ajustando a tensão das cordas.");
        if (tensaoCordas >= 4 && tensaoCordas <= 6) {
            afinado = true;
        } else {
            afinado = false;
        }
    }

    public void ajustarTensaoCordas(int nivel) {
        this.tensaoCordas = nivel;
        System.out.println("Tensão das cordas ajustada para: " + tensaoCordas);
    }

    public boolean estaAfinado() {
        if (afinado) {
            System.out.println("Violino está afinado.");
        } else {
            System.out.println("Violino não está afinado.");
        }
        return afinado;
    }
}

public class Instrumentos {
    public static void main(String[] args) {
        Sinos sinos = new Sinos();
        sinos.tocar();
        sinos.afinar();
        sinos.tocarMelodia("Noite Feliz");

        System.out.println();

        Violino violino = new Violino();
        violino.tocar();
        violino.ajustarTensaoCordas(5);
        violino.afinar();
        violino.estaAfinado();
    }
}