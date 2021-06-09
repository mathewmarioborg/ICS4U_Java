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
        for (int i = 0; i < A.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < A.length; j++) {
                if (ascending && !descending) {
                    if (A[j] < A[index]) {
                        index = j;//searching for lowest index  
                    }
                } else if (descending && !ascending) {
                    if (A[j] > A[index]) {
                        index = j;//searching for highest index  
                    }
                }else {
                    return null;
                }
            }
            int smallerNumber = A[index];
            A[index] = A[i];
            A[i] = smallerNumber;
        }
        return A;

    }

    public static int[] sortBubble(int[] A, boolean ascending, boolean descending) {

        if (ascending) {
            for (int i = 0; i < A.length - 1; i++) {
                for (int j = 0; j < A.length - i - 1; j++) {

                    if (A[j] > A[j + 1]) {
                        int temp = A[j];
                        A[j] = A[j + 1];
                        A[j + 1] = temp;
                    }
                }
            }
            return A;
        } else if (descending) {
            for (int i = 0; i < A.length - 1; i++) {
                for (int j = 0; j < A.length - i - 1; j++) {

                    if (A[j] < A[j + 1]) {
                        int temp = A[j];
                        A[j] = A[j + 1];
                        A[j + 1] = temp;
                    }
                }
            }
            return A;
        } else {
            return null;
        }
    }

    public static int[] sortInsertion(int[] A, boolean ascending, boolean descending) {
        if (ascending) {
            for (int i = 1; i < A.length; ++i) {
                int key = A[i];
                int j = i - 1;

                /* Move elements of A[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && A[j] > key) {
                    A[j + 1] = A[j];
                    j = j - 1;
                }
                A[j + 1] = key;
            }
            return A;
        } else if (descending) {
            for (int i = 1; i < A.length; ++i) {
                int key = A[i];
                int j = i - 1;

                /* Move elements of A[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && A[j] < key) {
                    A[j + 1] = A[j];
                    j = j - 1;
                }
                A[j + 1] = key;
            }
            return A;
        } else {
            return null;
        }

    }

//    public static int[] sortQuick(int[] A, boolean ascending, boolean descending) {
//        int begin = 0, end = A.length - 1;
//        
//        if (ascending){
//            int[] a = quickSort(A,begin,end);
//            return a;
//        } else if (descending){
//            int[] a = quickSort(A,begin,end);
//            return a;
//        }else {
//            return null;
//        }
//    }
//
//    private static int[] quickSort(int arr[], int begin, int end) {
//        if (begin <= end) {
//            int partitionIndex = partition(arr, begin, end);
//
//            quickSort(arr, begin, partitionIndex - 1);
//            quickSort(arr, partitionIndex + 1, end);
//        }
//        return arr;
//    }
//
//    private static int partition(int arr[], int begin, int end) {
//        int pivot = arr[end];
//        int i = (begin - 1);
//
//        for (int j = begin; j < end; j++) {
//            if (arr[j] >= pivot) {
//                i++;
//
//                int swapTemp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = swapTemp;
//            }
//        }
//
//        int swapTemp = arr[i + 1];
//        arr[i + 1] = arr[end];
//        arr[end] = swapTemp;
//
//        return i + 1;
//    }
}
