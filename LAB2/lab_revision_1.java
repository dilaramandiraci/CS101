package LAB2;

import java.util.Scanner;

/*This program shows the features of circle that given from user.
@author Dilara Mandıracı
*/
public class lab_revision_1 {
    public static void main (String[] args) {
        
        //taking input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: " );
        double r = in.nextDouble();
        in.close();

        //calculating
        double areaOfCircle = Math.PI * Math.pow(r , 2);   //Math.PI = pi sayısı (constant)
        double circumference = 2 * Math.PI * r;
        double diameter = 2 * r;

        //printing
        String b = "%-50s%1s%15.2f\n";
        System.out.printf(b, "The diameter of circle is" , ":" , diameter );
        System.out.printf(b, "The area of circle is" , ":" , areaOfCircle );
        System.out.printf(b, "The circumference of the circle is" , ":" , circumference);
    }
}
