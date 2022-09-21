
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
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("add")) {
                System.out.println("To add:");
                String todo = scanner.nextLine();
                this.todoList.add(todo);
            }
            
            if (command.equals("list")) {
                this.todoList.print();
            }
            
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int printListNum = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(printListNum);
            }
            
            if (command.equals("stop")) {
                break;
            }
        }
    }
}
