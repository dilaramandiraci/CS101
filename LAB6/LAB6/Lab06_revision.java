package LAB6;
import java.util.Scanner;

public class Lab06_revision {
    /**
     * counts how many digits have the given number
     * @param x int
     * @return int counts of digit
     */
    public static double countDigits( int x)
    {
        double digit = 0;
        while ( x != 0 ) 
        {
            x = x / 10;
            digit++ ;
        }
        return digit;
    }

     /**
     * checks if the number is prime or not
     * @param x int
     * @return boolean
     */
    public static boolean isPrime( int x)
    {
        if ( x <= 1)
            return false;

        for ( int i = 2; i < x; i++)
        {
            int remaining = x % i;
            if (remaining == 0)
                return false;
        } 
        return true;
    }
 
    /**
     * reverses the given number
     * @param x int
     * @return reversed number 
     */
    public static int reverse( int x) 
    {
        double reversed = 0;
        int digit = 0;
        int i = 1;
        double addNum = 0;
        double multiply;
        while ( x > 0)
        {
            digit = x % 10;
            multiply = Math.pow(10, countDigits( x - i));
            addNum = digit * multiply;
            i++;
            x = x / 10;           
            reversed = reversed + addNum;
        } 
        reversed = reversed/10;

        return x = (int) reversed;
    }

    public static boolean isTwistedPrime(int number) 
    {
        return isPrime( number) && isPrime(reverse( number));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to be examined:");
        int number = in.nextInt();
        String determinerPrime = "";
        System.out.println("reversed number: " + reverse( number));

        if ( ! isTwistedPrime(number)) 
        {
            determinerPrime = "not";
        }
        else
        {
            determinerPrime = "";
        }
        System.out.println (number + " is " + determinerPrime + " a Twisted Prime number.");
        
        in.close();
    }
}
