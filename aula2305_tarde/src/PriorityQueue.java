import java.util.ArrayList;

public class PriorityQueue {
    private ArrayList<Integer> heap;

    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    public void enqueue(int valor) {
        heap.add(valor);
        subir(heap.size() - 1);
    }

    public int dequeue() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        int maior = heap.get(0);
        int ultimo = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, ultimo);
            descer(0);
        }
        return maior;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void subir(int i) {
        while (i > 0) {
            int pai = (i - 1) / 2;
            if (heap.get(i) <= heap.get(pai)) break;
            trocar(i, pai);
            i = pai;
        }
    }

    private void descer(int i) {
        int tamanho = heap.size();
        while (true) {
            int esq = 2 * i + 1;
            int dir = 2 * i + 2;
            int maior = i;

            if (esq < tamanho && heap.get(esq) > heap.get(maior)) {
                maior = esq;
            }
            if (dir < tamanho && heap.get(dir) > heap.get(maior)) {
                maior = dir;
            }
            if (maior == i) break;

            trocar(i, maior);
            i = maior;
        }
    }

    private void trocar(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}