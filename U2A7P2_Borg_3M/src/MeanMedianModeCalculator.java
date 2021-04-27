
import java.util.ArrayList;
import java.util.Arrays;

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

    public static double meanCalculator(ArrayList<Double> doubleData) {
        double tot = 0;
        double mean = 0;
        for (int i = 0; i < doubleData.size(); i++) {
            tot = tot + doubleData.get(i);
        }
        mean = tot / doubleData.size();

        return mean;
    }

    public static double medianCalculator(ArrayList<Double> doubleData) {
        double median = 0.0;
        if (doubleData.size() % 2 == 1) {
            median = doubleData.get((doubleData.size() + 1) / 2 - 1);
        } else {
            median = (doubleData.get(doubleData.size() / 2 - 1) + doubleData.get(doubleData.size() / 2)) / 2;
        }
        
        return median;
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
