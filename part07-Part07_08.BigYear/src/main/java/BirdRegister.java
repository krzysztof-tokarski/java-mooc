
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
public class BirdRegister {
    private ArrayList<Bird> birds = new ArrayList();
    
    public ArrayList<Bird> getBirdsList() {
        return this.birds;
    }
    
    public void add(Bird bird) {
        this.getBirdsList().add(bird);
    }
}
