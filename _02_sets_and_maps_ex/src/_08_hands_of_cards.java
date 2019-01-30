import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _08_hands_of_cards {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashSet<String>> hands = new LinkedHashMap<>();
        String input = console.nextLine();
        while (!input.equals("JOKER")) {
            String parse[] = input.split(":");
            String name = parse[0];
            String[] set = parse[1].trim().split(", ");
            LinkedHashSet<String> hashset = new LinkedHashSet<>();
            hands.putIfAbsent(name, hashset);
            hashset.addAll(hands.get(name));
            hashset.addAll(Arrays.asList(set));
            hands.put(name, hashset);
            input = console.nextLine();
        }

        hands.forEach((key, hashSet) -> {
            String[] cards = hashSet.toArray(new String[hashSet.size()]);
            int sum = 0;
for(String card:cards) {
int result =0;
String multi  = card.substring(0,card.length()-1);
String car = card.substring(card.length()-1);
switch (multi){
    case "2":
        result = 2;
        break;
    case "3":
        result = 3;
        break;
    case "4":
        result = 4;
        break;
    case "5":
        result = 5;
        break;
    case "6":
        result = 6;
        break;
    case "7":
        result = 7;
        break;
    case "8":
        result = 8;
        break;
    case "9":
        result = 9;
        break;
    case "10":
        result = 10;
        break;
    case "J":
        result = 11;
        break;
    case "Q":
        result = 12;
        break;
    case "K":
        result = 13;
        break;
    case "A":
        result = 14;
        break;
}
switch (car){
    case "S":
        result = result * 4;
        break;
    case "H":
        result = result * 3;
        break;
    case "D":
        result = result * 2;
        break;
    case "C":
        result = result * 1;
        break;
}
sum+=result;
}
System.out.println(key+": "+sum);
        });
    }
}
