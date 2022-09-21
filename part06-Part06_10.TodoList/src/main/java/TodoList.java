
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzys
 */
public class TodoList {
    private ArrayList<String> todos = new ArrayList<>();
    
    public void add(String task) {
        this.todos.add(task);
    }
    
    public void print() {
        for (int i = 0; i < todos.size(); i++) {
            System.out.println(i+1 + ": " + todos.get(i));
        }
    }
    
    public void remove(int number) {
        todos.remove(number-1);
    }
}
