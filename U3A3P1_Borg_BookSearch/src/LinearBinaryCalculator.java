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
   //creats public static ints and sets them to 0 
   public static int linearPosition = 0;
   public static int binaryPosition = 0;
   
    public static boolean linearSearch(int[] values, int searchedValue) { //creats boolean method that takes int array values and a int searched value
        linearPosition = 0; //sets linearPosition to 0
        while(linearPosition < values.length){ //while linearPosition is less then the length of values 
            if(values[linearPosition] == (searchedValue)){ //if values at linerposition is equal to searched value
                return true; //return true
            }else{ //else
                linearPosition++; //increment linerPosition by 1
            }  
        }
        return false; //return false
    }

    public static boolean binarySearch(int[] values, int searchedValue) { //creats binarySearch method that takes int array values and int searched value 
        int left = 0, right = values.length - 1; //sets left var to 0 abd right var to the length of values -1 
        binaryPosition = 0; //sets binary position to 0

        while (left <= right) { //while left is less than or equal to right
            int middle = (left + right) / 2; //create int middle that = left + right / 2
            if (values[middle] == searchedValue){ // if values at position middle is equal to searched value
                binaryPosition = middle; //set binary position var to = middle;
                return true; //return true 
            }else if (values[middle] < searchedValue){ //else if values at middle position are less than searched values 
                left = middle + 1; //set left to = middle + 1
            }else{ //else
                right = middle - 1; // set right to equal middle - 1;
            }
        }
        
        return false; //return false 
    }
}
