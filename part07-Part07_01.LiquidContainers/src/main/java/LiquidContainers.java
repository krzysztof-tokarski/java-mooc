
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] splitted = input.split(" ");
            String commandKeyWord = splitted[0];
            
            if (commandKeyWord.equals("quit")) {
                break;
            }
            
            int commandArgument = 0;
            
            if (splitted.length == 2) {
                commandArgument = Integer.valueOf(splitted[1]);
            } else {
                continue;
            }


            if (commandKeyWord.equals("add")) {
                if (commandArgument < 0) {
                    continue;
                }
                
                first += commandArgument;

                if (first > 100) {
                    first = 100;
                }
            }

            if (commandKeyWord.equals("move")) {
                if (commandArgument < 0) {
                    continue;
                }
                
                if (commandArgument > first) {
                    commandArgument = first;
                }

                second += commandArgument;
                first -= commandArgument;

                if (second > 100) {
                    second = 100;
                }
            }

            if (commandKeyWord.equals("remove")) {
                if (commandArgument < 0) {
                    continue;
                }
                
                if (commandArgument > second) {
                    commandArgument = second;
                }

                second -= commandArgument;
            }

        }
    }

}
