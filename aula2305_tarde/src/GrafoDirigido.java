import java.util.*;
import java.util.Queue;

public class GrafoDirigido {
    private Map<String, List<String>> adjacencias;

    public GrafoDirigido() {
        adjacencias = new HashMap<>();
    }

    // Adiciona um vértice (se ainda não existir)
    public void adicionarVertice(String vertice) {
        adjacencias.putIfAbsent(vertice, new ArrayList<>());
    }

    // Adiciona uma aresta do vértice origem para o destino
    public void adicionarAresta(String origem, String destino) {
        adicionarVertice(origem);
        adicionarVertice(destino);
        adjacencias.get(origem).add(destino); // direcionada
    }

    // Imprime o grafo (lista de adjacência)
    public void imprimir() {
        for (String vertice : adjacencias.keySet()) {
            System.out.print(vertice + " -> ");
            System.out.println(adjacencias.get(vertice));
        }
    }

    // Busca em profundidade (DFS)
    public void dfs(String inicio) {
        Set<String> visitados = new HashSet<>();
        System.out.print("DFS a partir de " + inicio + ": ");
        dfsRecursivo(inicio, visitados);
        System.out.println();
    }

    private void dfsRecursivo(String atual, Set<String> visitados) {
        if (!visitados.contains(atual)) {
            System.out.print(atual + " ");
            visitados.add(atual);
            for (String vizinho : adjacencias.getOrDefault(atual, new ArrayList<>())) {
                dfsRecursivo(vizinho, visitados);
            }
        }
    }

    public void bfs(String inicio) {
        Set<String> visitados = new HashSet<>();
        Queue<String> fila = new LinkedList<>();

        fila.add(inicio);
        visitados.add(inicio);

        System.out.print("BFS a partir de " + inicio + ": ");

        while (!fila.isEmpty()) {
            String atual = fila.poll();
            System.out.print(atual + " ");

            for (String vizinho : adjacencias.getOrDefault(atual, new ArrayList<>())) {
                if (!visitados.contains(vizinho)) {
                    fila.add(vizinho);
                    visitados.add(vizinho);
                }
            }
        }
        System.out.println();
    }
}