
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int secondsInADay = 86400;
        System.out.println("How many days would you like to convert to seconds?");
        int numberOfDays = Integer.valueOf(scanner.nextLine());

         System.out.println(secondsInADay * numberOfDays);
        // Write your program here

    }
}
