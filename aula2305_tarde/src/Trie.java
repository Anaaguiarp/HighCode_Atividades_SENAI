import java.util.HashMap;
import java.util.Map;

public class Trie {
    private class Node {
        Map<Character, Node> filhos = new HashMap<>();
        boolean fimPalavra = false;
    }

    private Node raiz;

    public Trie() {
        raiz = new Node();
    }

    public void inserir(String palavra) {
        Node atual = raiz;
        for (char c : palavra.toCharArray()) {
            atual.filhos.putIfAbsent(c, new Node());
            atual = atual.filhos.get(c);
        }
        atual.fimPalavra = true;
    }

    public boolean buscar(String palavra) {
        Node atual = raiz;
        for (char c : palavra.toCharArray()) {
            atual = atual.filhos.get(c);
            if (atual == null) return false;
        }
        return atual.fimPalavra;
    }

    public boolean comecaCom(String prefixo) {
        Node atual = raiz;
        for (char c : prefixo.toCharArray()) {
            atual = atual.filhos.get(c);
            if (atual == null) return false;
        }
        return true;
    }
}