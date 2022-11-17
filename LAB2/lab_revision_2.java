/*This program converts War And Peace to and War PeAce.
@author Dilara Mandıracı
*/
package LAB2;

public class lab_revision_2 {
    public static void main(String[] args) {
        String extension = "War And Peace";
        String first = extension.substring(4,7).toLowerCase();
        String second = extension.substring(0,3);
        String third = extension.substring(8,13).replace('a', 'A');

        System.out.println(first + " " + second + " " + third);
    } 
}
