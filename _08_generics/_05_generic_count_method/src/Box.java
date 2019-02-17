public class Box<T extends  Comparable<T>> implements Comparable<T> {
    private String type = new String();
    private T t;

    Box(T t) {
        type = t.getClass().getName();
        this.t = t;
    }

    public T getBox() {
        return this.t;
    }

    @Override
    public String toString() {
        return type + ": " + t.toString();
    }

    @Override
    public int compareTo(T o) {
        return this.getBox().compareTo(o);
    }
}
