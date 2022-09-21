
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");

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
                first.add(commandArgument);
            }

            if (commandKeyWord.equals("move")) {
                if (first.contains() < commandArgument) {
                    commandArgument = first.contains();
                }
                
                first.remove(commandArgument);
                second.add(commandArgument);
            }

            if (commandKeyWord.equals("remove")) {
                second.remove(commandArgument);
            }

        }
    }

}
