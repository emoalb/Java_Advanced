import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Box<Integer>> arraysBox = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            Integer input = Integer.parseInt(console.nextLine());
            Box<Integer> t = new Box<>(input);
            arraysBox.add(t);
        }
        int[] positions = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Swap(arraysBox, positions[0], positions[1]).forEach((box) -> System.out.println(box.toString()));


    }

    private static <T> ArrayList<T> Swap(ArrayList<T> array, int left, int right) {
        T temp = array.get(left);
        array.set(left, array.get(right));
        array.set(right, temp);

        return array;
    }

}

