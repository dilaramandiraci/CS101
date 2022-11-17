/*This program is revision for lab class and prints dry and water areas of the world and Turkey.
 * @author Dilara Mandıracı
 */

package LAB1;
public class Lab_extension
{
    public static void main( String args[] ) 
    {   
        //DATA
        final long TOTAL_AREA_OF_TURKEY = 783469;
        final long TOTAL_AREA_OF_WORLD = 510072000;
        double dryWorld = 510072000 * (29.2 / 100);
        double waterWorld = TOTAL_AREA_OF_WORLD - dryWorld;
        double waterTurkey = TOTAL_AREA_OF_TURKEY * 0.013;
        double dryTurkey = TOTAL_AREA_OF_TURKEY - waterTurkey;
 
        System.out.println("Earth has " + (long)dryWorld + " km2 dry land and " + (long)waterWorld + " km2 water.");

        System.out.println("Turkey has " + (long)dryTurkey+ " km2 dry land and " + (long)waterTurkey + " km2 water.");

        // dryAreaWorld * x/ 100 = dryTurkey find x
        System.out.println("Turkey has " + (dryTurkey / dryWorld) * 100 + "percent of the Earth's dry land.");

        // waterWorld * y/ 100 = waterTurkey find y so as to find percentage
        System.out.println("Turkey has " + (waterTurkey / waterWorld) * 100+ " percent of the Earth's water.");    
    }
}