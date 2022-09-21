
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scan.nextLine();

        Boolean match = str1.equals(str2);

        if (match) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
