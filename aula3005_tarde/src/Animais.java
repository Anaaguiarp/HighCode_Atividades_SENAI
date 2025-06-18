abstract class Animal {
    protected String nome;
    protected String tipoDieta;
    protected double consumoDiario;
    protected boolean hibernando = false;

    public Animal(String nome, String tipoDieta) {
        this.nome = nome;
        this.tipoDieta = tipoDieta;
        this.consumoDiario = 0.0;
    }

    public abstract void comer();
    public abstract void som();

    public void categorizarDieta() {
        System.out.println(nome + " é um " + tipoDieta + ".");
    }

    public void comunicar(Animal outro) {
        System.out.print(nome + " se comunica com " + outro.nome + " com o som: ");
        this.som();
    }

    public void registrarConsumo(double quantidadeKg) {
        consumoDiario += quantidadeKg;
        System.out.println(nome + " consumiu " + quantidadeKg + " kg hoje. Total: " + consumoDiario + " kg.");
    }

    public void hibernar() {
        hibernando = true;
        System.out.println(nome + " entrou em hibernação.");
    }

    public boolean estaHibernando() {
        return hibernando;
    }
}

class Leao extends Animal {
    public Leao(String nome) {
        super(nome, "Carnívoro");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo carne de antílope.");
    }

    @Override
    public void som() {
        System.out.println("Rugido alto!");
    }
}

class Tigre extends Animal {
    public Tigre(String nome) {
        super(nome, "Carnívoro");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo carne de javali.");
    }

    @Override
    public void som() {
        System.out.println("Rugido rouco!");
    }
}

class Pantera extends Animal {
    public Pantera(String nome) {
        super(nome, "Carnívoro");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo carne de veado.");
    }

    @Override
    public void som() {
        System.out.println("Rosnado sombrio!");
    }
}

public class Animais {
    public static void main(String[] args) {
        Leao leao = new Leao("Simba");
        Tigre tigre = new Tigre("Rajah");
        Pantera pantera = new Pantera("Bagheera");

        System.out.println("\n=== Alimentação ===");
        leao.comer();
        leao.registrarConsumo(5.5);

        tigre.comer();
        tigre.registrarConsumo(4.2);

        pantera.comer();
        pantera.registrarConsumo(3.8);

        System.out.println("\n=== Sons e Comunicação ===");
        leao.som();
        pantera.comunicar(tigre);

        System.out.println("\n=== Dietas ===");
        leao.categorizarDieta();
        tigre.categorizarDieta();
        pantera.categorizarDieta();

        System.out.println("\n=== Hibernação ===");
        pantera.hibernar();
        System.out.println("Bagheera está hibernando? " + pantera.estaHibernando());
    }
}