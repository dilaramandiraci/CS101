/**This program prints triangles with stars
 * @author Dilara Mandıracı
 */
package LAB4;

import java.util.Scanner;

public class lab04_Q4 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int line = in.nextInt();
        int i = 0;
        int star = 1;

        while (i <= line)
        {
            while ( star <= i )
            {
                System.out.print("*");
                star ++;
            }
            System.out.println(" ");
            star = star - i;
            i++;
        }
        in.close();
    }
}
