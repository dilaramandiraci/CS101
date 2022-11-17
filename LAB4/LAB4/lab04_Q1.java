/**This program demonstrates the n. fibonacci number
 * @author Dilara Mandıracı
 */
package LAB4;

import java.util.Scanner;

public class lab04_Q1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print(" Please input n: ");
        int n = in.nextInt();
        in.close();

        // fibonacci = 0, 1, 1, 2, 3, 5, 8, 13, 21,...
        int step = 1;
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 1;

        while ( step <= n )
        {
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            step ++;
        }
        System.out.println("Fib" + "(" + n + ") is: " + firstNumber);
    }
}
