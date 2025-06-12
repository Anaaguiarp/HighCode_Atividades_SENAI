import java.util.HashMap;

public class MySet<T> {
    private HashMap<T, Boolean> mapa;

    public MySet() {
        mapa = new HashMap<>();
    }

    public void add(T elemento) {
        mapa.put(elemento, Boolean.TRUE);
    }

    public void remove(T elemento) {
        mapa.remove(elemento);
    }

    public boolean contains(T elemento) {
        return mapa.containsKey(elemento);
    }

    public int size() {
        return mapa.size();
    }

    public void exibir() {
        System.out.println(mapa.keySet());
    }
}
