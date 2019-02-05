
import java.util.*;
import java.util.function.Consumer;

public class _01_consumer_print {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Consumer<String> print = i -> System.out.println(i);
        LinkedHashSet<String> input = new LinkedHashSet<>(Arrays.asList(console.nextLine().split(" ")));
        input.forEach(a -> print.accept(a));
    }
}
