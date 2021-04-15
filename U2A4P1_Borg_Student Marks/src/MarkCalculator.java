import java.util.ArrayList;
/*
    programmer: Mathew Borg
    Date: 2021-04-5
    Program Name: U2A4P1_Borg_Student Marks
    Program Discription: This program is a Student Grades Application that 
                         simulates a grade book for a class with 15 or more 
                         students who each have four test scores.
*/
public class MarkCalculator {

    static double studentTestOne, studentTestTwo, studentTestThree, studentTestFour; //creats static doubles
    
    /*
    Function:   studentAverage
    Purpose:    This method locates a students firstname and last name inordet to calculate there test average for all 4 tests
    Parameters: ArrayList<ArrayList<Double>> studentTestData to get the student test data
                ArrayList<ArrayList<String>> studentNameData to get student name data
                String firstName, String lastName to know what names we are looking for
    Return:     double 
    */
    public static double studentAverage(ArrayList<ArrayList<Double>> studentTestData, ArrayList<ArrayList<String>> studentNameData, String firstName, String lastName) {
        double theStudentAverage = 0; //creats double var
        int sumColumn = 0; //creats sumcolumn var
        //get FirstName Position by using 2 for loops to index the 2d array list
        for (int i = 0; i < studentNameData.size(); i++) {
            for (int j = 0; j < studentNameData.get(i).size(); j++) {
                if (studentNameData.get(i).get(j).equals(firstName)) { //if the 2d arraylist is = to first name
                    sumColumn += i; //adds i to sum column 
                }
            }
        }
        //get lastNamePosition by using 2 for loops to index the 2d array list
        for (int i = 0; i < studentNameData.size(); i++) {
            for (int j = 0; j < studentNameData.get(i).size(); j++) {
                if (studentNameData.get(i).get(j).equals(lastName)) {  //if the 2d arraylist is = to last name
                    sumColumn += i; //adds i to sum column 
                }
            }
        }

        sumColumn /= 2; //devide sum column by 2

        //gets test % for the specified student
        studentTestOne = studentTestData.get(sumColumn).get(0);
        studentTestTwo = studentTestData.get(sumColumn).get(1);
        studentTestThree = studentTestData.get(sumColumn).get(2);
        studentTestFour = studentTestData.get(sumColumn).get(3);

        theStudentAverage += studentTestOne + studentTestTwo + studentTestThree + studentTestFour; //adds all tests together
        theStudentAverage /= 4; //devides theStudentAverage by 4

        return theStudentAverage; //returns theStudentAverage
    }
    
    /*
    Function:   courseAverage
    Purpose:    calculates the course average for all students in our 2d arraylists 
    Parameters: ArrayList<ArrayList<Double>> studentTestData to get the student test data
    Return:     double 
    */
    public static double courseAverage(ArrayList<ArrayList<Double>> studentTestData) {
        double theCourseAverage = 0; //creats double var

        //uses 2 for loops to index the 2d arraylist
        for (int i = 0; i < studentTestData.size(); i++) {
            for (int j = 0; j < studentTestData.get(i).size(); j++) {
                theCourseAverage += (studentTestData.get(i).get(j)); //adds all the tests in the 2d arraylist together
            }
        }
        theCourseAverage /= studentTestData.size(); //devides the theCourseAverage var by the number of students in the array

        theCourseAverage /= 4; //devides total by the 4 tests 

        return theCourseAverage; //returns theCourseAverage
    }
}
