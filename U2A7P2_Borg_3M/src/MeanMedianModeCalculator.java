
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
