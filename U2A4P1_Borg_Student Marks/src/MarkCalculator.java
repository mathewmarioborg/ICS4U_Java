
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathew Borg
 */
public class MarkCalculator {

    public static double studentAverage(ArrayList<ArrayList<String>> studentData, String firstName, String LastName) {
        double theStudentAverage = 0;
        for (int i = 0; i < studentData.size(); i++) {
            for (int j = 0; j < studentData.get(i).size(); j++) {
                if(studentData.get(i).get(j).equals(firstName)){
                   System.out.println("i=" + i + " j=" + j); 
                   System.out.println(studentData.get(i).get(0)); 
                   System.out.println(studentData.get(i).get(1));
                   System.out.println(studentData.get(i).get(2));
                   System.out.println(studentData.get(i).get(3));
                   System.out.println(studentData.get(i).get(4));
                   System.out.println(studentData.get(i).get(5));
                }
            }
        }
        
        return theStudentAverage;
    }

    public static double courseAverage(ArrayList<ArrayList<String>> studentData) {
        double theCourseAverage = 0;

        return theCourseAverage;
    }
}
