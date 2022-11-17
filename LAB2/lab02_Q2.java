package LAB2;

import java.util.Scanner;

/*This program calculates the car maintenance cost by chart.
@author Dilara Mandıracı
*/ 
public class lab02_Q2 {
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the odometer reading of the car in kilometers:");
        int kilometers = in.nextInt();
        in.close();

        double totalCost = kilometers*0.1 ;
        final double OIL_CHANGE =  totalCost * 0.3;
        final double BATTERY = totalCost*0.15;
        final double BRAKES = totalCost*0.25;
        final double TIRE = totalCost * 0.13;
        final double OTHER = totalCost * 0.17;

        System.out.println("*************************************************");
        System.out.println("*******Maintenance Cost Distribution Table*******"); 
        System.out.println("*************************************************"); 
        System.out.printf("*Oil Change %15s %20.2f*\n" ,  "%30", OIL_CHANGE);        
        System.out.printf("*Battery    %15s %20.2f*\n" ,  "%15", BATTERY);        
        System.out.printf("*Brakes     %15s %20.2f*\n" ,  "%25", BRAKES);       
        System.out.printf("*Tire       %15s %20.2f*\n" ,  "%13", TIRE);       
        System.out.printf("*Other      %15s %20.2f*\n" ,  "%17", OTHER);         
        System.out.printf("*           %17s %18.2f*\n" , "TOTAL", totalCost);         
        System.out.println("*************************************************");
    } 
}