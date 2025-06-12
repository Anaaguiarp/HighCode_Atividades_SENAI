import java.util.ArrayList;

public class SimpleSortedSet<T extends Comparable<T>> implements SortedSet<T> {

    private ArrayList<T> list = new ArrayList<>();

    @Override
    public boolean add(T element) {
        if (element == null || contains(element)) return false;

        int i = 0;
        while (i < list.size() && list.get(i).compareTo(element) < 0) {
            i++;
        }
        list.add(i, element);
        return true;
    }

    @Override
    public boolean remove(T element) {
        return list.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return list.contains(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void print() {
        for (T e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
