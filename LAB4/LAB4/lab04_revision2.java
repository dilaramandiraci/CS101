package LAB4;
/**This program prints triangles with stars
 * @author Dilara Mandıracı
 */
import java.util.Scanner;

public class lab04_revision2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int wantedLine = in.nextInt();
        int star = 1;
        int lineCounter = 0;
        int i = 0;
        
        while(lineCounter < wantedLine)
        {
            lineCounter++;
            int space = (wantedLine*2 - star) /2;

            while( i <= space )
            {
                System.out.print(" ");
                i++;
            }

            i=0;
            int starCounter = 0;

            while (starCounter < star)
            {
                System.out.print("*");
                starCounter++;
            }
            star = star+2;

            System.out.println(" ");
        }
        in.close();
    }
}