/*this is a blakjack game who scores 21 wins , who scores more than other player wins, who scores more than 21 loses..
@author Dilara Mandıracı*/



import java.util.Random;
import java.util.Scanner;

public class Lab05_Q2 {
    public static void main(String[] args) {

       
        String deck = "";
        int sumPlayer = 0;
        int sumDealer = 0;
        String playersFirstCards = "";
        String dealersFirstCards = "";

        System.out.println("Starting the game with the following deck:");

        //36-card deck where each digit/card is included 4 times
        for(int number = 1; number < 10; number++)
        {
            char numberChar = (char)(number +'0'); //char 48 

            for ( int i=0; i<4 ; i++ )
            {
                deck = deck + numberChar;
            }
        }
        System.out.println(deck);

        Random rand = new Random ();

        /*choosing 2 cards for dealer and player
        */
        for (int counter = 0; counter < 4 ; counter++)
        {
           int randomChoice = rand.nextInt(deck.length()-1);
           int intRandomChoice = Integer.parseInt(String.valueOf(deck.charAt(randomChoice))) ;
           String removalNumber = Integer.toString(intRandomChoice);
           deck = deck.substring(0, randomChoice) + deck.substring(randomChoice+1, deck.length());
           
            if (counter < 2) // give 2 card for player
           {
               playersFirstCards = playersFirstCards + removalNumber;
               sumPlayer = sumPlayer + intRandomChoice;
               if(counter == 0) //to print first time declaration
                {
                   System.out.println("Player's hand:");
                }
        
                System.out.print(intRandomChoice);

                if (counter == 1)
                {
                    System.out.println();
                }
           }
           
           if (counter >= 2 && counter < 4) //first card for dealer
           {
               dealersFirstCards = dealersFirstCards + intRandomChoice; 
               sumDealer = sumDealer + intRandomChoice;
               if (counter == 2) //to print first time declaration
               {
                 System.out.println("Dealer's hand:");  
                 System.out.print(intRandomChoice);
               }
               else if (counter == 3)
               {
                   System.out.println("?"); //to hide last card
               } 
            }
        }
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your choice: \n1) Hit\n2) Stand\n");
        int menuOperation =  in.nextInt();
        
        if (menuOperation == 1)
        {
            int randomChoice = rand.nextInt(deck.length()-1);
            int intRandomChoice = Integer.parseInt(String.valueOf(deck.charAt(randomChoice))) ;
            String removalNumber = Integer.toString(intRandomChoice);
            deck = deck.substring(0, randomChoice) + deck.substring(randomChoice+1, deck.length()); 

           playersFirstCards = playersFirstCards + removalNumber;

           System.out.print("Hit! Dealer is giving the player a card...\nPlayer's hand:\n" + playersFirstCards);
           System.out.println();
           sumPlayer = sumPlayer +intRandomChoice;

           if (sumPlayer > 21)
           {
               System.out.println("Player scored over 21. Player lost!");
           }
           else if (sumPlayer == 21)
           {
               System.out.println("Player scored 21. Player wins!");
           }

           for (int a=0; sumPlayer < 21; a++)
           {
                System.out.print("Please enter your choice: \n1) Hit\n2) Stand\n");
                menuOperation =  in.nextInt();
                if (menuOperation == 1)
                {
                   randomChoice = rand.nextInt(deck.length()-1);
                   intRandomChoice = Integer.parseInt(String.valueOf(deck.charAt(randomChoice))) ;
                   removalNumber = Integer.toString(intRandomChoice);
                   deck = deck.substring(0, randomChoice) + deck.substring(randomChoice+1, deck.length()); 
                   sumPlayer = sumPlayer +intRandomChoice;
                   playersFirstCards = playersFirstCards + removalNumber;

                   System.out.println("Hit! Dealer is giving the player a card...\nPlayer's hand:\n"+ playersFirstCards);

                   if (sumPlayer > 21)
                   {
                       System.out.println("Player scored over 21. Player lost!");
                   }
                   else if (sumPlayer == 21)
                   {
                       System.out.println("Player scored 21. Player wins!");
                   }
                   else
                   {
                       continue;
                   }
                }
                else if (menuOperation == 2)
                {
                    System.out.println("Stand! Player's turn is now over. Player's hand sums to " + sumPlayer);
                    break;
                }
           }
        }

        if (menuOperation == 2 )
        {
            //System.out.println("Dealer is drawing cards...");
            
            for (int a=0; sumDealer < 21; a++)
            {
                if(sumDealer > sumPlayer)
                {
                    System.out.println("Dealer's cards \n" + dealersFirstCards);
                    System.out.println("Dealer scored more than player. Dealer wins!");
                    break;
                }
                System.out.println("Dealer is drawing cards...");
                int randomChoice = rand.nextInt(deck.length()-1);
                int intRandomChoice = Integer.parseInt(String.valueOf(deck.charAt(randomChoice))) ;
                String removalNumber = Integer.toString(intRandomChoice);
                deck = deck.substring(0, randomChoice) + deck.substring(randomChoice+1, deck.length());  

                dealersFirstCards = dealersFirstCards + removalNumber;

                System.out.println("Dealer's hand:\n" + dealersFirstCards);
                sumDealer = sumDealer + intRandomChoice;

                if (sumDealer > sumPlayer && sumDealer < 21)
                {
                    System.out.println("Dealer scored more than player. Dealer wins!");
                    break;
                }
                else if (sumDealer > 21)
                {
                    System.out.println("Dealer scored over 21. Dealer lost!");
                }
                else if (sumDealer == 21)
                {
                    System.out.println("Dealer scored 21. Dealer wins!");
                }
            }
        }   
        in.close();
        System.out.println("Ending the game with the following deck:\n" + deck);
    }
}