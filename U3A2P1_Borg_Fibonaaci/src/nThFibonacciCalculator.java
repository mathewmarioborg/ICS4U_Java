/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathew Borg
 */
public class nThFibonacciCalculator {

    public static int nThCalculator(int num) { //creats method for calcualting the value of the nth Fibonacci number
        if (num == 0 || num == 1) { //if num is qual to 0 or qual to 1
            return num; //return num
        } else { //else
            return (nThCalculator(num - 1) + nThCalculator(num - 2)); //return recursive F(n) = F(n-1) + F(n-2)
        }
    }

}
