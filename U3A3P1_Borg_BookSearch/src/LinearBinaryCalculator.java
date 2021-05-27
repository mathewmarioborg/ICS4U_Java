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
        int left = 0 , right = values.length -1; 
        
        while(left <= right){
            int mid = left +((right - left) / 2);
            if (values[mid] == searchedValue){
                binaryPosition = values[mid];
                return true;
            }else if (searchedValue < values[mid]){
                right = mid - 1;
                binaryPosition = right;
            }else {
                left = mid + 1;
                binaryPosition = left;
            }
        }
        return false;
    }
    
}
