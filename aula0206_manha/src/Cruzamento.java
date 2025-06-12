public class Cruzamento {
    private TrafficLight semaforoA;
    private TrafficLight semaforoB;

    public Cruzamento() {
        semaforoA = new TrafficLight("Verde");
        semaforoB = new TrafficLight("Vermelho");
    }

    public void trocarSinais() {
        if (semaforoA.getCor().equalsIgnoreCase("Verde")) {
            semaforoA.mudarCor("Vermelho");
            semaforoB.mudarCor("Verde");
        } else {
            semaforoA.mudarCor("Verde");
            semaforoB.mudarCor("Vermelho");
        }
    }

    public void simular(int ciclos) {
        for (int i = 0; i < ciclos; i++) {
            System.out.println("\nCiclo " + (i+1));
            System.out.println("Semáforo A está " + semaforoA.getCor());
            System.out.println("Semáforo B está " + semaforoB.getCor());

            trocarSinais();
        }
    }
}