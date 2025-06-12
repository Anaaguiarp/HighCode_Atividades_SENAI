import java.util.LinkedList;

public class SimpleHashTable<K, V> {
    private class HashNode {
        K chave;
        V valor;

        HashNode(K chave, V valor) {
            this.chave = chave;
            this.valor = valor;
        }
    }

    private LinkedList<HashNode>[] tabela;
    private int capacidade;

    public SimpleHashTable(int capacidade) {
        this.capacidade = capacidade;
        tabela = new LinkedList[capacidade];
        for (int i = 0; i < capacidade; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int hash(K chave) {
        return Math.abs(chave.hashCode()) % capacidade;
    }

    public void put(K chave, V valor) {
        int indice = hash(chave);
        LinkedList<HashNode> lista = tabela[indice];

        for (HashNode node : lista) {
            if (node.chave.equals(chave)) {
                node.valor = valor;
                return;
            }
        }

        lista.add(new HashNode(chave, valor));
    }

    public V get(K chave) {
        int indice = hash(chave);
        LinkedList<HashNode> lista = tabela[indice];

        for (HashNode node : lista) {
            if (node.chave.equals(chave)) {
                return node.valor;
            }
        }
        return null;
    }

    public boolean remove(K chave) {
        int indice = hash(chave);
        LinkedList<HashNode> lista = tabela[indice];

        for (HashNode node : lista) {
            if (node.chave.equals(chave)) {
                lista.remove(node);
                return true;
            }
        }
        return false;
    }
}