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

    public static int nThCalculator(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return (nThCalculator(num - 1) + nThCalculator(num - 2));
        }
    }

}
