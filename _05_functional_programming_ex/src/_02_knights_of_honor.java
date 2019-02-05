import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.function.Consumer;

public class _02_knights_of_honor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Consumer<String> print = i -> System.out.println("Sir "+i);
        LinkedHashSet<String> input = new LinkedHashSet<>(Arrays.asList(console.nextLine().split(" ")));
        input.forEach(a -> print.accept(a));
    }
}
