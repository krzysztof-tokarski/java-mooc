
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer giftValue = Integer.valueOf(scan.nextLine());

        Double taxValue;

        if (giftValue < 5000) {
            taxValue = 0.0;
        } else if (giftValue == 5000) {
            taxValue = 100.0;
        } else if (giftValue < 25000) {
            taxValue = 100 + (giftValue - 5000) * 0.08;
        } else if (giftValue == 25000) {
            taxValue = 1700.0;
        } else if (giftValue <= 55000) {
            taxValue = 1700.0 + (giftValue - 25000) * 0.1;
        } else if (giftValue == 55000) {
            taxValue = 4700.0;
        } else if (giftValue <= 200000) {
            taxValue = 4700.0 + (giftValue - 55000) * 0.12;
        } else if (giftValue == 200000) {
            taxValue = 22100.0;
        } else if (giftValue <= 1000000) {
            taxValue = 22100.0 + (giftValue - 200000) * 0.15;
        } else if (giftValue == 1000000) {
            taxValue = 142100.0;
        } else {
            taxValue = 142100.0 + (giftValue - 1000000) * 0.17;
        }

        if (taxValue > 0) {
            System.out.println("Tax: " + taxValue);
        } else {
            System.out.println("No tax!");
        }
    }
}
