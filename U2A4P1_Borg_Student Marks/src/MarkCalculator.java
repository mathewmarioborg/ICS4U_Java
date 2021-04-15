
import java.util.ArrayList;

public class MarkCalculator {

    static double studentTestOne, studentTestTwo, studentTestThree, studentTestFour;

    public static double studentAverage(ArrayList<ArrayList<Double>> studentTestData, ArrayList<ArrayList<String>> studentNameData, String firstName, String lastName, javax.swing.JTextArea outputAverage) {
        double theStudentAverage = 0;
        int sumColumn = 0;
        //get FirstName Position
        for (int i = 0; i < studentNameData.size(); i++) {
            for (int j = 0; j < studentNameData.get(i).size(); j++) {
                if (studentNameData.get(i).get(j).equals(firstName)) {
                    sumColumn += i; //adds i to sum column 
                }
            }
        }
        //get lastNamePosition
        for (int i = 0; i < studentNameData.size(); i++) {
            for (int j = 0; j < studentNameData.get(i).size(); j++) {
                if (studentNameData.get(i).get(j).equals(lastName)) {
                    sumColumn += i; //adds i to sum column 
                }
            }
        }

        sumColumn /= 2;

        studentTestOne = studentTestData.get(sumColumn).get(0);
        studentTestTwo = studentTestData.get(sumColumn).get(1);
        studentTestThree = studentTestData.get(sumColumn).get(2);
        studentTestFour = studentTestData.get(sumColumn).get(3);

        theStudentAverage += studentTestOne + studentTestTwo + studentTestThree + studentTestFour;
        theStudentAverage /= 4;

        return theStudentAverage;
    }

    public static double courseAverage(ArrayList<ArrayList<Double>> studentTestData) {
        double theCourseAverage = 0;

        for (int i = 0; i < studentTestData.size(); i++) {
            for (int j = 0; j < studentTestData.get(i).size(); j++) {
                theCourseAverage += (studentTestData.get(i).get(j));
            }
        }
        theCourseAverage /= studentTestData.size(); //devides the total by the number of students in the array

        theCourseAverage /= 4; //devides total by the 4 tests 

        return theCourseAverage;
    }
}
