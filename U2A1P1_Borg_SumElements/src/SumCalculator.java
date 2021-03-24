import java.util.*;

public class SumCalculator {
    public int sum; //creats public ints for sum and product

    public static double sumCalculator(ArrayList <Integer> inputSumNum){ //creats a int method with an Interger ArrayList input
        int sum = 0;
        for (int i: inputSumNum){
            sum += i;
        }
        return sum;
    }
    
    public static double sumEvenCalculator(ArrayList <Integer> inputSumEven){ //creats a int method with an Interger ArrayList input
        ArrayList <Integer> sumEven = new ArrayList(); //creats a array to store the even numbers in
        for (int i=0; i < inputSumEven.size(); i++) { //creats a for loop of the array input
            if(inputSumEven.get(i)%2 == 0){ //finds all the even numbers by result of i%2 (if it = 0 the number is even)
                sumEven.add(inputSumEven.get(i));
            }
        }
        double sum = sumCalculator(sumEven);//send the sumEven string to sumCalculator function to calculate sum
        return sum; //returns the sum var
    }
    
    public static double sumOddCalculator(ArrayList <Integer> inputSumOdd){
        ArrayList <Integer> sumOdd = new ArrayList();
        for (int i=0; i <inputSumOdd.size(); i++){
            if(inputSumOdd.get(i)%2 != 0){
                sumOdd.add(inputSumOdd.get(i));
            }
        }
        double sum = sumCalculator(sumOdd);//send the sumOdd string to sumCalculator function to calculate sum
        return sum; //returns the sum var
    }
}