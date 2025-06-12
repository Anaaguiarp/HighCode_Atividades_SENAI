public class MyDictionary<K, V> {

    private static class Entry<K, V> {
        K chave;
        V valor;
        Entry<K, V> proximo;

        Entry(K chave, V valor) {
            this.chave = chave;
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Entry<K, V> inicio;

    public MyDictionary() {
        inicio = null;
    }

    public void put(K chave, V valor) {
        Entry<K, V> atual = inicio;

        while (atual != null) {
            if (atual.chave.equals(chave)) {
                atual.valor = valor;
                return;
            }
            atual = atual.proximo;
        }

        Entry<K, V> nova = new Entry<>(chave, valor);
        nova.proximo = inicio;
        inicio = nova;
    }

    public V get(K chave) {
        Entry<K, V> atual = inicio;

        while (atual != null) {
            if (atual.chave.equals(chave)) {
                return atual.valor;
            }
            atual = atual.proximo;
        }

        return null;
    }

    public void remove(K chave) {
        if (inicio == null) return;

        if (inicio.chave.equals(chave)) {
            inicio = inicio.proximo;
            return;
        }

        Entry<K, V> atual = inicio;
        while (atual.proximo != null) {
            if (atual.proximo.chave.equals(chave)) {
                atual.proximo = atual.proximo.proximo;
                return;
            }
            atual = atual.proximo;
        }
    }

    public boolean containsKey(K chave) {
        Entry<K, V> atual = inicio;
        while (atual != null) {
            if (atual.chave.equals(chave)) return true;
            atual = atual.proximo;
        }
        return false;
    }

    public void exibir() {
        Entry<K, V> atual = inicio;
        while (atual != null) {
            System.out.println(atual.chave + " -> " + atual.valor);
            atual = atual.proximo;
        }
    }
}