
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister gradeRegister = new GradeRegister();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            gradeRegister.add(input);
        }

        
        ArrayList<Integer> gradesPointsList = gradeRegister.getGradePointsList();
        double pointsAverage = GradeStatistics.average(gradesPointsList);
        double passingPointsAverage = GradeStatistics.averageForPassingGrades(gradesPointsList);
        String passingPointsAverageInsert = passingPointsAverage > 0 ? "" + passingPointsAverage : "-";
        double passPercentage = GradeStatistics.passPercentage(gradesPointsList);
        System.out.println("Point average (all): " + pointsAverage);
        System.out.println("Point average (passing): " + passingPointsAverageInsert);
        System.out.println("Pass percentage: " + passPercentage);
        System.out.println("Grade distribution:");
        
        int HIGHEST_GRADE = 5;
        int LOWEST_GRADE = 0;
        
        for (int i = HIGHEST_GRADE; i > LOWEST_GRADE-1; i--) {
            int instancesOfTheGrade = GradeStatistics.gradeDistributionForGrade(gradesPointsList, i);
            System.out.println("");
        
            System.out.print(i + ": ");
            UserInterface.printStars(instancesOfTheGrade);
        }
    }
}
