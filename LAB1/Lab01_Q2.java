/*Some basic calculations for lab class 
 * @author Dilara Mandıracı
 */
package LAB1;

public class Lab01_Q2 
{
    public static void main(String[] args) 
    {       
        double result1 = (32.2 - 1.7 / 2.2) / ((1.5 - 7.3) * (4.3 + 2.4)) ;
        System.out.println( "Result of expression 1 is: " + result1);

        double result2 = ((73.5 * 16.4) - Math.pow(3, 6)) / (34 + Math.pow(2, 5));
        System.out.println( "Result of expression 2 is: " + result2);

        double a = 1.2 + 0.8;
        double b = -1.0 / 3;
        double result3 = Math.pow(a, b);
        System.out.println( "Result of expression 3 is: " + result3);   
    }   
}  