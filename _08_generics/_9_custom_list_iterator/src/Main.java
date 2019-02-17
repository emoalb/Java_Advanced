import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        CustomList<String> myList = new CustomList<>();
        String input = console.nextLine();
        while (!input.equals("END")) {
            String[] commands = input.split(" ");
            switch (commands[0]) {
                case "Add":
                    myList.add(commands[1]);
                    break;
                case "Max":
                    System.out.println(myList.getMax());
                    break;
                case "Min":
                    System.out.println(myList.getMin());
                    break;
                case "Remove":
                    myList.remove(Integer.parseInt(commands[1]));
                    break;
                case "Greater":
                    System.out.println(myList.countGreaterThan(commands[1]));
                    break;
                case "Contains":
                    System.out.println(myList.Contains(commands[1]));
                    break;
                case "Swap":
                    myList.Swap(Integer.parseInt(commands[1]),Integer.parseInt(commands[2]));
                    break;
                case "Print":
                   myList.forEach(System.out::println);
                    break;
                case "Sort":
                    myList.Sort();
                    break;
            }
            input = console.nextLine();
        }
    }

}
