/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzys
 */
public class Gift {

    private int weight;
    private String name;

    public Gift(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }
    
    public String toString() {
        return this.getName() + " (" + this.getWeight() + " kg)";
    }
}
