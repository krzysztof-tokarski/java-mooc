
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        
        boolean num1IsBigger = num1 > num2;
        boolean numsAreEqual = num1 == num2;
        
        if (numsAreEqual) {
            System.out.println(num1 + " is equal to " + num2 + '.');
        } else if (num1IsBigger) {
            System.out.println(num1 + " is greater than " + num2 + '.');
        } else {
            System.out.println(num1 + " is smaller than " + num2 + '.');
        }
        
    }
}
