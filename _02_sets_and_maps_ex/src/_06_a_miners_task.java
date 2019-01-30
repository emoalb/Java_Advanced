import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;


public class _06_a_miners_task {
    public static void main(String[] args) {
        Map<String, Integer> resources = new HashMap<>();
        Scanner console = new Scanner(System.in);
        String input = new String();
        while (true) {
            input = console.nextLine();
            if(input.equals("stop"))break;
            String resource = input;
            input = console.nextLine();
            int quantity = Integer.parseInt(input);
            if(!resources.containsKey(resource)) {
                resources.put(resource, quantity);
            }else {
                resources.replace(resource, resources.get(resource) + quantity);
            }
        }
        resources.forEach((key,val)->System.out.println(key+" -> " + val));
    }
}
