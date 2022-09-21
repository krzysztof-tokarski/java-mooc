
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Boolean notThereYet = true;
        
        while (notThereYet) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 4) {
                notThereYet = false;
            }
        }

    }
}
