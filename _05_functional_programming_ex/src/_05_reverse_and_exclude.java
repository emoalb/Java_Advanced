import java.util.*;
        import java.util.function.BiFunction;
        import java.util.stream.Collectors;

public class _05_reverse_and_exclude {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BiFunction<Integer, Integer, Boolean> isDiv = (in, num) -> in % num == 0;
        List<Integer> input = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Integer number = Integer.parseInt(console.nextLine());
        input.removeIf(element -> isDiv.apply(element, number));
        Collections.reverse(input);
        input.forEach(x -> System.out.print(x + " "));
    }
}
