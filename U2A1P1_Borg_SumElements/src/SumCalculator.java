/**
    File Name:	U2A1P1_Borg_SumElements
    Programmer:	Mathew Borg
    Date:	2021-3-20
    Description:This program that has the ability to store and display integer values in an array
 */

import java.util.*; //Import Java Utils

public class SumCalculator {
    public int sum; //creats public ints for sum and product

    public static double sumCalculator(ArrayList <Integer> inputSumNum){ //creats a double method with an ArrayList <Integer> input
        int sum = 0; //sets sum int to 0
        for (int i: inputSumNum){ //creats a for loop to find the average of given arraylist of integers
            sum += i; // adds the i var numbers to the sum var
        }
        return sum;//return sum
    }
    
    public static double sumEvenCalculator(ArrayList <Integer> inputSumEven){ //creats a double method with an ArrayList <Integer> input
        ArrayList <Integer> sumEven = new ArrayList(); //creats a array to store the even numbers in
        for (int i=0; i < inputSumEven.size(); i++) { //creats a for loop of the array input
            if(inputSumEven.get(i)%2 == 0){ //finds all the even numbers by result of i%2 (if it = 0 the number is even)
                sumEven.add(inputSumEven.get(i)); //adds inputSumEven.get(i) to the sumEven Array
            }
        }
        double sum = sumCalculator(sumEven);//send the sumEven array to sumCalculator function to calculate sum
        return sum; //returns the sum double
    }
    
    public static double sumOddCalculator(ArrayList <Integer> inputSumOdd){ //creats a double method with an ArrayList <Integer> input
        ArrayList <Integer> sumOdd = new ArrayList(); //creats a array to store the odd numbers in
        for (int i=0; i <inputSumOdd.size(); i++){ //creats a for loop of the array input
            if(inputSumOdd.get(i)%2 != 0){ //finds all the odd numbers by result of i%2 (if it != 0 the number is odd)
                sumOdd.add(inputSumOdd.get(i)); //adds inputSumEven.get(i) to the sumOdd Array
            }
        }
        double sum = sumCalculator(sumOdd);//send the sumOdd array to sumCalculator function to calculate sum
        return sum; //returns the sum double 
    }
}