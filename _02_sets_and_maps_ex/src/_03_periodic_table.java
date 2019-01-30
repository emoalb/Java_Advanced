
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class _03_periodic_table {
    public static void main(String[] args) {
        TreeSet<String> elements = new TreeSet<>();
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        for(int i =0;i<n;i++){
            String[] input = console.nextLine().split(" ");
            elements.addAll(Arrays.asList(input));
        }
        System.out.println(String.join(" ",elements));
    }
}
