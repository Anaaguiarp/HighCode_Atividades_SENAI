public class ListaLigadaSimples {

    private static class Node {
        int valor;
        Node proximo;

        Node(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Node inicio;

    public ListaLigadaSimples() {
        inicio = null;
    }

    public void inserir(int valor) {
        Node novo = new Node(valor);

        if (inicio == null) {
            inicio = novo;
        } else {
            Node atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public void remover(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            return;
        }

        Node atual = inicio;
        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    public boolean buscar(int valor) {
        Node atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void exibir() {
        Node atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}