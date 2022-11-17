/*City Builder with asteriks "*"..
@author Dilara Mandıracı
 */

import java.util.Scanner;

public class lab05_revision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter city plan string:");
        String wanted = in.nextLine();
        in.close();
        System.out.println("City blueprint");

        int max = Integer.MIN_VALUE;
        int column = wanted.length();
        
        
        for (int i = 0; i < wanted.length(); i++)
        {
            char starNumberChar = wanted.charAt(i);
            if( starNumberChar == 'P')
            {
                i=i+2;
                if (i >= wanted.length()-1)
                {
                    break;
                }
                starNumberChar = wanted.charAt(i);
            }
            
            int starNumber = starNumberChar - '0';
            if(starNumber > max)
            {
                max = starNumber;
            }  
            
        }


        for ( int line = max; line > 0; line--) //printing every line that depends on max value
        {
            System.out.println();
            for (int i = 0; i < column; i++) // how much column do i need is depends on the inputted string's lenght. !!LOOK 16.th line
            {
                char starNumberChar = wanted.charAt(i); //repeat it for every single char.
                if (starNumberChar == 'P')
                {
                    starNumberChar = wanted.charAt(i+1);
                    int parkNumber = starNumberChar - '0';
                    int a = 0;
                    
                    while (a < parkNumber)
                    {
                        if(line > 1)
                        {
                            System.out.print(" ");
                        }
                        else if (line == 1)
                        {
                            System.out.print("*");
                        }
                        a++;
                    }
                    i++;
                }
                else 
                {
                    starNumberChar = wanted.charAt(i);
                    int starNumber = starNumberChar - '0';
                
                    if(starNumber >= line)
                    {
                        System.out.print("*");
                    }
                    else if (starNumber < line)
                    {
                        System.out.print(" ");
                    }  
                }
            }   
        } 
    }
}
