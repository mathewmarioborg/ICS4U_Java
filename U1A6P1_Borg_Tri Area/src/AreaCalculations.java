/**
    File Name:	U1A5P2_Borg_Tri Area
    Programmer:	Mathew Borg
    Date:	2021-3-6
    Description:This program calculates the area of a triangle when all three sides are known.
 */
public class AreaCalculations {
    /*
    Function: isValid
    Purpose:  This method determine if the sum of any two sides is greater the third side
    Parameters: double sideA represents the length of side A
                double sideB represents the length of side B
                double sideC represents the length of side C
    Return: boolean 
    */
    public static boolean isValid(double sideA, double sideB, double sideC){
        int sideABSum = 0, sideBCSum = 0, sideCASum = 0; //creats ints for total side sum
        double aB, bC, cA; //creats double vareables for 2 sides
        
        //adds 2 sides together
        aB = sideA + sideB;
        bC = sideB + sideC;
        cA = sideC + sideA;
        
        // //creats a loop from 1 to the given number then adds all numbers to the corresponding sum var
        for(int i = 1; i <= aB; i++){sideABSum += i;}
        for(int i = 1; i <= bC; i++){sideBCSum += i;}
        for(int i = 1; i <= cA; i++){sideCASum += i;}

        //if sides are less then third side return false else return true
        if(sideABSum < sideC){
        return false;    
        }if(sideBCSum < sideA){
        return false;    
        }if(sideCASum < sideB){
        return false;    
        }else{
        return true;    
        }
    }
    
    /*
    Function: area
    Purpose:  This method is to calculate the area of the triangle 
    Parameters: double sideA represents the length of side A
                double sideB represents the length of side B
                double sideC represents the length of side C
    Return: double 
    */
    public static double area(double sideA, double sideB, double sideC){
        double s = (0.5) * (sideA + sideB + sideC); //calculates s = (a+b+c)/2
        double area = (double)Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); //calculates area = √(s(s-a)(s-b)(s-c))
        double areaRounded = Math.round(area*100.0)/100.0; // rounds numbers to 2 decimal places
        return areaRounded; //returns the value of area
    }
}
