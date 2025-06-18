abstract class Passaro {
    protected double envergadura;

    public Passaro(double envergadura) {
        this.envergadura = envergadura;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public abstract void voar();
    public abstract void facaSom();
}

class BemTeVi extends Passaro {
    private double velocidadeAtual;

    public BemTeVi(double envergadura) {
        super(envergadura);
        this.velocidadeAtual = 0.0;
    }

    @Override
    public void voar() {
        System.out.println("Bem-te-vi voa entre galhos com pequenos saltos.");
    }

    @Override
    public void facaSom() {
        System.out.println("Bem-te-vi canta: 'Bem-te-vi!'");
    }

    public void rastrearVelocidadeVoo(double novaVelocidade) {
        this.velocidadeAtual = novaVelocidade;
        System.out.println("Bem-te-vi voando a " + velocidadeAtual + " km/h.");
    }
}

class Aguia extends Passaro {
    private double alcanceVisao;

    public Aguia(double envergadura) {
        super(envergadura);
        this.alcanceVisao = 1000;
    }

    @Override
    public void voar() {
        System.out.println("Águia voa em grandes altitudes com asas abertas.");
    }

    @Override
    public void facaSom() {
        System.out.println("Águia emite um grito agudo e poderoso.");
    }

    public void detectarPresas(double distancia) {
        if (distancia <= alcanceVisao) {
            System.out.println("Águia detectou uma presa a " + distancia + " metros.");
        } else {
            System.out.println("Presa fora do alcance de visão.");
        }
    }

    public void realizarManobrasAereas() {
        System.out.println("Águia executa uma curva fechada no ar com precisão.");
    }
}

public class Aves {
    public static void main(String[] args) {
        BemTeVi btv = new BemTeVi(0.3);
        System.out.println("=== Bem-te-vi ===");
        btv.voar();
        btv.facaSom();
        btv.rastrearVelocidadeVoo(12.5);
        System.out.println("Envergadura: " + btv.getEnvergadura() + " metros\n");

        Aguia aguia = new Aguia(2.1);
        System.out.println("=== Águia ===");
        aguia.voar();
        aguia.facaSom();
        aguia.detectarPresas(800);
        aguia.realizarManobrasAereas();
        System.out.println("Envergadura: " + aguia.getEnvergadura() + " metros");
    }
}