/**
    File Name:	U1A5P2_Borg_Tri Area
    Programmer:	Mathew Borg
    Date:	2021-3-7
    Description:This program calculates the monthly payment, the total interest paid and the total payback of a car loan.
 */
public class LoanCalculator {
    /*
    Function: monthlyPayment
    Purpose:  This method calculates the monthly payments of a car loan
    Parameters: double p represents the amount of the loan in $
                double i represents the annual intrest rate in %
                double t represents the time in years
    Return: double 
    */
    public static double monthlyPayment(double p, double i, double t){
        double monthlyRate = i/12; //calculates monthly rate
        double payments = t*12; //calculates payment periods
        
        double monthlyPayment = (p*monthlyRate)/Math.pow(1-(1+monthlyRate), -1*payments); //calculates monthly payments (monthly payment = P * monthly rate / 1 - (1 + monthly rate)^ (-1* payments)
        
        return monthlyPayment; //returns the value
    }
    /*
    Function: totalPayback
    Purpose:  This method calculates the total payback on the car loan
    Parameters: double p represents the amount of the loan in $
                double i represents the annual intrest rate in %
                double t represents the time in years
    Return: double 
    */
    public static double totalPayback(double p, double i, double t){
        double monthlyPayment = monthlyPayment(p,i,t); //gives me access to the monthlyPayment function 
        double payments = t*12; //calculates payment periods
        
        double totalPayback = monthlyPayment * payments; //calculates total payback total (payback = monthly payment * payments)
        
        return totalPayback; //returns totalPayback 
    }
    /*
    Function: totalIntrestPayed
    Purpose:  This method calculates the total intrest payed on the car loan
    Parameters: double p represents the amount of the loan in $
                double i represents the annual intrest rate in %
                double t represents the time in years
    Return: double 
    */
    public static double totalIntrestPayed(double p, double i, double t){
        double totalPayback = totalPayback(p,i,t); //gives me access to the totalPayback method
        
        double totalIntrestPayed = totalPayback - p; // calculates totalIntrestPayed (payments = T * 12)
        
        return totalIntrestPayed; // retures totalIntrestPayed
    }
}
