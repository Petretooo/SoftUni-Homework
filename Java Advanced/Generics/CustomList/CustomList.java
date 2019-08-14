package Generics.CustomList;

public interface CustomList<T extends Comparable<T>> {

    void add(T element);

    T remove(int index);

    boolean contains(T element);

    void swap(int fromIndex, int toIndex);

    int countGreaterThan(T element);

    T getMax();

    T getMin();
}