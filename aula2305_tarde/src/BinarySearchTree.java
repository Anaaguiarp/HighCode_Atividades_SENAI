public class BinarySearchTree {

    private static class Node {
        int valor;
        Node esquerda;
        Node direita;

        Node(int valor) {
            this.valor = valor;
            esquerda = null;
            direita = null;
        }
    }

    private Node raiz;

    public BinarySearchTree() {
        raiz = null;
    }

    public void insert(int valor) {
        raiz = insertRec(raiz, valor);
    }

    private Node insertRec(Node atual, int valor) {
        if (atual == null) {
            return new Node(valor);
        }
        if (valor < atual.valor) {
            atual.esquerda = insertRec(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = insertRec(atual.direita, valor);
        }

        return atual;
    }

    public boolean search(int valor) {
        return searchRec(raiz, valor);
    }

    private boolean searchRec(Node atual, int valor) {
        if (atual == null) return false;
        if (valor == atual.valor) return true;
        if (valor < atual.valor) return searchRec(atual.esquerda, valor);
        else return searchRec(atual.direita, valor);
    }

    public void inOrder() {
        inOrderRec(raiz);
        System.out.println();
    }

    private void inOrderRec(Node atual) {
        if (atual != null) {
            inOrderRec(atual.esquerda);
            System.out.print(atual.valor + " ");
            inOrderRec(atual.direita);
        }
    }
}