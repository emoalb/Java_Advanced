import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _06_predicate_for_names {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer number = Integer.parseInt(console.nextLine());
        Predicate<String> isSmaller = str->str.length()-1>=number;

        List<String> input =Arrays.stream(console.nextLine().split(" ")).collect(Collectors.toList());
        input.removeIf(x -> isSmaller.test(x));
        input.forEach(System.out::println);
    }
}
