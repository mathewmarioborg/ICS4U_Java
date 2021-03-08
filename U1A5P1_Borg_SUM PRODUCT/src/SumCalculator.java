/**
    File Name:	U1A5P1_Borg_SUM PRODUCT 
    Programmer:	Mathew Borg
    Date:	2021-3-1
    Description:This program calculates the sum and product of the numbers
 */
public class SumCalculator {
    public int sum, product; //creats public ints for sum and product

    public void sumCalculator(int num){ ////creats a method and int to use inside of it
        //sets the values of the ints
        sum = 0;
        product = 1;

        for(int i = 1; i <= num; i++){ //creats a loop from 1 to the given number then adds all numbers to the sum var
            // sum = sum + i;
            sum += i;
        }
        for (int i = 2; i <= num; i++){ //creats a loop from 2 to the given number then multiplys the numbers to the var
            product *= i;
        }
    }
}
