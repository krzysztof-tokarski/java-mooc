/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzys
 */
public class Container {
    int amountOfLiquid;
    
    public int contains() {
        return this.amountOfLiquid;
    }
    
    public void add(int amount) {
        if (amount < 0) return;
        
        int increasedAmount = this.contains() + amount;
        
        if (increasedAmount > 100) {
            this.amountOfLiquid = 100;
        } else {
            this.amountOfLiquid += amount;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) return;
        
        int decreasedAmount = this.contains() - amount;
        
        if (decreasedAmount < 0) {
            this.amountOfLiquid = 0;
        } else {
            this.amountOfLiquid -= amount;
        }
        
    }
    
    public String toString() {
        return this.contains() + "/100";
    }
}
