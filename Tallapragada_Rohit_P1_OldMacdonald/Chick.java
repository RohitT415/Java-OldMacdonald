
/**
 * Defines properties of objects of type Chick.
 *
 * @author Rohit Tallapragada
 * @version Nov 26, 2020
 */
public class Chick extends Chicken
{
    /**
     * Constructor for objects of class Chick.
     */
    public Chick()
    {
        super("chick");
    }

    /**
     * Returns a String of the noise of the animal.
     * 
     * @return  the noise of the chick
     */
    @Override
    public String speak()
    {
        return "peep";
    }
}
