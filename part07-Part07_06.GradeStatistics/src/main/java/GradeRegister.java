
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
public class GradeRegister {

    private ArrayList<Integer> gradePointsList = new ArrayList<>();
    private int BOTTOM_LIMIT_OF_POINTS_PER_EXAM = 0;
    private int UPPER_LIMIT_OF_POINTS_PER_EXAM = 100;

    public void add(int gradePoints) {
        if (gradePoints < this.BOTTOM_LIMIT_OF_POINTS_PER_EXAM || gradePoints > this.UPPER_LIMIT_OF_POINTS_PER_EXAM) {
            return;
        }

        this.gradePointsList.add(gradePoints);
    }
    
    public ArrayList<Integer> getGradePointsList() {
        return this.gradePointsList;
    }
}
