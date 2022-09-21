
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
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = this.totalWeight();
        int totalWeightIncreasedByTheNewSuitcase = totalWeight + suitcase.totalWeight();
        
        if (totalWeightIncreasedByTheNewSuitcase > this.maximumWeight) return;
        
        this.suitcases.add(suitcase);
    }
    
    public int totalWeight() {
        int sum = 0;
        
        for (Suitcase suitcase: this.suitcases) {
            sum += suitcase.totalWeight();
        }
        
        return sum;
    }
    
    public String toString() {
        if (this.suitcases.isEmpty()) return "no items (0 kg)";
        
        String suitcasesNounDependentOnTheAmountOfItems = this.suitcases.size() == 1 ? " suitcase (" : " suitcases (";
        
        return this.suitcases.size() + suitcasesNounDependentOnTheAmountOfItems + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
