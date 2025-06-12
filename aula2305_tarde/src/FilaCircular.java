public class FilaCircular {
    private int[] dados;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaCircular(int capacidade) {
        this.capacidade = capacidade;
        dados = new int[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    public void enfileirar(int valor) {
        if (estaCheia()) {
            throw new RuntimeException("Fila cheia");
        }
        dados[fim] = valor;
        fim = (fim + 1) % capacidade;
        tamanho++;
    }

    public int desenfileirar() {
        if (estaVazia()) {
            throw new RuntimeException("Fila vazia");
        }
        int valor = dados[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return valor;
    }

    public int tamanho() {
        return tamanho;
    }

    public void imprimir() {
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int idx = (inicio + i) % capacidade;
            System.out.print(dados[idx] + " ");
        }
        System.out.println();
    }
}