/*City Builder with asteriks "*"..
@author Dilara Mandıracı
 */


import java.util.Scanner;

public class Lab05_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter city plan string:");
        String wanted = in.nextLine();
        in.close();
        System.out.println("City blueprint");

        int max = Integer.MIN_VALUE;
        

        int column = wanted.length();
        
        /*
        * find tallest building
        */
        for (int i = 0; i < wanted.length(); i++)
        {
            char starNumberChar = wanted.charAt(i);
            int starNumber = starNumberChar - '0';
            if(starNumber > max)
            {
                max = starNumber;
            }
        }

        /*
        *printing lines
        */
        for ( int line = max; line > 0; line--) //printing every line that depends on max value
        {
            System.out.println();
            for (int i = 0; i < column; i++) // how much column do i need is depends on the inputted string's lenght. !!LOOK 16.th line
            {
                char starNumberChar = wanted.charAt(i); //repeat it for every single char.
                int starNumber = starNumberChar - '0';
                
                if(starNumber >= line)
                {
                    System.out.print("* ");
                }
                else if (starNumber < line)
                {
                    System.out.print("  ");
                }   
            }   
        } 
        System.out.println();
    }  
}