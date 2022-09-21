
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        Integer num = Integer.valueOf(scan.nextLine());

        if (num < 2015){
            System.out.println("Ancient history!");
        }
    }
}
