public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--------------------Exercício 1--------------------");
        Stack pilha = new Stack(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println("Pilha vazia? "+(pilha.isEmpty() ? "Sim" : "Não"));
        System.out.println(pilha.pop());
        System.out.println("Pilha vazia? "+(pilha.isEmpty() ? "Sim" : "Não"));

        System.out.println("\n--------------------Exercício 2--------------------");
        Queue fila = new Queue();

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println("Fila vazia? "+((fila.isEmpty() ? "Sim" : "Não")));
        System.out.println(fila.dequeue());
        System.out.println("Fila vazia? "+((fila.isEmpty() ? "Sim" : "Não")));

        System.out.println("\n--------------------Exercício 3--------------------");
        ListaLigadaSimples lista = new ListaLigadaSimples();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);

        lista.exibir();

        lista.remover(20);
        lista.exibir();

        System.out.println(lista.buscar(30));
        System.out.println(lista.buscar(40));

        System.out.println("\n--------------------Exercício 4--------------------");
        MySet<String> conjunto = new MySet<>();

        conjunto.add("maçã");
        conjunto.add("banana");
        conjunto.add("maçã");

        conjunto.exibir();

        System.out.println(conjunto.contains("banana"));
        System.out.println(conjunto.contains("laranja"));

        conjunto.remove("banana");
        conjunto.exibir();

        System.out.println("\n--------------------Exercício 5--------------------");
        MyDictionary<String, String> dict = new MyDictionary<>();

        dict.put("nome", "Ana");
        dict.put("curso", "ADS");
        dict.put("cidade", "Londrina");

        dict.exibir();
        System.out.println(dict.get("nome"));
        System.out.println(dict.containsKey("curso"));

        dict.remove("curso");
        dict.exibir();

        System.out.println("\n--------------------Exercício 6--------------------");
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Elementos em ordem: ");
        bst.inOrder();

        System.out.println("Buscar 60: " + bst.search(60));
        System.out.println("Buscar 25: " + bst.search(25));

        System.out.println("\n--------------------Exercício 7--------------------");
        PriorityQueue pq = new PriorityQueue();

        pq.enqueue(20);
        pq.enqueue(15);
        pq.enqueue(30);
        pq.enqueue(40);

        while (!pq.isEmpty()) {
            System.out.println(pq.dequeue());
        }

        System.out.println("\n--------------------Exercício 8--------------------");
        SimpleHashTable<String, Integer> tabela = new SimpleHashTable<>(5);

        tabela.put("Ana", 25);
        tabela.put("Pedro", 30);
        tabela.put("Maria", 28);

        System.out.println(tabela.get("Ana"));
        System.out.println(tabela.get("Pedro"));
        System.out.println(tabela.get("João"));

        tabela.remove("Ana");
        System.out.println(tabela.get("Ana"));

        System.out.println("\n--------------------Exercício 9--------------------");
        SortedSet<Integer> set = new SimpleSortedSet<>();

        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(3);

        set.print();

        set.remove(2);
        set.print();

        System.out.println(set.contains(3));
        System.out.println(set.contains(2));
        System.out.println(set.size());

        System.out.println("\n--------------------Exercício 10--------------------");
        VetorDinamico vetor = new VetorDinamico();

        vetor.adicionar(10);
        vetor.adicionar(20);
        vetor.adicionar(30);
        vetor.adicionar(40);
        vetor.adicionar(50);

        vetor.imprimir();

        vetor.remover(2);
        vetor.imprimir();

        System.out.println("Elemento na posição 1: " + vetor.obter(1)); 
        System.out.println("Tamanho atual: " + vetor.tamanho());

        System.out.println("\n--------------------Exercício 11--------------------");
        MinhaPilha<Integer> pilha11 = new MinhaPilha<>();

        pilha11.push(10);
        pilha11.push(20);
        pilha11.push(30);
        pilha11.print();

        System.out.println("Topo: " + pilha11.peek());
        System.out.println("Removido: " + pilha11.pop());
        pilha11.print();

        System.out.println("Tamanho: " + pilha11.size());
        System.out.println("Está vazia? " + pilha11.isEmpty());

        pilha11.clear();
        System.out.println("Está vazia após clear? " + pilha11.isEmpty());

        System.out.println("\n--------------------Exercício 12--------------------");
        GrafoDirigido grafo = new GrafoDirigido();

        grafo.adicionarAresta("A", "B");
        grafo.adicionarAresta("A", "C");
        grafo.adicionarAresta("B", "D");
        grafo.adicionarAresta("C", "D");
        grafo.adicionarAresta("D", "E");

        grafo.imprimir();

        grafo.dfs("A");
        grafo.bfs("A");

        System.out.println("\n--------------------Exercício 13--------------------");
        MaxHeap heap = new MaxHeap();

        heap.insert(10);
        heap.insert(40);
        heap.insert(20);
        heap.insert(50);
        heap.insert(30);

        heap.imprimir();

        System.out.println("Extrair máximo: " + heap.extractMax());
        heap.imprimir();

        System.out.println("\n--------------------Exercício 14--------------------");
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.imprimir();

        cache.get(2);
        cache.imprimir();

        cache.put(4, "D");
        cache.imprimir();

        System.out.println("Get 1: " + cache.get(1));
        System.out.println("Get 3: " + cache.get(3));
        cache.imprimir();

        System.out.println("\n--------------------Exercício 15--------------------");
        MatrizEsparsa matriz = new MatrizEsparsa(4, 5);

        matriz.set(0, 1, 10);
        matriz.set(2, 3, 20);
        matriz.set(3, 0, 30);

        matriz.imprimir();

        System.out.println("\n--------------------Exercício 16--------------------");

        FilaCircular fila16 = new FilaCircular(5);

        fila16.enfileirar(10);
        fila16.enfileirar(20);
        fila16.enfileirar(30);
        fila16.imprimir();

        System.out.println("Desenfileirar: " + fila16.desenfileirar());
        fila16.imprimir();

        fila16.enfileirar(40);
        fila16.enfileirar(50);
        fila16.enfileirar(60);
        fila16.imprimir();

        System.out.println("\n--------------------Exercício 17--------------------");

        AVLTree avl = new AVLTree();

        avl.inserir(10);
        avl.inserir(20);
        avl.inserir(30);
        avl.inserir(40);
        avl.inserir(50);
        avl.inserir(25);

        avl.imprimirEmOrdem();

        avl.remover(40);
        avl.imprimirEmOrdem();

        System.out.println("\n--------------------Exercício 18--------------------");
        Trie trie = new Trie();

        trie.inserir("casa");
        trie.inserir("carro");
        trie.inserir("cachorro");

        System.out.println(trie.buscar("casa"));
        System.out.println(trie.buscar("casas"));
        System.out.println(trie.comecaCom("ca"));
        System.out.println(trie.comecaCom("car"));
        System.out.println(trie.comecaCom("cab"));

        System.out.println("\n--------------------Exercício 19--------------------");
        ListaLigada lista19 = new ListaLigada();

        lista19.adicionar(5);
        lista19.adicionar(1);
        lista19.adicionar(8);
        lista19.adicionar(3);
        lista19.adicionar(7);

        System.out.println("Antes da ordenação:");
        lista19.imprimir();

        lista19.ordenar();

        System.out.println("Depois da ordenação:");
        lista19.imprimir();

    }
}