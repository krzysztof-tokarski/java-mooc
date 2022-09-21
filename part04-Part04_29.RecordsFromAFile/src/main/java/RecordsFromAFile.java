
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            
            while(reader.hasNextLine()) {
                
                String inputRow = reader.nextLine();
                
                if (inputRow.isEmpty()) continue;
                
                String[] splitted = inputRow.split(",");
                String name = splitted[0];
                int age = Integer.valueOf(splitted[1]);
                
                String yearFormat = age == 1 ? " year" : " years";
                
                System.out.println(name + ", age: " + age + yearFormat);
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
