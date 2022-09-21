
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
public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int currentTotalWeight = this.totalWeight();
        int totalWeightIfNewItemIsAdded = currentTotalWeight + item.getWeight();
        
        if (totalWeightIfNewItemIsAdded > this.maxWeight) return;
        
        this.items.add(item);
    }
    
    public int totalWeight() {
        int sum = 0;
        
        for (Item item: this.items) {
            sum += item.getWeight();
        }
        
        return sum;
    }
    
    public String toString() {
        if (this.items.isEmpty()) return "no items (0 kg)";
        
        String itemsNounDependentOnTheAmountOfItems = this.items.size() == 1 ? " item (" : " items (";
        
        return this.items.size() + itemsNounDependentOnTheAmountOfItems + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) return null;
        
        Item heaviestItem = this.items.get(0);
        for (Item item: items) {
            heaviestItem = item.getWeight() > heaviestItem.getWeight() ? item : heaviestItem;
        }
        
        return heaviestItem;
    }
}
