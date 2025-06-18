abstract class Veiculo2 {
    protected boolean motorLigado = false;
    protected double consumoKmPorLitro;
    protected double combustivelAtual;
    protected String modoMotor = "Normal";

    public Veiculo2(double consumoKmPorLitro, double combustivelAtual) {
        this.consumoKmPorLitro = consumoKmPorLitro;
        this.combustivelAtual = combustivelAtual;
    }

    public abstract void ligarMotor();
    public abstract void pararMotor();

    public double eficienciaCombustivel() {
        System.out.println("Eficiência: " + consumoKmPorLitro + " km/l");
        return consumoKmPorLitro;
    }

    public void desligamentoAutomatico() {
        if (motorLigado) {
            motorLigado = false;
            System.out.println("Motor desligado automaticamente após inatividade.");
        }
    }

    public double estimarDistanciaRestante() {
        double estimativa = consumoKmPorLitro * combustivelAtual;
        System.out.println("Distância estimada restante: " + estimativa + " km");
        return estimativa;
    }

    public void definirModoMotor(String modo) {
        this.modoMotor = modo;
        System.out.println("Modo de motor ajustado para: " + modoMotor);
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }
}

class Carro2 extends Veiculo2 {

    public Carro2(double consumo, double combustivel) {
        super(consumo, combustivel);
    }

    @Override
    public void ligarMotor() {
        motorLigado = true;
        System.out.println("Carro: motor ligado com botão START.");
    }

    @Override
    public void pararMotor() {
        motorLigado = false;
        System.out.println("Carro: motor desligado suavemente.");
    }
}

class Motocicleta2 extends Veiculo2 {

    public Motocicleta2(double consumo, double combustivel) {
        super(consumo, combustivel);
    }

    @Override
    public void ligarMotor() {
        motorLigado = true;
        System.out.println("Motocicleta: motor ligado com pedal de partida.");
    }

    @Override
    public void pararMotor() {
        motorLigado = false;
        System.out.println("Motocicleta: motor desligado com chave manual.");
    }
}

public class VeiculoTeste {
    public static void main(String[] args) {
        Carro2 carro2 = new Carro2(12.5, 40);
        Motocicleta2 moto2 = new Motocicleta2(25.0, 10);

        System.out.println("\n=== Operações com Carro ===");
        carro2.ligarMotor();
        carro2.eficienciaCombustivel();
        carro2.estimarDistanciaRestante();
        carro2.definirModoMotor("Econômico");
        carro2.desligamentoAutomatico();

        System.out.println("\n=== Operações com Motocicleta ===");
        moto2.ligarMotor();
        moto2.eficienciaCombustivel();
        moto2.estimarDistanciaRestante();
        moto2.definirModoMotor("Esportivo");
        moto2.pararMotor();
    }
}