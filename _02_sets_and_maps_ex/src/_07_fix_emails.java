import java.util.*;

public class _07_fix_emails {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Map<String, String> contacts = new LinkedHashMap<>();
        String input = new String();
        while (true) {
            input = console.nextLine();
            if (input.equals("stop")) break;
            String userName = input;
            input = console.nextLine();
            String email = input;
            String domain = email.split("@")[1].split("\\.")[1].toLowerCase();
            if (!((domain.equals("uk")) || (domain.equals("us")) || (domain.equals("com")))) {
                contacts.put(userName, email);
            }

        }
contacts.forEach((key,val)->System.out.println(key + " -> " + val));
    }
}
