public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap() {
        capacity = 10;
        heap = new int[capacity];
        size = 0;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            capacity *= 2;
            int[] novoHeap = new int[capacity];
            System.arraycopy(heap, 0, novoHeap, 0, size);
            heap = novoHeap;
        }
    }

    public void insert(int val) {
        ensureCapacity();
        heap[size] = val;
        size++;
        heapifyUp(size - 1);
    }

    public int extractMax() {
        if (size == 0) throw new IllegalStateException("Heap vazio");
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int pai = (index - 1) / 2;
            if (heap[pai] < heap[index]) {
                trocar(pai, index);
                index = pai;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        while (index < size) {
            int maior = index;
            int esquerdo = 2 * index + 1;
            int direito = 2 * index + 2;

            if (esquerdo < size && heap[esquerdo] > heap[maior]) {
                maior = esquerdo;
            }

            if (direito < size && heap[direito] > heap[maior]) {
                maior = direito;
            }

            if (maior != index) {
                trocar(index, maior);
                index = maior;
            } else {
                break;
            }
        }
    }

    private void trocar(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public int tamanho() {
        return size;
    }

    public boolean estaVazio() {
        return size == 0;
    }

    public void imprimir() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}