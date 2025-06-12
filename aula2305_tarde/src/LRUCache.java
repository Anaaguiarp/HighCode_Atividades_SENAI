import java.util.HashMap;

public class LRUCache<K, V> {

    private class Node {
        K key;
        V value;
        Node prev, next;

        Node(K k, V v) {
            key = k;
            value = v;
        }
    }

    private int capacity;
    private HashMap<K, Node> map;
    private Node head, tail; // lista duplamente ligada

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(null, null); // nó dummy cabeça
        tail = new Node(null, null); // nó dummy cauda
        head.next = tail;
        tail.prev = head;
    }

    public V get(K key) {
        Node node = map.get(key);
        if (node == null) return null;
        moveToFront(node);
        return node.value;
    }

    public void put(K key, V value) {
        Node node = map.get(key);
        if (node != null) {
            node.value = value;
            moveToFront(node);
        } else {
            if (map.size() == capacity) {
                removeLRU();
            }
            Node novo = new Node(key, value);
            map.put(key, novo);
            addToFront(novo);
        }
    }

    private void moveToFront(Node node) {
        removeNode(node);
        addToFront(node);
    }

    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void removeLRU() {
        Node lru = tail.prev;
        removeNode(lru);
        map.remove(lru.key);
    }

    // Para debug: imprime a ordem do cache do mais recente ao menos recente
    public void imprimir() {
        Node atual = head.next;
        System.out.print("Cache: ");
        while (atual != tail) {
            System.out.print("(" + atual.key + ":" + atual.value + ") ");
            atual = atual.next;
        }
        System.out.println();
    }
}