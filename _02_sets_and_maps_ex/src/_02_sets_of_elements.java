import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _02_sets_of_elements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] lengths = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        LinkedHashSet<Integer> m = new LinkedHashSet<>();
        LinkedHashSet<Integer> n = new LinkedHashSet<>();
        LinkedHashSet<Integer> repeat = new LinkedHashSet<>();
        for (int i = 0; i < lengths[0] + lengths[1]; i++) {
           int input = Integer.parseInt(console.nextLine());
           if(i<lengths[0]) {
               m.add(input);
           }else {

               n.add(input);
           }

        }
        for(int el:m) {
            if(n.contains(el)){
                repeat.add(el);
            }
        }
 repeat.forEach(x->System.out.print(x+" "));
    }
}
