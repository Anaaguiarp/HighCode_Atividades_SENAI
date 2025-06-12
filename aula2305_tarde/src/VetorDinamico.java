public class VetorDinamico {
    private int[] dados;
    private int tamanho;

    public VetorDinamico() {
        dados = new int[4]; // capacidade inicial
        tamanho = 0;
    }

    public void adicionar(int elemento) {
        if (tamanho == dados.length) {
            redimensionar();
        }
        dados[tamanho] = elemento;
        tamanho++;
    }

    public int obter(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return dados[indice];
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        for (int i = indice; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    private void redimensionar() {
        int novoTamanho = dados.length * 2;
        int[] novoArray = new int[novoTamanho];
        for (int i = 0; i < dados.length; i++) {
            novoArray[i] = dados[i];
        }
        dados = novoArray;
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }
}