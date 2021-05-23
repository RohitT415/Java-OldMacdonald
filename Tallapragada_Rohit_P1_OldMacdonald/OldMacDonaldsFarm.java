import java.util.ArrayList;
/**
 * Serves as a tester for the other animal classes.
 *
 * @author Rohit Tallapragada
 * @version Nov 26, 2020
 */
public class OldMacDonaldsFarm
{
    private String farmerName;
    private ArrayList<Animal> farmAnimals;

    /**
     * Constructor for objects of OldMacDonaldsFarm.
     */
    public OldMacDonaldsFarm() 
    {
        farmerName = "Old MacDonald";
        farmAnimals = new ArrayList<Animal>(); 
    }

    /**
     * Sings a verse of the song.
     */
    public void singVerse()
    {

        String phrase1 = farmerName + " had a farm,"; 
        String ei = " E-I-E-I-O.";
        int size = farmAnimals.size();

        System.out.println(phrase1 + ei + " and on his farm he had some "
            + (farmAnimals.get(size-1)).getCommonName()+"s,"+ ei);
        for(int i = farmAnimals.size()-1; i>=0; i--)
        {

            System.out.println("With a " + (farmAnimals.get(i)).speak() + "-" 
                + (farmAnimals.get(i)).speak() + " here, and a " + (farmAnimals.get(i)).speak() 
                + "-" + (farmAnimals.get(i)).speak() + " there,");

            System.out.println("Here a " + (farmAnimals.get(i)).speak() + ", there a " 
                + (farmAnimals.get(i)).speak() + ", everywhere a " 
                + (farmAnimals.get(i)).speak() + "-" + (farmAnimals.get(i)).speak() + ",");

        }
        System.out.println(phrase1 + ei);

        System.out.println(" ");
    }

    /**
     * Runs OldMacDonaldsFarm to see if the project works as intended.
     * 
     * @param args  the data needed to run the program
     */
    public static void main (String [ ] args) 
    {
        OldMacDonaldsFarm singer = new OldMacDonaldsFarm(); 
        singer.farmAnimals.add(new Chicken());
        singer.singVerse();
        singer.farmAnimals.add(new Chick());
        singer.singVerse(); 
        singer.farmAnimals.add(new Rooster()); 
        singer.singVerse(); 
        singer.farmAnimals.add(new Pig()); 
        singer.singVerse();
    }
}
