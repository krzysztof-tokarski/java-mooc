
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        Integer num = Integer.valueOf(scan.nextLine());

        String message;

        if (num < 0) {
            message = "impossible!";
        } else if (num < 50) {
            message = "failed";
        } else if (num < 60) {
            message = "1";
        } else if (num < 70) {
            message = "2";
        } else if (num < 80) {
            message = "3";
        } else if (num < 90) {
            message = "4";
        } else if (num <= 100) {
            message = "5";
        } else {
            message = "incredible!";
        }
        
        System.out.println(message);
    }
}
