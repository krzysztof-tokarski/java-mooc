/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzys
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationsCount = 0;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getObservationsCount() {
        return observationsCount;
    }
    
    public void registerObservation() {
        this.observationsCount++;
    }
    
    public String toString() {
        return this.getName() + "(" + this.getLatinName() + "): " + this.getObservationsCount() + " observations";
    }
}
