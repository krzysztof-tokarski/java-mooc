
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
public class Room {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.getPersons().add(person);
    }

    public boolean isEmpty() {
        return this.getPersons().isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.getPersons().isEmpty()) {
            return null;
        }

        Person shortest = this.getPersons().get(0);

        for (Person person : persons) {
            shortest = person.getHeight() < shortest.getHeight() ? person : shortest;
        }

        return shortest;
    }

    public Person take() {
        if (this.getPersons().isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        this.getPersons().remove(shortest);
        
        return shortest;
    }
}
