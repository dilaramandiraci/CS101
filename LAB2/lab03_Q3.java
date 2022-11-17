package LAB2;

import java.util.Scanner;

/*This program examines such spesific features of the input(title)
 * @author Dilara Mandıracı
 */
public class lab03_Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.print("Enter the title :"); //baştan 3 sondan 4 boşluk War And Peace (örnek)
        String title = in.nextLine();
        
        int numberOfCharacters = title.length();

        System.out.println("-------------------------------------");
        System.out.println("Number of characters:" + numberOfCharacters);
        System.out.println("All uppercase:" + title.toUpperCase()); 
        System.out.println("Remove leading and trailing blank characters: " + title.trim()); 
        System.out.println("Character at index position 5: " + title.charAt(5) ); 
        System.out.println("Title from 3rd character to 8th character (not included):" + title.substring(3,7));
        System.out.println("First occurence of character 'a':" + title.indexOf("a"));
        System.out.println("Last occurence of character 'a': " + title.lastIndexOf("a") );
        in.close();
    }
}