package LAB6;
import java.util.Scanner;
/*
This program check numbers if they have specialities like prime number, harshad number, fibonacci... 
@author Dilara Mandıracı */

public class Lab06_Q1 
{
    /**
     * Checks if the number is perfect square or not
     * @param x positive integer
     * @return true if x is a perfect square
     */
    public static boolean isPerfectSquare(int x) 
    {
        int a = (int) Math.sqrt(x);
        return (a*a == x);
    }
    
    /**
     * This method determines if a number is fibonacci number or not.
     * @param n input
     * @return boolean
     */
    public static boolean isFibonacci(int n) 
    {
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }

    /**
     * This method sums the digits of numbers
     * @param x this is the input taken from a user
     * @return sum of the digits
     */
    public static int sumOfDigits(int x) 
    {   

        int sum = 0;
        int digit;
        while (x > 0)
        {
            digit = x % 10;
            x = x / 10;
            sum = sum + digit;
        }
        return sum;

    }
    /**
     * This method checks if the number is harshad number or not. (If number is divisible by sum of the digits itself.)
     * @param x input
     * @return if int is harshad (boolean)
     */
    public static boolean isHarshad(int x) 
    {
        return (x % sumOfDigits(x) == 0);
    }

    /**
     * checks if the number is prime or not
     * @param x int
     * @return if int is prime (boolean)
     */
    public static boolean isPrime(int x)
    {
        if (x <= 1)
            return false;

        for (int i = 2; i < x; i++)
        {
            if (x % i == 0)
                return false;
        } 
        return true;
    }
    
    /**
     * take the power of x,y
     * @param x int
     * @param y int
     * @return x^y
     */
    public static int power(int x,int y)  
    {
        int result = 1;
        for (int i = 0; i < y; i++)
        {
            result = result * x;
        }

        return result;
    }

    /**
     * counts how many digits have the given number
     * @param x int
     * @return int counts of digit
     */
    public static int countDigits(int x)
    {
        int digit = 0;
        while ( x > 0 ) 
        {
            x = x / 10;
            digit++ ;
        }
        return digit;

    }
    /**
     * This method checks if the number is Narsistic or not
     * @param x int
     * @return boolean
     */
    public static boolean isNarsistic(int x) 
    {
        int sum = 0;
        int digit;
        while (x > 0)
        {
            digit = x % 10;
            x = x / 10;
            sum = sum + power(digit, countDigits(x));
        }
        return sum == x;

    }
   
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to be examined:");
        int number = in.nextInt();
        String determinerFib = "";
        String determinerHarshard = "";
        String determinerNarsistic = "";
        String determinerPrime = "";
        
        if ( isFibonacci(number) == false)
        {
            determinerFib = "not";
        }

        if (isHarshad(number) == false)
        {
            determinerHarshard = "not";
        }

        if ( isNarsistic(number) == false)
        {
            determinerNarsistic = "not";
        }

        if (isPrime(number) == false) 
        {
            determinerPrime = "not";
        }

        System.out.println("Number of digits:" + countDigits(number));
        System.out.println("Sum of digits:" + sumOfDigits(number));
        System.out.println (number + " is " + determinerFib + " a Fibonacci number.");
        System.out.println (number + " is " + determinerHarshard + " a Harshad number.");
        System.out.println (number + " is " + determinerNarsistic + " Narsistic");
        System.out.println (number + " is " + determinerPrime + " a Prime number.");
        
        in.close();
    }
}
