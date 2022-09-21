
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password?");
        String usersPassword = scan.nextLine();
        String correctPassword = "Caput Draconis";

        Boolean match = usersPassword.equals(correctPassword);

        if (match) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

        // Write your program here 
    }
}
