
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splitted = input.split(",");
            int age = Integer.valueOf(splitted[1]);

            if (oldest < age) {
                oldest = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
