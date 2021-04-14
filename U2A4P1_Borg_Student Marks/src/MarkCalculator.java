import java.util.ArrayList;

public class MarkCalculator {
    static double dTestOne, dTestTwo, dTestThree, dTestFour;

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
                    dTestOne = studentTestData.get(i).get(2);
                    dTestTwo = studentTestData.get(i).get(3);
                    dTestThree = studentTestData.get(i).get(4);
                    dTestFour = studentTestData.get(i).get(5);
                }
            }
        }
        
        if(firstNameColumn == lastNameColumn){    
            theStudentAverage += dTestOne + dTestTwo + dTestThree + dTestFour;
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
