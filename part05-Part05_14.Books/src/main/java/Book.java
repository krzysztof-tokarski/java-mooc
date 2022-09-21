
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        if (!(compared instanceof Book)) return false;
        if (this == compared) return true;
        
        Book typecasted = (Book) compared;
        
        boolean sameName = this.name.equals(typecasted.name);
        boolean samePublicationYear = this.publicationYear == typecasted.publicationYear;
        
        boolean allPropsMatch = sameName && samePublicationYear;
        
        if (allPropsMatch) return true;
        
        return false;
    }

}
