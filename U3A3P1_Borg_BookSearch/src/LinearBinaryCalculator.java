/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathew Borg
 */
public class LinearBinaryCalculator {
   public static int linearPosition = 0;
   public static int binaryPosition = 0;
   
    public static boolean linearSearch(String[] values, String searchedValue) {
        linearPosition = 0;
        while(linearPosition < values.length){
            if(values[linearPosition].equals(searchedValue)){
                return true;
            }else{
                linearPosition++;
            }  
        }
        return false;
    }
    
    public static boolean binarySearch(String[] values, String searchedValue) {
        int left = 0, right = values.length - 1, middle = 0;
        binaryPosition = 0;
        Boolean found = false;

        while (found == false && left <= right) {
            middle = (left + right) / 2;
            int compare = values[middle].compareTo(searchedValue);
            if (compare == 0) {
                found = true;
                binaryPosition = compare;
            } else {
                if (compare > 0) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        if (left > right) {
            return false;
        } else {
            return true;
        }
    }
}
