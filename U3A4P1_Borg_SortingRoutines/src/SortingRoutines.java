/*
    programmer: Mathew Borg
    Date: 2021-06-1
    Program Name: U3A4P1_Borg_SortingRoutines
    Program Discription: This program will sort a list of random numbers. 
                         The random numbers are in the range of -1 000 to 1 000.
                         The user can choose which sorting algorithm to use to 
                         sort the numbers (selection, bubble, insertion, quick),
                         how many numbers are to be sorted in the list and
                         whether the list is sorted in ascending or descending order.
 */
public class SortingRoutines {
    /*
    Function: sortSelection
    Purpose:  to sort an array in ascending or descending order using the Selection algorithum 
    Parameters: int[] A is to pass the array that is being sorted to the method
                boolean ascending is to tell the method if the user wants the array in ascending order
                boolean descending is to tell the method if the user wants the array in descending order
    Return: int[]
     */
    public static int[] sortSelection(int[] A, boolean ascending, boolean descending) {
        for (int i = 0; i < A.length - 1; i++) { //creats first for loop
            int index = i; //creats int index and sets it to the value of var i
            for (int j = i + 1; j < A.length; j++) { //creats second for loop 
                if (ascending && !descending) { //checks if ascending is true and descending is false
                    if (A[j] < A[index]) { // checks if A at postition j is less than A at position of index
                        index = j;//searching for lowest index  
                    }
                } else if (descending && !ascending) { //checks if descending is true and ascending is false 
                    if (A[j] > A[index]) { //checks if A at poition J is greater than A at position index
                        index = j;//searching for highest index  
                    }
                }else { //else 
                    return null; //return null
                }
            }
            int smallerNumber = A[index]; //sets int smallerNumber to A at position index 
            A[index] = A[i]; //sets A at position index to A at position i
            A[i] = smallerNumber; //sets A at position I to smallerNumber var
        }
        return A; //returns A array sorted

    }
    
    /*
    Function: sortBubble
    Purpose:  to sort an array in ascending or descending order using the Bubble algorithum 
    Parameters: int[] A is to pass the array that is being sorted to the method
                boolean ascending is to tell the method if the user wants the array in ascending order
                boolean descending is to tell the method if the user wants the array in descending order
    Return: int[]
     */
    public static int[] sortBubble(int[] A, boolean ascending, boolean descending) {
        for (int i = 0; i < A.length - 1; i++) { //creats first for loop
            for (int j = 0; j < A.length - i - 1; j++) { //creats second for loop
                if (ascending && !descending) { //checks if ascending is true and descending is false
                    if (A[j] > A[j + 1]) { //checks if A at position J is greater than A at position j + 1
                        int temp = A[j]; //creats int temp and sets it to A at position J
                        A[j] = A[j + 1]; //sets A at position J to equal A at position j + 1
                        A[j + 1] = temp; //sets A at position j + 1 to equal temp
                    }
                } else if (descending && !ascending) { //checks if descending is true and ascending is false 
                    if (A[j] < A[j + 1]) { //checks if A at position j is less than A at position j + 1
                        int temp = A[j]; //creats int temp and sets it to A at position J 
                        A[j] = A[j + 1]; //sets A at position J to equal A at position j + 1
                        A[j + 1] = temp; //sets A at position j + 1 to equal temp
                    }
                } else { //else
                    return null; //return null

                }
            }
        }
        return A; //returns A array sorted
    }
    
    /*
    Function: sortInsertion
    Purpose:  to sort an array in ascending or descending order using the Insertion algorithum 
    Parameters: int[] A is to pass the array that is being sorted to the method
                boolean ascending is to tell the method if the user wants the array in ascending order
                boolean descending is to tell the method if the user wants the array in descending order
    Return: int[]
     */
    public static int[] sortInsertion(int[] A, boolean ascending, boolean descending) {
        for (int i = 1; i < A.length; ++i) { //creats a for loop
            int key = A[i]; //creats int key and sets it to A at position i
            int j = i - 1; //creats int j and sets it to int i - 1
            if (ascending && !descending) { //checks if ascending is true and descending is false
                while (j >= 0 && A[j] > key) { //while j is greater than or euql to 0 and A at position j is greater then key var
                    A[j + 1] = A[j]; //set A at position j + 1 to equal A at position j
                    j = j - 1; //sets j to equal j - 1
                }
            } else if (descending && !ascending) { //checks if descending is true and ascending is false 
                while (j >= 0 && A[j] < key) { ////while j is greater than or euql to 0 and A at position j is less then key var
                    A[j + 1] = A[j]; //set A at position j + 1 to equal A at position j
                    j = j - 1; //sets j to equal j - 1
                }
            } else { //else 
                return null; //return null
            }
            A[j + 1] = key; //sets A at position j + 1 to equal key
        }
        return A; //return A array sorted
    }
    
    /*
    Function: sortQuick
    Purpose:  to sort an array in ascending or descending order using the Quick algorithum 
    Parameters: int[] A is to pass the array that is being sorted to the method
                boolean ascending is to tell the method if the user wants the array in ascending order
                boolean descending is to tell the method if the user wants the array in descending order
    Return: int[]
     */
    public static int[] sortQuick(int[] A, boolean ascending, boolean descending) {
        int begin = 0, end = A.length - 1; //creats int begin and sets it to 0 and int end to length of A - 1
        A = quickSort(A, begin, end, ascending, descending); //sets A to the return value of quickSort
        return A; //return A array sorted
    }
    
    /*
    Function: quickSort
    Purpose:  to sort an array with the quick method using recursion
    Parameters: int[] A is to pass the array that is being sorted to the method
                int begin is to tell the program what the begining of the array is
                int end is to tell the program what the end fo the array is
                boolean ascending is to tell the method if the user wants the array in ascending order
                boolean descending is to tell the method if the user wants the array in descending order
    Return: int[]
     */
    private static int[] quickSort(int arr[], int begin, int end, boolean ascending, boolean descending) {
        if (begin <= end) { //checks if begin is less than or equal to end 
            int partitionIndex = partition(arr, begin, end, ascending, descending); // creats int partitionIndex and sets it to the return value of partition method

            quickSort(arr, begin, partitionIndex - 1, ascending, descending); //runs quickSort method with values of arr, begin, partitionIndex - 1, ascending, descending
            quickSort(arr, partitionIndex + 1, end, ascending, descending); //runs quickSort method with values of arr, partitionIndex + 1, end, ascending, descending
        }
        return arr; //return the array int arr
    }
    
    /*
    Function: partition
    Purpose:  to partition an array that is being sorted with the quick sort method
    Parameters: int[] A is to pass the array that is being sorted to the method
                int begin is to tell the program what the begining of the array is
                int end is to tell the program what the end fo the array is
                boolean ascending is to tell the method if the user wants the array in ascending order
                boolean descending is to tell the method if the user wants the array in descending order
    Return: int
     */
    private static int partition(int arr[], int begin, int end, boolean ascending, boolean descending) {
        int pivot = arr[end]; //creats int pivot to equal arr at position end
        int i = (begin - 1); //creats int i to equal begin - 1

        for (int j = begin; j < end; j++) { //creats a for loop 
            if (ascending && !descending) { //checks if ascending is true and descending is false
                if (arr[j] <= pivot) { //if arr at position j is less than or equal to pivot 
                    i++; //increment i by 1
                    int swapTemp = arr[i]; //create int swapTemp and set it to arr at position i
                    arr[i] = arr[j]; //set arr at position i to equal arr at position j
                    arr[j] = swapTemp; //set arr at position j to equal swapTemp
                }
            } else if (descending && !ascending) { //checks if descending is true and ascending is false 
                if (arr[j] >= pivot) { //if arr at positionj is grater than or equal to pivot 
                    i++; //increment i by 1
                    int swapTemp = arr[i]; //create int swapTemp and set it to arr at position i
                    arr[i] = arr[j]; //set arr at position i to equal arr at position j
                    arr[j] = swapTemp; //set arr at position j to equal swapTemp
                }
            } else { //else
                return 0; //return 0 
            }
        }

        int swapTemp = arr[i + 1]; //creats int swapTemp and sets it to arr at position i + 1
        arr[i + 1] = arr[end]; //sets arr at position i + 1 to equal arr at positon end
        arr[end] = swapTemp; //sets arr at position end to equal seapTemp

        return i + 1; //return i + 1
    }
}