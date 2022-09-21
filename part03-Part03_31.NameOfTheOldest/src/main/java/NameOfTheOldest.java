
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String nameOfOldest = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splitted = input.split(",");
            int age = Integer.valueOf(splitted[1]);
            String name = splitted[0];

            if (oldest < age) {
                oldest = age;
                nameOfOldest = name;
            }
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}