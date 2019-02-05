import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _03_custom_min_function {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Function<List<Integer>, Integer> min = Collections::min;
        List<Integer> input = Arrays.asList(console.nextLine().split(" ")).stream().map(a->Integer.parseInt(a)).collect(Collectors.toList());
       System.out.println(min.apply(input));


    }
}