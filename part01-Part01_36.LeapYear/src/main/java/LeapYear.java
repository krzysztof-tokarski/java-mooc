
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        Integer year = Integer.valueOf(scan.nextLine());

        Boolean isDivisableBy4 = year % 4 == 0;
        Boolean isDivisableBy100 = year % 100 == 0;
        Boolean isDivisableBy400 = year % 400 == 0;

        if ((isDivisableBy4 && isDivisableBy100 && isDivisableBy400) || (isDivisableBy4 && !isDivisableBy100)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }

}

