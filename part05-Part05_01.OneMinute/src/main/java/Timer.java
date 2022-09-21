/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzys
 */
public class Timer {

    private ClockHand secondsHand;
    private ClockHand centisecondsHand;

    public Timer() {
        this.secondsHand = new ClockHand(60);
        this.centisecondsHand = new ClockHand(100);
    }
    
    public void advance() {
        this.centisecondsHand.advance();
        
        if (this.centisecondsHand.value() != 0) return;
        
        this.secondsHand.advance();
    }
    
    public String toString() {
        return this.secondsHand + ":" + this.centisecondsHand;
    }
}
