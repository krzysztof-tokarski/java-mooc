
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
public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner; 
    
    public UserInterface (JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
        
        while(true) {
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                this.jokeManager.addJoke(joke);
                continue;
            }
            
            if (command.equals("2")) {
                String joke = this.jokeManager.drawJoke();
                System.out.println(joke);
            }
            
            if (command.equals("3")) {
                this.jokeManager.printJokes();
            }
            
            System.out.println("Unknown command.");
        }
    }
}
