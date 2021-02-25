/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
    File Name:	U1A4P1_Borg_Sleep
    Programmer:	Mathew Borg
    Date:	2021-02-17
    Description:This program calculates how long a person has been alive and 
    how mutch they should have slept.
 */
public class Calculations {
    int yearalive, monthalive, dayalive, totaldays, totalsleep; //Creats vareable intergers to store data in

    public void timeCalculator(int BDD, int BDM, int BDY, int DD, int DM, int DY){ //creats a method and varable intergers to use inside of it
        yearalive = DY - BDY; // subtracts current day from birthday year
        yearalive *= 365; // multiplys yearalive var by 365
        monthalive = DM - BDM; // subtracts current day month from birthday month
        monthalive *= 30; // multiplys monthalive var by 30
        dayalive = DD - BDD; // subtracts current day from birthday day 
        
        totaldays = yearalive + monthalive + dayalive; // adds yearsalive, monthalive, and dayalive together to get days alive answer 
        totalsleep = totaldays * 8; // multiplys totaldays by 8 to get total sleep answer.       
    }
}
