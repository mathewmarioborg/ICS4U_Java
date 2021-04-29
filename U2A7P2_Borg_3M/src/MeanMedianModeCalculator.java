
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;

/*
    programmer:         Mathew Borg
    Date:               2021-04-20
    Program Name:       U2A4P1_Borg_3M
    Program Discription:This program will except an undetermined number of 
                        integer inputs of values from 0 to 100 then calculates 
                        the mean, median and mode of the data entered.
*/
public class MeanMedianModeCalculator {
    
    /*
    Function:   meanCalculator
    Purpose:    This method takes in a arraylist of doubles and calculated the mean value for them
    Parameters: ArrayList<Double> doubleData to input an arraylist of double numbers
    Return:     double 
    */
    public static double meanCalculator(ArrayList<Double> doubleData) {
        double total = 0, mean; //creates double integers
        
        for (int i = 0; i < doubleData.size(); i++) { //creats a for loop to initalise doubleData
            total = total + doubleData.get(i); //adds all the values of the arraylist to total
        }
        mean = total / doubleData.size(); //sets the mean value to = the total / by the size of the doubleData

        return mean; //returns mean value
    }

    /*
    Function:   medianCalculator
    Purpose:    This method takes in a arraylist of doubles and calculated the median value for them
    Parameters: ArrayList<Double> doubleData to input an arraylist of double numbers
    Return:     double 
    */
    public static double medianCalculator(ArrayList<Double> doubleData) {
        double median; //creats double integer
        
        if (doubleData.size() % 2 == 1) { //if the remainder of doubleData that is devided by 2 is eual to 1
            median = doubleData.get((doubleData.size() + 1) / 2 - 1); //set median to doubleData at the position of the arraylist size + 1 then devided by 2 - 1 
        } else { //else 
            median = (doubleData.get(doubleData.size() / 2 - 1) + doubleData.get(doubleData.size() / 2)) / 2; // sets median to doubleData position of the size / 2 - 1 plus doubleData position of arraylist size /2 then /2.
        }

        return median; //returns median
    }
    
    /*
    Function:   modeCalculator
    Purpose:    This method takes in a arraylist of doubles and calculated the mode value or values for them
    Parameters: ArrayList<Double> doubleData to input an arraylist of double numbers
    Return:     ArrayList 
    */
    public static ArrayList modeCalculator(ArrayList<Double> doubleData) {
        ArrayList<Double> modes = new ArrayList<>();
        int maxCount = 0;
        for (int i = 0; i < doubleData.size(); ++i) {
            int count = 0;
            for (int j = 0; j < doubleData.size(); ++j) {
                if (Objects.equals(doubleData.get(j), doubleData.get(i))) {
                    ++count;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                modes.clear();
                modes.add(doubleData.get(i));
            } else if (count == maxCount) {
                modes.add(doubleData.get(i));
            }
        }
        LinkedHashSet<Double> hashSet = new LinkedHashSet<>(modes);
        ArrayList<Double> mode = new ArrayList<>(hashSet);
        
        if (maxCount > 1) {
            return mode;
        }
        mode.clear();
        return mode;

    }
}
