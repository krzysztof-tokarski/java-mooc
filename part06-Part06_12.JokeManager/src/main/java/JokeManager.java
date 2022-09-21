
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzys
 */
public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();
    
    public ArrayList<String> getJokes() {
        return this.jokes;
    }
    
    public void addJoke(String joke) {
        this.getJokes().add(joke);
    }
    
    public String drawJoke() {
        if (this.getJokes().isEmpty()) return "Jokes are in short supply.";
        
        return this.getJokes().get(this.getRandomIndex());
    }
    
    private int getRandomIndex() {
        Random random = new Random();
        return random.nextInt(this.getJokes().size());
    }
    
    public void printJokes() {
        for (String joke : this.getJokes()) {
            System.out.println(joke);
        }
    }
}
