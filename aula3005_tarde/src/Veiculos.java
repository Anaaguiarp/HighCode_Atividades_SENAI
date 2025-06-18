abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String tipoCombustivel;

    public Veiculo(String marca, String modelo, int ano, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
    }

    public abstract double calcularEficienciaCombustivel();

    public double calcularDistancia(double velocidade, double tempo) {
        return velocidade * tempo;
    }

    public abstract double velocidadeMaxima();

    public void agendarManutencao() {
        System.out.println("Manutenção agendada para o veículo: " + marca + " " + modelo);
    }
}

class Caminhao extends Veiculo {
    private double pesoCarga;

    public Caminhao(String marca, String modelo, int ano, String tipoCombustivel, double pesoCarga) {
        super(marca, modelo, ano, tipoCombustivel);
        this.pesoCarga = pesoCarga;
    }

    public double calcularCapacidadeCarga() {
        return pesoCarga;
    }

    @Override
    public double calcularEficienciaCombustivel() {
        return 3.5;
    }

    @Override
    public double velocidadeMaxima() {
        return 120.0;
    }
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano, String tipoCombustivel) {
        super(marca, modelo, ano, tipoCombustivel);
    }

    @Override
    public double calcularEficienciaCombustivel() {
        return 12.0;
    }

    @Override
    public double velocidadeMaxima() {
        return 180.0;
    }

    public double estimarTempoViagem(double distancia) {
        double velocidadeMedia = 100;
        return distancia / velocidadeMedia;
    }
}

class Motocicleta extends Veiculo {
    private boolean pressaoPneusOk;

    public Motocicleta(String marca, String modelo, int ano, String tipoCombustivel, boolean pressaoPneusOk) {
        super(marca, modelo, ano, tipoCombustivel);
        this.pressaoPneusOk = pressaoPneusOk;
    }

    @Override
    public double calcularEficienciaCombustivel() {
        return 20.0;
    }

    @Override
    public double velocidadeMaxima() {
        return 160.0;
    }

    public void verificarPressaoPneus() {
        if (pressaoPneusOk) {
            System.out.println("Pressão dos pneus está OK para a viagem.");
        } else {
            System.out.println("Pressão dos pneus está BAIXA! Recomendado ajustar antes da viagem.");
        }
    }
}

public class Veiculos {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, "Diesel", 15000);
        Carro carro = new Carro("Toyota", "Corolla", 2019, "Gasolina");
        Motocicleta moto = new Motocicleta("Honda", "CB500", 2021, "Gasolina", true);

        System.out.println("Caminhão capacidade de carga: " + caminhao.calcularCapacidadeCarga() + " kg");
        System.out.println("Carro tempo estimado para 300 km: " + carro.estimarTempoViagem(300) + " horas");
        moto.verificarPressaoPneus();

        caminhao.agendarManutencao();
        carro.agendarManutencao();
        moto.agendarManutencao();
    }
}
