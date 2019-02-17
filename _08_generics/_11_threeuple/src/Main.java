import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] firstInput = console.nextLine().split(" ");
        Tuple<String, String,String> namesAndAdress = new Tuple<>(firstInput[0]+" " + firstInput[1], firstInput[2],firstInput[3]);
        String[] secondInput = console.nextLine().split(" ");
        Tuple<String, Integer,Boolean> namesAndBeer = new Tuple<>(secondInput[0], Integer.parseInt(secondInput[1]),secondInput[2].equals("drunk"));
        String[] thirdInput = console.nextLine().split(" ");
        Tuple<String, Double,String> integerAndDouble = new Tuple<>(thirdInput[0], Double.parseDouble(thirdInput[1]),thirdInput[2]);
        System.out.println(namesAndAdress.toString());
        System.out.println(namesAndBeer.toString());
        System.out.println(integerAndDouble.toString());
    }
}
