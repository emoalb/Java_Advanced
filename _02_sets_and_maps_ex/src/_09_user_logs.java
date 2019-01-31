import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class _09_user_logs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Integer>> userAttackData = new TreeMap<>();
        String input = console.nextLine();
        while (!input.equals("end")) {
            LinkedHashMap<String, Integer> ipAttackCount = new LinkedHashMap<>();
            String[] parsedData = input.split(" ");
            String ip = parsedData[0].split("=")[1];
            String user = parsedData[2].split("=")[1];
            userAttackData.putIfAbsent(user, new LinkedHashMap<>());
            ipAttackCount = userAttackData.get(user);
            ipAttackCount.putIfAbsent(ip, 0);
            ipAttackCount.put(ip, ipAttackCount.get(ip) + 1);
            userAttackData.put(user, ipAttackCount);

            input = console.nextLine();
        }
        userAttackData.forEach((user, attackData) -> {
            System.out.println(user + ":");
            LinkedHashSet<String> output = new LinkedHashSet<>();
            attackData.forEach((ip, count) -> {
                output.add(ip + " => " + count + ", ");
            });
            String[] out = output.toArray(new String[0]);
            out[out.length - 1] = out[out.length - 1].substring(0, out[out.length - 1].length() - 2);
            for (String o : out) {
                System.out.print(o);
            }
            System.out.println(".");
        });
    }
}
