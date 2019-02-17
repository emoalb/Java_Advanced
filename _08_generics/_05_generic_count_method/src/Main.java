import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        ArrayList<Box<Double>> arraysBox = new ArrayList<>();
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            Double input = Double.parseDouble(console.nextLine());
            Box<Double> t = new Box<>(input);
            arraysBox.add(t);

        }
        Double compare = Double.parseDouble(console.nextLine());
        int count = 0;
        for (Box<Double> box : arraysBox) {
            if (box.compareTo(compare) > 0) count++;
        }
        System.out.println(count);
    }

}

