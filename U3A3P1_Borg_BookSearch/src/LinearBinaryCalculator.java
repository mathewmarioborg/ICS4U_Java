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

//    public static boolean binarySearch(String[] values, String searchedValue) {
//        int left = 0, right = values.length - 1;
//        binaryPosition = 0;
//
//        while (left <= right) {
//            int middle = (left + right) / 2;
//            int compare = values[middle].compareTo(searchedValue);
//            if (compare == 0){
//                binaryPosition = middle;
//                return true;
//            }
//            // If x greater, ignore left half
//            else if (compare > 0){
//                left = middle + 1;
//            }
//            // If x is smaller, ignore right half
//            else{
//                right = middle - 1;
//            }
//        }
//        
//        return false;
//    }
    
    public static int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was not present
        return -1;
    }
}
