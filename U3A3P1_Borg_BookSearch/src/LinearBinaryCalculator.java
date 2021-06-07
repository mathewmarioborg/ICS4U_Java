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

    public static boolean binarySearch(int[] values, int searchedValue) {
        int left = 0, right = values.length - 1;
        binaryPosition = 0;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (values[middle] == searchedValue){
                binaryPosition = middle;
                return true;
            }else if (values[middle] < searchedValue){
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        }
        
        return false;
    }
}
