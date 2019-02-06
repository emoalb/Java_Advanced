import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _07_find_the_smallest_element {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Integer> input = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>,Integer> minElement  = x-> {Collections.reverse(x);
      return x.size()- x.indexOf(Collections.min(x)) -1;
        };
        System.out.println(minElement.apply(input));
    }
}
