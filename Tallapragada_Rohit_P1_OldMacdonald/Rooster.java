
/**
 * Defines properties of objects of type Rooster.
 *
 * @author Rohit Tallapragada
 * @version Nov 26, 2020
 */
public class Rooster extends Chicken
{
    /**
     * Constructor for objects of class Rooster.
     */
    public Rooster()
    {
        super("rooster");
    }

    /**
     * Returns a String of the noise of the animal.
     * 
     * @return  the noise of the rooster
     */
    @Override
    public String speak()
    {
        return "cock-a-doodle-doo";
    }
}
