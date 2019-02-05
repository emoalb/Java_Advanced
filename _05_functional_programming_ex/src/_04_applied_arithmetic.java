import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.function.Function;
        import java.util.stream.Collectors;

public class _04_applied_arithmetic {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Function<List<Integer>, List<Integer>> add = x -> x.stream().map(i -> i + 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = x -> x.stream().map(i -> i * 2).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = x -> x.stream().map(i -> i - 1).collect(Collectors.toList());

        List<Integer> input = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = console.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    input = add.apply(input);
                    break;
                case "multiply":
                    input = multiply.apply(input);
                    break;
                case "subtract":
                    input = subtract.apply(input);
                    break;
                case "print":
                    input.forEach(x->System.out.print(x+" "));
                    System.out.println();
                    break;
            }
            command = console.nextLine();


        }

    }
}
