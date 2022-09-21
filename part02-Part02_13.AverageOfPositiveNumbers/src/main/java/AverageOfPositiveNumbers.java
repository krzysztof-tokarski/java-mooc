
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int numberOfNumbers = 0;
        
        while(true) {
//            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            if (input > 0) {
                total = total + input;
                numberOfNumbers = numberOfNumbers + 1;
            }
        }
        
        
        if (numberOfNumbers > 0) {
            System.out.println((total / (numberOfNumbers * 1.0)));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
