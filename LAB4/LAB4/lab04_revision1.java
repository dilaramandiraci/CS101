package LAB4;
/**This program take n input from user and shows min,max,average
 * @author Dilara Mandıracı
 */
import java.util.Scanner;

public class lab04_revision1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = in.nextInt();
        int number;

        int i = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;

        while(true)
        {
            System.out.print("Now input positive integers: ");
            number = in.nextInt();
            if(number == n)
            {
                break;
            }

            i++;

            if (number < min)
            {
                min = number;
            }

            if(number > max)
            {
                max = number;
            }
            sum = sum + number;
        }
        System.out.println( "MAX: " + max );
        System.out.println( "MIN: " + min );
        System.out.println( "Average: " + sum/ i+1);
        in.close();
    }
}
