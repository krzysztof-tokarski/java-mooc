
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                return;
            }

            String[] splitted = input.split(" ");

            for (String word : splitted) {
                if (!word.contains("av")) continue;
                
                System.out.println(word);
            }
        }
    }
}
