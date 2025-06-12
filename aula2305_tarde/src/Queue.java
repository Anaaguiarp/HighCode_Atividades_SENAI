public class Queue {

    private static class Node {
        int valor;
        Node proximo;

        Node(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Node frente;
    private Node tras;

    public Queue() {
        frente = null;
        tras = null;
    }

    public void enqueue(int valor) {
        Node novo = new Node(valor);
        if (isEmpty()) {
            frente = novo;
            tras = novo;
        } else {
            tras.proximo = novo;
            tras = novo;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
            return -1;
        }

        int valor = frente.valor;
        frente = frente.proximo;

        if (frente == null) {
            tras = null;
        }

        return valor;
    }

    public boolean isEmpty() {
        return frente == null;
    }
}
