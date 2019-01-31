import com.sun.source.tree.Tree;

import java.util.*;

public class _12_legendary_farming {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        TreeMap<String, Integer> itemsFarmed = new TreeMap<>();
        TreeMap<String, Integer> keyItems = new TreeMap<>();
        LinkedHashMap<String, Integer> kkeyItems = new LinkedHashMap<>();
        keyItems.put("fragments", 0);
        keyItems.put("shards", 0);

        keyItems.put("motes", 0);


        boolean ready = false;
        String output = new String();
        while (!ready) {
            String[] input = console.nextLine().split(" ");
            for (int i = 0; i < input.length - 1; i = i + 2) {
                String item = input[i + 1].toLowerCase();
                int count = Integer.parseInt(input[i]);
                switch (item) {
                    case "fragments":
                        if (!ready) {
                            keyItems.putIfAbsent(item, 0);
                            keyItems.put(item, keyItems.get(item) + count);
                        }
                        if (keyItems.get(item) >= 250) {
                            ready = true;
                            keyItems.put(item, keyItems.get(item) - 250);
                            output = "Valanyr";
                        }
                        break;
                    case "motes":
                        if (!ready) {
                            keyItems.putIfAbsent(item, 0);
                            keyItems.put(item, keyItems.get(item) + count);
                        }
                        if (keyItems.get(item) >= 250) {
                            ready = true;
                            keyItems.put(item, keyItems.get(item) - 250);
                            output = "Dragonwrath";
                        }
                        break;
                    case "shards":
                        if (!ready) {
                            keyItems.putIfAbsent(item, 0);
                            keyItems.put(item, keyItems.get(item) + count);
                        }
                        if (keyItems.get(item) >= 250) {
                            ready = true;
                            keyItems.put(item, keyItems.get(item) - 250);
                            output = "Shadowmourne";
                        }
                        break;
                    default:
                        if (!ready) {
                            if(count!=0)itemsFarmed.putIfAbsent(item, 0);
                            itemsFarmed.put(item, itemsFarmed.get(item) + count);
                        }

                        break;
                }
            }
        }
        keyItems.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> kkeyItems.put(x.getKey(), x.getValue()));
        System.out.println(output + " obtained!");
        kkeyItems.forEach((item, count) -> {
            System.out.println(item + ": " + count);
        });
        itemsFarmed.forEach((item, count) -> {
            System.out.println(item + ": " + count);
        });
    }
}
