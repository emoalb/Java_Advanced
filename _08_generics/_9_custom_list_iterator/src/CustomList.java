import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;


public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private ArrayList<T> elements;

    CustomList() {
        this.elements = new ArrayList<>();

    }

    void add(T element) {
        this.elements.add(element);
    }

    T remove(int index) {
        T t;
        if (index < 0 || index > this.elements.size() - 1) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        t = elements.get(index);
        elements.remove(index);
        return t;

    }

    boolean Contains(T element) {

        return elements.contains(element);
    }

    void Swap(int findex, int sindex) {
        T temp = elements.get(findex);
        elements.set(findex, elements.get(sindex));
        elements.set(sindex, temp);
    }

    int countGreaterThan(T element) {
        int count = 0;
        for (T el : elements) {
            if (el.compareTo(element) > 0) count++;
        }
        return count;
    }

    T getMax() {
        return Collections.max(elements);
    }

    T getMin() {
        return Collections.min(elements);
    }

    int Size() {
        return elements.size();
    }

    T Get(int index) {
        if (index < 0 || index > this.elements.size() - 1) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        return elements.get(index);
    }

    void Sort() {
        Collections.sort(elements);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        elements.forEach(action);
    }
}
