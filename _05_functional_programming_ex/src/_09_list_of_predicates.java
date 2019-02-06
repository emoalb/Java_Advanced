import java.util.*;
        import java.util.function.Predicate;
        import java.util.stream.Collectors;

public class _09_list_of_predicates {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        List<Integer> input = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Predicate<Integer> isDiv = (a) -> {
            for (Integer b : input) {
                if (b == 0) continue;
                if (a % b != 0) {
                    return false;
                }
            }
            return true;
        };
        for (Integer a = 1; a <= n; a++) {
            if (isDiv.test(a)) {
                System.out.printf("%d ", a);
            }
        }
    }
}


