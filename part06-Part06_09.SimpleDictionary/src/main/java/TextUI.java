
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author krzys
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = this.scanner.nextLine();
                System.out.println("Translation: ");
                String translation = this.scanner.nextLine();
                this.simpleDictionary.add(word, translation);
            }

            if (command.equals("search")) {
                System.out.println("To be translated:: ");
                String word = this.scanner.nextLine();
                String translation = this.simpleDictionary.translate(word);
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                    continue;
                }
                
                System.out.println("Translation: " + translation);
            }

            System.out.println("Unknown command");
        }

    }
}
