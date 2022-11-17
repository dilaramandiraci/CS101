/* This program calculates BMI 
@author Dilara Mandıracı
*/
package LAB3;

import java.util.Scanner; 

public class lab03_Q1 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = in.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = in.nextDouble();
        
        in.close();
        
        double bmi = weight / Math.pow(height , 2); // BMI = body mass index

        System.out.printf("Your BMI is %.2f and you are in the category of " , bmi);

        if (bmi < 18.5)
        {
            System.out.println("underweight.");         
        }
        else if (bmi < 25)
        {
            System.out.println("healthy.");
        }
        else if (bmi < 30)
        {
            System.out.println("overweight.");
        }
        else 
        {
            System.out.println("obese.");
        }
    }
}