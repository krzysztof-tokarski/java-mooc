
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        ArrayList<Integer> years = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splitted = input.split(",");
            String name = splitted[0];
            int year = Integer.valueOf(splitted[1]);
            
            years.add(year);

            if (longestName.length() < name.length()) {
                longestName = name;
            }
        }
        
        int sum = 0;
        for (int num: years) {
            sum+=num;
        }
        
        double average = sum * 1.0 / years.size();

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
