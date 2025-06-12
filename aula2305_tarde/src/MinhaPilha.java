import java.util.LinkedList;

public class MinhaPilha<T> {
    private LinkedList<T> lista;

    public MinhaPilha() {
        lista = new LinkedList<>();
    }

    public void push(T elemento) {
        lista.addFirst(elemento);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return lista.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return lista.getFirst();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public int size() {
        return lista.size();
    }

    public void clear() {
        lista.clear();
    }

    public void print() {
        System.out.println("Pilha: " + lista);
    }
}