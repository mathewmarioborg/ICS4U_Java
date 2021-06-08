/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mborg
 */
public class SortingRoutines {

    public static int[] sortSelection(int[] A, boolean ascending, boolean descending) {
        if (ascending) {
            for (int i = 0; i < A.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] < A[index]) {
                        index = j;//searching for lowest index  
                    }
                }
                int smallerNumber = A[index];
                A[index] = A[i];
                A[i] = smallerNumber;
            }
            return A;
            
        } else if (descending) {
            for (int i = 0; i < A.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] > A[index]) {
                        index = j;//searching for highest index  
                    }
                }
                int largerNumber = A[index];
                A[index] = A[i];
                A[i] = largerNumber;
            }
            return A;
            
        } else {
            return null;
        }
    }

//    public static int[] sortBubble(int[] A, boolean ascending, boolean descending) {
//
//    }
//    
//    public static int[] sortInsertion(int[] A, boolean ascending, boolean descending){
//        
//    }
//    
//    public static int[] sortQuick(int[] A, boolean ascending, boolean descending){
//        
//    }
}
