
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (!(compared instanceof Person)) {
            return false;
        }

        if (this == compared) {
            return true;
        }
        
        Person typecasted = (Person) compared;
        
        boolean sameName = this.name == typecasted.name;
        boolean sameHeight = this.height == typecasted.height;
        boolean sameWeight = this.weight == typecasted.weight;
        boolean sameBirthday = this.birthday.equals(typecasted.birthday);
        
        boolean allPropertiesMatch = sameName && sameHeight && sameWeight && sameBirthday;
        
        if (allPropertiesMatch) {
            return true;
        }

        return false;
    }

    // implement an equals method here for checking the equality of objects
}
