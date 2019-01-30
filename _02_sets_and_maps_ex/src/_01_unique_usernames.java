import java.util.LinkedHashSet;
import java.util.Scanner;

public class _01_unique_usernames {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        LinkedHashSet<String> userNames =  new LinkedHashSet<>();
        for(int i = 0; i<n;i++){
            userNames.add(console.nextLine());
        }
        System.out.println(String.join("\n",userNames));
    }
}
