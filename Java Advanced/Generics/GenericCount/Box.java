package Generics.GenericCount;

import java.util.List;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {

    private T element;

    public Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return this.element.getClass().getName()+": "+this.element;
    }

    @Override
    public int compareTo(Box<T> other) {
        return this.element.compareTo(other.element);
    }
    public static <T extends Comparable<T>> int countGreaterElements(List<Box<T>> boxes, Box<T> element) {
        int count = 0;
        for (Box<T> box : boxes) {
            if (box.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
}
