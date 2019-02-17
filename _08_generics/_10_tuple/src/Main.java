import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] firstInput = console.nextLine().split(" ");
        Tuple<String, String> namesAndAdress = new Tuple<>(firstInput[0]+" " + firstInput[1], firstInput[2]);
        String[] secondInput = console.nextLine().split(" ");
        Tuple<String, Integer> namesAndBeer = new Tuple<>(secondInput[0], Integer.parseInt(secondInput[1]));
        String[] thirdInput = console.nextLine().split(" ");
        Tuple<Integer, Double> integerAndDouble = new Tuple<>(Integer.parseInt(thirdInput[0]), Double.parseDouble(thirdInput[1]));
        System.out.println(namesAndAdress.toString());
        System.out.println(namesAndBeer.toString());
        System.out.println(integerAndDouble.toString());
    }
}
