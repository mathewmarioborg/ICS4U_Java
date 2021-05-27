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
    
    public static int binarySearch() {
        
    }
    
}
