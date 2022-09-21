/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzys
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably() {
        double affordableRate = 2.60;
        double balanceAfterTransaction = this.balance - affordableRate;
        
        if (balanceAfterTransaction < 0) return;
        
        this.balance = balanceAfterTransaction;
    }
        
    public void eatHeartily() {
        double heartilyRate = 4.60;
        double balanceAfterTransaction = this.balance - heartilyRate;
        
        if (balanceAfterTransaction < 0) return;
        
        this.balance = balanceAfterTransaction;
    }
    
    public void addMoney(double addedMoney) {
        if (addedMoney < 0) return; 
        
        double maxAmount = 150.00;
        double balanceAfterTransaction = this.balance + addedMoney;
      
        if (balanceAfterTransaction > maxAmount) {
            this.balance = maxAmount;
        } else {
            this.balance = balanceAfterTransaction;
        }
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
