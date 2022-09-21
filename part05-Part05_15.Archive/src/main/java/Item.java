/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzys
 */
public class Item {

    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public boolean equals(Object compared) {
        if (!(compared instanceof Item)) {
            return false;
        }
        if (this == compared) {
            return true;
        }

        Item typecasted = (Item) compared;

        boolean sameId = this.identifier.equals(typecasted.identifier);

        if (sameId) {
            return true;
        }

        return false;
    }

    public String getName() {
        return this.name;
    }

    public String getIdentifier() {
        return this.identifier;
    }
    
    public String toString() {
        return this.getIdentifier() + ": " + this.getName();
    } 
}
