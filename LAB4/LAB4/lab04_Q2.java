/**This program demonstrates wheter the string is palindrom or not
 * @author Dilara Mandıracı
 */
package LAB4;

import java.util.Scanner;

public class lab04_Q2 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the string: ");
        String word = in.nextLine();
        in.close();

        int i = 0;
        int a = 0; //first indeks i.e., araba için 0.indeks = "a"
        int b = 1;

        while( i < (word.length()-1)/2)
        {
            char firstCharacter = word.charAt(a);
            char lastCharacter = word.charAt(word.length()-b);

            if (firstCharacter == lastCharacter)
            {
                i++;
                a++;
                b++;
            }
            else 
            {break ;}
        } 
        if( i == (word.length()-1)/2 && word.charAt(1) == word.charAt(word.length()-2) )
        {
            System.out.println("It is a palindrome. ");
        }
        else 
        {
            System.out.println("It is not a palindrome. ");
        }
    }
}
