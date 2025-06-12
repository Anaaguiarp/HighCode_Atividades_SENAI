public class ListaLigada {
    class Node {
        int valor;
        Node prox;

        Node(int v) { valor = v; prox = null; }
    }

    Node head;

    public void adicionar(int valor) {
        if (head == null) {
            head = new Node(valor);
        } else {
            Node atual = head;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = new Node(valor);
        }
    }

    public void imprimir() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.prox;
        }
        System.out.println();
    }

    public Node mergeSort(Node h) {
        if (h == null || h.prox == null) return h;
    
        Node meio = getMeio(h);
        Node meioProx = meio.prox;
        meio.prox = null;
    
        Node esquerda = mergeSort(h);
        Node direita = mergeSort(meioProx);
    
        return merge(esquerda, direita);
    }
    
    private Node getMeio(Node head) {
        if (head == null) return head;
    
        Node lento = head, rapido = head.prox;
        while (rapido != null && rapido.prox != null) {
            lento = lento.prox;
            rapido = rapido.prox.prox;
        }
        return lento;
    }
    
    private Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;
    
        Node resultado;
        if (a.valor <= b.valor) {
            resultado = a;
            resultado.prox = merge(a.prox, b);
        } else {
            resultado = b;
            resultado.prox = merge(a, b.prox);
        }
        return resultado;
    }

    public void ordenar() {
        head = mergeSort(head);
    }
}