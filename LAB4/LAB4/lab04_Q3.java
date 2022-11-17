/**This program take n input from user and shows min,max,average
 * @author Dilara Mandıracı
 */

package LAB4;
import java.util.Scanner;

public class lab04_Q3 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = in.nextInt();
        System.out.print("Now input " + n + " positive integers: \n");
        int number;

        int i = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;

        while(i < n)
        {
            number = in.nextInt();
            sum = sum + number;
            i++;

            if (number < min)
            {
                min = number;
            }

            if(number > max)
            {
                max = number;
            }
        }
        System.out.println( "MAX: " + max );
        System.out.println( "MIN: " + min );
        System.out.println( "Average: " + sum/n);
        in.close();
    }
    
}
