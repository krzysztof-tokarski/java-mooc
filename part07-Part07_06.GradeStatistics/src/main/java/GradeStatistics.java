
import java.util.ArrayList;

public class GradeStatistics {
    private static int MINIMUM_PASSING_GRADE = 50;

    public static double average(ArrayList<Integer> gradesList) {
        double sum = 0;
        for (int num : gradesList) {
            sum += num;
        };

        return sum / gradesList.size();
    }

    public static double averageForPassingGrades(ArrayList<Integer> gradesList) {
        int passingGradesCount = 0;
        double sum = 0;
        for (int num : gradesList) {
            if (num < MINIMUM_PASSING_GRADE) {
                continue;
            }

            sum += num;
            passingGradesCount++;
        };

        return sum / passingGradesCount;
    }

    public static double passPercentage(ArrayList<Integer> gradesList) {
        int passingGradesCount = 0;
        for (int num : gradesList) {
            if (num < MINIMUM_PASSING_GRADE) {
                continue;
            }

            passingGradesCount++;
        };
        
        return 100.0 * passingGradesCount / gradesList.size();
    }

    public static int gradeDistributionForGrade(ArrayList<Integer> gradesList, int grade) {
        int bottomLimitForTheGrade = 0;
        int upperLimitForTheGrade = 49;

        int gradeDistrution = 0;

        switch (grade) {
            case 1:
                bottomLimitForTheGrade = 50;
                upperLimitForTheGrade = 59;
                break;
            case 2:
                bottomLimitForTheGrade = 60;
                upperLimitForTheGrade = 69;
                break;
            case 3:
                bottomLimitForTheGrade = 70;
                upperLimitForTheGrade = 79;
                break;
            case 4:
                bottomLimitForTheGrade = 80;
                upperLimitForTheGrade = 89;
                break;
            case 5:
                bottomLimitForTheGrade = 90;
                upperLimitForTheGrade = 100;
        }

        for (int points : gradesList) {
            if (points < bottomLimitForTheGrade || points > upperLimitForTheGrade) {
                continue;
            }

            gradeDistrution++;
        }
        return gradeDistrution;
    }
}
