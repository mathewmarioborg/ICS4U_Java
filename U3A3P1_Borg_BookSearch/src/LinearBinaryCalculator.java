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
    
    public static int linearSearch(int[] values, int searchedValue) {
        int position = 0;
        boolean found = false;
        
        while(position < values.length && !found){
            if(values[position] == searchedValue){
                found = true;
            }else{
                position++;
            }  
        }
        
        return position;
    }
    
    public static int binarySearch(int[] values, int searchedValue) {
        int left = 0 , right = values.length -1; 
        
        while(left <= right){
            int mid = left +((right - left) / 2);
            if (values[mid] == searchedValue){
                return values[mid];
            }else if (searchedValue < values[mid]){
                right = mid - 1;
                return right;
            }else {
                left = mid + 1;
                return left;
            }
        }
        return 404;
    }
    
}
