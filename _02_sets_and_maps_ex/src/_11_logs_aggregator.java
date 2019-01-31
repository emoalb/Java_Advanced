import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class _11_logs_aggregator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        TreeMap<String, Integer> nameCount = new TreeMap<>();
        TreeMap<String, TreeSet<String>> nameIps = new TreeMap<>();
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = console.nextLine().split(" ");
            String ip = input[0];
            String name = input[1];
            String count = input[2];
            nameCount.putIfAbsent(name, 0);
            nameIps.putIfAbsent(name, new TreeSet<>());
            TreeSet<String> ips = nameIps.get(name);
            ips.add(ip);
            nameCount.put(name, nameCount.get(name) + Integer.parseInt(count));
        }
        nameCount.forEach((name, count) -> {
            System.out.print(name + ": " + count + " [");
            System.out.print(String.join(", ", nameIps.get(name)));
            System.out.println("]");
        });
    }
}
