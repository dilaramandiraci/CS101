/* This program is a sample bank account program with sample features.
@author Dilara Mandıracı
*/
package LAB3;

import java.util.Scanner;

public class lab03_Q3 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        String pinSystem = "1234";
        int money = 1000;

        System.out.print("Enter your PIN: ");
        String pin = in.nextLine();

        if (pin.equals(pinSystem))
        {
            System.out.println(" 1- Withdraw money\n 2- Open a new account\n 3- Change pin");
            System.out.println("Select an operation");
            int command = in.nextInt();
    
            if (command == 1)
            {
                System.out.println("Enter the amount to withdraw:");
                double withdrawMoney = in.nextDouble();
                double remaining = money - withdrawMoney;
                System.out.printf("Your new balance is %1.3f %11s" ,remaining , " TRY. Bye!" );
            }

            else if (command == 2)
            {
                System.out.println(" 1- TRY \n 2- USD \n Select currency type:");
                int commandTwo = in.nextInt();
                if (commandTwo == 1 )
                {
                    System.out.println("Your new TRY account is now opened! Bye!");
                }

                else if (commandTwo == 2 )
                {
                    System.out.println("Your new USD account is now opened! Bye!");
                }
            }

            else if (command == 3)
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