public class Box<T> {
    private String type = new String();
    private T t;

    public Box(T t) {
        type = t.getClass().getName();
        this.t=t;
    }

    @Override
    public String toString() {
        return type + ": " + t.toString();
    }
}
