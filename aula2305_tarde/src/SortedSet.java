public interface SortedSet<T extends Comparable<T>> {
    boolean add(T element);
    boolean remove(T element);
    boolean contains(T element);
    int size();
    boolean isEmpty();
    void clear();
    void print();
}