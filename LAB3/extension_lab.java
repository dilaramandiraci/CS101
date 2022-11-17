  /* This program is a sample bank account program with sample features.
@author Dilara Mandıracı
*/
package LAB3;

import java.util.Scanner;

public class extension_lab {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //informaiton that saved in system
        String pinSystem = "1234";
        int money = 1000;

        System.out.print("Enter your PIN: ");
        String pin = in.nextLine();
        final int OPTION_CARD = 1;
        final int OPTION_WITHDRAW = 2;
        final int OPTION_TYPE = 3;
        final int OPTION_PIN = 4;
        

        if (pin.equals(pinSystem))
        {
            System.out.println(" 1-Request a credit card \n 2-Withdraw money \n 3-Open a new account  \n 4-Change pin");
            System.out.println("Select an operation");
            int command = in.nextInt();
    
            if (command == OPTION_CARD)
            {
                System.out.println("Enter the card limit (cannot exceed 2 * your balance):");
                double amount = in.nextDouble();
                if ( amount < 0 || amount >= 2 * money)
                {
                    System.out.println("You entered an invalid amount! Bye!");
                }

                else
                {
                    System.out.println("Your credit card request has been successfully received! Bye!");
                }
            }

            else if (command == OPTION_WITHDRAW)
            {
                System.out.println("Enter the amount to withdraw:");
                double withdrawMoney = in.nextDouble();
                double remaining = money - withdrawMoney;
                System.out.printf("Your new balance is %1.3f %11s" , remaining , " TRY. Bye!");   
            }

            else if (command == OPTION_TYPE)
            {
                Boolean result = false;
                String accountType = "";
                System.out.println(" 1- TRY \n 2- USD \n 3- EUR \n 4- XAU \n Select currency type:");
                int commandTwo = in.nextInt();

                if (commandTwo == 1)
                {
                    accountType = "TRY";
                    result = true ;
                }
                else if (commandTwo == 2)
                {
                    accountType = "USD";
                    result = true ;
                } 
                else if (commandTwo == 3)
                { 
                    accountType = "EUR";
                    result = true ;
                }
                else if (commandTwo == 4)
                {
                    accountType = "XAU";
                    result = true ;
                }

                if (result)
                {
                    System.out.printf("Your new %4s account is now opened! Bye!" , accountType );
                }
                else
                {
                    System.out.println("Your selection is invalid! Bye!");
                }

                

            }

            else if (command == OPTION_PIN)
            {
                System.out.println("Enter your new PIN: ");
                String newPin = in.next();
                pinSystem = newPin;
                System.out.printf("Your PIN is changed to %1s %3s %1s %4s" , pinSystem.substring(0,1) , "* *" ,pinSystem.substring(3), "BYE!");
            }
        }

        else
        {
            System.out.println("Invalid PIN! Bye!");
        }
        in.close();
    }
}