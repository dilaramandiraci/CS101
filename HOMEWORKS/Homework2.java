/**
 * This program compares the two algorithms and methods of calculating nTh Fibonacci number, in terms of time.
 * @author Dilara Mandıracı
 */
package HOMEWORKS;

public class Homework2 {
    /**
     * This method calculates nTh Fibonacci number in a recursive way.
     * @param n which Fibonacci number is going to be evaluated.
     * @return nTh Fibonacci Number
     */
    public static int CalcFibA(int n)
    {
        if (n < 2)
        {
            return n;
        }
        return CalcFibA(n-1) + CalcFibA(n-2);
    }

    /**
     * This method calculates nTh Fibonacci number.
     * @param n which Fibonacci number is going to be evaluated.
     * @return nTh Fibonacci Number
     */
    public static int CalcFibB(int n)
    {
        int prevNum = 0;
        int thisNum = 1;
        int i = 2;
        int nextNum = 0;
        if (n < 2)
        {
            return n;
        }
        while (i < n)
        {
            nextNum = prevNum + thisNum;
            prevNum = thisNum;
            thisNum = nextNum;
            i++;
        }
        return nextNum;
    }

    public static void main(String[] args) 
    {
        int counterA=0;
        int counterB=0;
        System.out.println("RESULTS of CalcFibA(n)");
        for (int n=0; n <= 50; n+=5)
        {
            counterA++;
            long start1 = System.nanoTime(); //starts time counter
            CalcFibA(n); //cals method
            long end1 = System.nanoTime(); //ends time counter
            System.out.println( counterA + "// for n = " + n + ", F_" + n + " is calculated in " + (end1-start1) +" nanoseconds");

        }

        System.out.println();
        System.out.println("RESULTS of CalcFibB(n)");
        for (int n=0; n <= 50; n+=5)
        {
            counterB++;
            long start2 = System.nanoTime(); //starts time counter
            CalcFibB(n); //cals method
            long end2 = System.nanoTime(); //ends time counter
            System.out.println( counterB + "// for n = " + n + ", F_" + n + " is calculated in " + (end2-start2) +" nanoseconds");

        }
  
    }
    
}
