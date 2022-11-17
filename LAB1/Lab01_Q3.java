/*This program demonstrates dry areas and water areas of Turkey and the Earth.
 * @author Dilara Mandıracı 
 */
package LAB1;

public class Lab01_Q3 
{
    public static void main(String[] args) 
    {

        //first question
        final long TOTAL_AREA_WORLD =  510072000;
        double dryArea = 510072000 * (29.2 / 100); // if 70.8 water then 29.2 dry
        double waterWorld = TOTAL_AREA_WORLD - dryArea ;
        System.out.println( "Earth has " + (long)dryArea + " km2 dry land and " +  (long)waterWorld + " km2 water.");

        //second question
        final double TOTAL_TURKEY = TOTAL_AREA_WORLD *  0.001536; //0.1536%
        double waterTurkey = TOTAL_TURKEY * 0.013;  //1.3%
        double dryTurkey = TOTAL_TURKEY - waterTurkey;
        System.out.println("Turkey has " + (long)dryTurkey + " km2 dry land and " + (long)waterTurkey + " km2 water.") ;

        //third question
        //dryArea * x/100 = dryTurkey find x in order to find percentage
        System.out.println("Turkey has " + (dryTurkey / dryArea ) * 100 + " percent of the Earth's dry land.");

        //fourth question
        // waterWorld * y/100 = waterTurkey find y so as to find percentage
        System.out.println("Turkey has " + ( waterTurkey / waterWorld ) * 100 + " percent of the Earth's water.");
    }   
}