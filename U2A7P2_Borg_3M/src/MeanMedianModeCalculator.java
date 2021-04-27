
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
public class MeanMedianModeCalculator {
    
    public static double meanCalculator(ArrayList <Double> doubleData){
        double total = 0.0, mean = 0.0;
        
        for(int i = 0; i < doubleData.size(); i++){
            total += doubleData.get(i);
        }
        mean = total/doubleData.size();
        
        return mean;
    }
    
    public static double medianCalculator(ArrayList <Double> doubleData){
        double median = 0.0; 
        
        if(doubleData.size()%2 == 0){
            int temp = (doubleData.size()/2) -1;
            for(int i = 0; i < doubleData.size(); i++){
                if(temp == i || (temp + 1) == i){
                    median = median + doubleData.get(i);
                }
            }
            median /= 2;
            return median;
        }else{
            int temp = (doubleData.size()/2);
            for(int i = 0; i < doubleData.size(); i++){
                if(temp == i){
                    median = doubleData.get(i);
                }
            }
            return median;
        }
    }
    
    public static double modeCalculator(ArrayList<Double> doubleData) {
        double mode = 0, maxCount = 0;
        int i, j;

        for (i = 0; i < doubleData.size(); ++i) {
            int count = 0;
            for (j = 0; j < doubleData.size(); ++j) {
                if (doubleData.get(j) == doubleData.get(i)) {
                    ++count;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = doubleData.get(i);
            }
        }
        return mode;
    }
}
