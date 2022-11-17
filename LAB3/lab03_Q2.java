/* This program shows the year which is given by user is in which century and examines if it is lap year or not.
@author Dilara Mandıracı
*/
package LAB3;

import java.util.Scanner; 

public class lab03_Q2 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        // take the year from user
        System.out.print("Enter the year to be evaluated: ");
        int year = in.nextInt();
        in.close();

        //   find which century it is
        int century = 0;
        String centuryStr;
        century = (year + 99) / 100 ; //to evaluate century **** ex: (500+99) / 100 = 5 , (501+99) / 100 = 6 ****

        if (century %10 == 1 && century != 11 && century %100 != 11) //to avoid eleven'st
        {
            centuryStr = century + "st";
        }

        else if (century %10 == 2 && century != 12 && century %100 != 12) //to avoid twelve'nd
        {
            centuryStr = century + "nd";
        }

        else if (century %10 == 3 && century != 13 && century %100 != 13) //to avoid thirteen'rd
        {
            centuryStr = century + "rd";
        }

        else 
        {
            centuryStr = century + "th";
        }

    
        // find whether it is a lap year or not then print it
        System.out.printf("The year %3d is in the " , year );
        if( year %4 == 0)
        {
            if (year %100 == 0)
            {

                if (year %400 == 0)
                {
                    System.out.println(centuryStr + " century and is a leap year."); 
                }

                else
                {
                    System.out.println(centuryStr + " century and is not a leap year.");
                }

            }

            else
            {
                System.out.println(centuryStr + " century and is a leap year.");
            }

        }

        else
        {
            System.out.println(centuryStr + " century and is not a leap year.");
        }
    }
}