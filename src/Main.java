import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        List<People> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            People mensch = new People();
            String[] input = console.nextLine().split(" ");
           mensch.setName(input[0]);
            mensch.setAge(Integer.parseInt(input[1]));
            people.add(mensch);
        }
        Collections.sort(people);
        people.stream().filter(a -> a.getAge() > 30).forEach(a -> System.out.println(a.getName() + " - " + a.getAge()));

    }
}
