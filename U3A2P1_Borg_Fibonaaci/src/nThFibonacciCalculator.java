/*
    programmer:         Mathew Borg
    Date:               2021-05-1
    Program Name:       U3A2P1_Borg_Fibonaaci
    Program Discription:This program will use a recursive function to find the 
                        value of the nth Fibonacci number.
*/
public class nThFibonacciCalculator {
    
    /*
    Function:   nThCalculator
    Purpose:    This method takes in a int and calculated the corasponding fibonacci number
    Parameters: int num to get the number that being calculated
    Return:     int 
    */
    public static int nThCalculator(int num) { //creats method for calcualting the value of the nth Fibonacci number
        if (num == 0 || num == 1) { //if num is qual to 0 or qual to 1
            return num; //return num
        } else { //else
            return (nThCalculator(num - 1) + nThCalculator(num - 2)); //return recursive F(n) = F(n-1) + F(n-2)
        }
    }

}
