import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MatrizEsparsa {
    private int linhas;
    private int colunas;
    private Map<Posicao, Integer> valores;

    private static class Posicao {
        int linha, coluna;

        Posicao(int l, int c) {
            linha = l;
            coluna = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Posicao)) return false;
            Posicao pos = (Posicao) o;
            return linha == pos.linha && coluna == pos.coluna;
        }

        @Override
        public int hashCode() {
            return Objects.hash(linha, coluna);
        }
    }

    public MatrizEsparsa(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        valores = new HashMap<>();
    }

    public void set(int linha, int coluna, int valor) {
        validarPosicao(linha, coluna);
        Posicao pos = new Posicao(linha, coluna);
        if (valor == 0) {
            valores.remove(pos);
        } else {
            valores.put(pos, valor);
        }
    }

    public int get(int linha, int coluna) {
        validarPosicao(linha, coluna);
        return valores.getOrDefault(new Posicao(linha, coluna), 0);
    }

    private void validarPosicao(int linha, int coluna) {
        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
    }

    public void imprimir() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(get(i, j) + " ");
            }
            System.out.println();
        }
    }
}