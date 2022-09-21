/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzys
 */
public class Cube {
    private int edgelength;
    
    public Cube(int edgelength) {
        this.edgelength = edgelength;
    }
    
    public int volume() {
        return (int) Math.pow(edgelength, 3);
    }
    
    public String toString() {
        return "The length of the edge is " + this.edgelength + " and the volume " + this.volume();
    }
}
