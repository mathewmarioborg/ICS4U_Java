import java.util.ArrayList;

public class MarkCalculator {
    static double studentTestOne, studentTestTwo, studentTestThree, studentTestFour;

    public static double studentAverage(ArrayList<ArrayList<Double>> studentTestData, String firstName, String lastName) {
        double theStudentAverage = 0, firstNameColumn = 0, lastNameColumn = 0; 
        //get FirstName Position
        for (int i = 0; i < studentTestData.size(); i++) {
            for (int j = 0; j < studentTestData.get(i).size(); j++) {
                if(studentTestData.get(i).get(j).equals(firstName)){
                    firstNameColumn += i; //adds i to first name column var
                }
            }
        }
        //get lastNamePosition
        for (int i = 0; i < studentTestData.size(); i++) {
            for (int j = 0; j < studentTestData.get(i).size(); j++) {
                if(studentTestData.get(i).get(j).equals(lastName)){
                    lastNameColumn += i; //adds i to first name column var
                    studentTestOne = studentTestData.get(i).get(2);
                    studentTestTwo = studentTestData.get(i).get(3);
                    studentTestThree = studentTestData.get(i).get(4);
                    studentTestFour = studentTestData.get(i).get(5);
                }
            }
        }
        
        if(firstNameColumn == lastNameColumn){    
            theStudentAverage += studentTestOne + studentTestTwo + studentTestThree + studentTestFour;
            theStudentAverage /= 4;
        }else{
            
        }
        return theStudentAverage;
    }

    public static double courseAverage(ArrayList<ArrayList<String>> studentData) {
        double theCourseAverage = 0;
        
        for (int i = 0; i < studentData.size(); i++) {
            for (int j = 0; j < studentData.get(i).size(); j++) {
                
            }
        }
        return theCourseAverage;
    }
}
