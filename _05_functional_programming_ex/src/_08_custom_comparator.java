import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class _08_custom_comparator {
    public static void main(String[] args) {
        Scanner console  = new Scanner(System.in);
        List<Integer> input = Arrays.stream(console.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Comparator<Integer> comparator = (a, b)-> Math.abs(a % 2) == Math.abs(b % 2) ? (a == b ? 0 : (a < b ? -1 : 1)) : (Math.abs(a % 2) == 0 ? -1 : 1);
        Integer[] arr = new Integer[input.size()];
        input.toArray(arr);
        Arrays.sort(arr,comparator);
        for (Integer el:arr){
            System.out.print(el+" ");
        }

        }
    }

