/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1a4p2_borg_quadroots;
/**
    File Name:	U1A4P1_Borg_QuadRoots
    Programmer:	Mathew Borg
    Date:	2021-02-19
    Description:This program calculates the  roots of a quadratic equation in the form ax2+bx+c = 0 
 */
public class RootCalculations {
    public double x1, x2, discriminant; // Creats a public double var to store x1, and x2 root values in
    
    public void rootCalculations(double a, double b, double c){ //creats a method and varable doubles to use inside of it
        //calculates our discriminant 
        discriminant = b * b - 4 * a * c;
        
        // calculates the first and second root for the given equation
        x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
    }
    
}
