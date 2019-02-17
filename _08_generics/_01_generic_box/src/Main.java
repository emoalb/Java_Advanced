
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0 ; i < n  ; i++){
            Integer input = Integer.parseInt(console.nextLine());
            Box<Integer> box = new Box<>(input);
            System.out.println(box.toString());
        }
    }
}
