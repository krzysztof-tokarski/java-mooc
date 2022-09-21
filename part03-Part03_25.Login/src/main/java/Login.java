
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] user1 = {"alex", "sunshine"};
        String[] user2 = {"emma", "haskell"};
        
        String[][] users = {user1, user2};
        
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        for (String[] userArray: users) {
            boolean usernameMatch = userArray[0].equals(username);
            boolean passwordMatch = userArray[1].equals(password);
            
            if (usernameMatch && passwordMatch) {
                System.out.println("You have successfully logged in!");
                return;
            }
        }
        
        System.out.println("Incorrect username or password!");

    }
}
