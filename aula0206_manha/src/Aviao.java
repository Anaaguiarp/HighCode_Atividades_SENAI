import java.time.LocalTime;

public class Aviao {
    private String numeroVoo;
    private String destino;
    private LocalTime horarioPartida;
    private int capacidadePassageiros;
    private int passageirosConfirmados;
    private double velocidadeAtual;
    private double distancia;
    private double nivelCombustivel;
    private double consumoPorKm;

    public Aviao(String numeroVoo, String destino, LocalTime horarioPartida, int capacidadePassageiros,
                 int passageirosConfirmados, double velocidadeAtual, double distancia,
                 double nivelCombustivel, double consumoPorKm) {
        this.numeroVoo = numeroVoo;
        this.destino = destino;
        this.horarioPartida = horarioPartida;
        this.capacidadePassageiros = capacidadePassageiros;
        this.passageirosConfirmados = passageirosConfirmados;
        this.velocidadeAtual = velocidadeAtual;
        this.distancia = distancia;
        this.nivelCombustivel = nivelCombustivel;
        this.consumoPorKm = consumoPorKm;
    }

    public LocalTime tempoEstimadoChegada() {
        if (velocidadeAtual <= 0) return null;
        double horas = distancia / velocidadeAtual;
        int minutos = (int)(horas * 60);
        return horarioPartida.plusMinutes(minutos);
    }

    public boolean estaOverbooked() {
        return passageirosConfirmados > capacidadePassageiros;
    }

    public boolean precisaReabastecer() {
        double capacidadeTanque = consumoPorKm * distancia * 1.5;
        return nivelCombustivel < 0.1 * capacidadeTanque;
    }

    public String sugerirRotaAlternativa(boolean mauTempo) {
        if (!mauTempo) {
            return "Rota original via " + destino;
        } else {
            return "Rota alternativa via aeroporto próximo ao " + destino;
        }
    }

    @Override
    public String toString() {
        return "Voo " + numeroVoo + " para " + destino + "\n" +
               "Partida: " + horarioPartida + "\n" +
               "Passageiros: " + passageirosConfirmados + "/" + capacidadePassageiros + "\n" +
               "Velocidade atual: " + velocidadeAtual + " km/h\n" +
               "Nível combustível: " + nivelCombustivel + " litros\n" +
               "Tempo estimado de chegada: " + tempoEstimadoChegada() + "\n" +
               "Overbooking: " + (estaOverbooked() ? "Sim" : "Não") + "\n" +
               "Necessita reabastecer: " + (precisaReabastecer() ? "Sim" : "Não");
    }
}