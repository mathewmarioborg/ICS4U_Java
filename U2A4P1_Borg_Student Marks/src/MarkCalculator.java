import java.util.ArrayList;

public class MarkCalculator {

    public static double studentAverage(ArrayList<ArrayList<String>> studentData, String firstName, String lastName) {
        double theStudentAverage = 0, firstNameColumn = 0, lastNameColumn = 0, dTestOne, dTestTwo, dTestThree, dTestFour;
        String sTestOne = "", sTestTwo = "", sTestThree = "", sTestFour = "";
        //get FirstName Position
        for (int i = 0; i < studentData.size(); i++) {
            for (int j = 0; j < studentData.get(i).size(); j++) {
                if(studentData.get(i).get(j).equals(firstName)){
                    firstNameColumn += i; //adds i to first name column var
                }
            }
        }
        //get lastNamePosition
        for (int i = 0; i < studentData.size(); i++) {
            for (int j = 0; j < studentData.get(i).size(); j++) {
                if(studentData.get(i).get(j).equals(lastName)){
                    lastNameColumn += i; //adds i to first name column var
                    sTestOne = studentData.get(i).get(2);
                    sTestTwo = studentData.get(i).get(3);
                    sTestThree = studentData.get(i).get(4);
                    sTestFour = studentData.get(i).get(5);
                }
            }
        }
        
        if(firstNameColumn == lastNameColumn){
            dTestOne = Double.parseDouble(sTestOne);
            dTestTwo = Double.parseDouble(sTestTwo);
            dTestThree = Double.parseDouble(sTestThree);
            dTestFour = Double.parseDouble(sTestFour);
            
            theStudentAverage += dTestOne + dTestTwo + dTestThree + dTestFour;
            theStudentAverage /= 4;
        }else{
            
        }
        return theStudentAverage;
    }

    public static double courseAverage(ArrayList<ArrayList<String>> studentData) {
        double theCourseAverage = 0;

        return theCourseAverage;
    }
}
