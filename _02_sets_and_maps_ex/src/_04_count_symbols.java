
import java.util.Scanner;
import java.util.TreeMap;

public class _04_count_symbols {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char [] symbols = console.nextLine().toCharArray();
        TreeMap<Character,Integer> symbolCount = new TreeMap<>();
        for (Character symbol : symbols) {
            symbolCount.putIfAbsent(symbol, 0);
            symbolCount.replace(symbol, symbolCount.get(symbol) + 1);
        }
        symbolCount.forEach((key,val)->System.out.println(key+": "+val+" time/s"));
    }
}
