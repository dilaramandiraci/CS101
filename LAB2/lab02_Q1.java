package LAB2;

import java.util.Scanner;

/*This program calculates the rectangle's feautures which is given by user.
@author Dilara Mandıracı
*/ 
public class lab02_Q1 {   
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: " );
        double widthOfRectangle = in.nextDouble();
        System.out.print("Enter the height of the rectangle: " );
        double heightOfRectangle = in.nextDouble();
        in.close();

        double diagonal =  Math.pow( Math.pow(widthOfRectangle, 2) + Math.pow(heightOfRectangle, 2) , 1.0 / 2);
        double area = widthOfRectangle * heightOfRectangle;
        double circumference = (widthOfRectangle + heightOfRectangle) * 2;

        System.out.printf("The area of the rectangle is            : %15.3f\n" , area);
        System.out.printf("The circumference of the rectangle is   : %15.3f\n" , circumference);
        System.out.printf("The diagonal of the rectangle is        : %15.3f\n", diagonal);  
    }     
}