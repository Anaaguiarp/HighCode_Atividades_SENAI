public class Stack {
    private int[] elementos;
    private int topo;

    public Stack(int tamanho) {
        elementos = new int[tamanho];
        topo = -1;
    }

    public void push(int elemento) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = elemento;
        } else {
            System.out.println("A pilha está cheia!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int elemento = elementos[topo];
            topo--;
            return elemento;
        } else {
            System.out.println("A pilha está vazia!");
            return -1;
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }
}