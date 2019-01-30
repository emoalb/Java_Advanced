import java.util.Scanner;
import java.util.TreeMap;

public class _05_phonebool {
    public static void main(String[] args) {
        TreeMap<String, String> phonebook = new TreeMap<>();
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        while (!input.equals("search")) {
            String[] credentials = input.split("-");
            phonebook.put(credentials[0], credentials[1]);
            input = console.nextLine();
        }
        input = console.nextLine();
        while (!input.equals("stop")) {
            if (!phonebook.containsKey(input)) {
                System.out.println("Contact " + input + " does not exist.");
            } else {
                System.out.println(input + " -> " + phonebook.get(input));
            }
            input = console.nextLine();
        }
    }
}
