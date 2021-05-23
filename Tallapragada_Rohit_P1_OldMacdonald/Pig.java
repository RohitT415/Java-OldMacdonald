
/**
 * Defines properties of objects of type Pig.
 *
 * @author Rohit Tallapragada
 * @version Nov 26, 2020
 */
public class Pig extends Animal
{
    /**
     * Constructor for objects of class Pig
     */
    public Pig()
    {
        super("Sus scrofa domesticus", "pig");
    }

    /**
     * Returns a String of the noise of the animal.
     * 
     * @return  the noise of the pig
     */
    @Override
    public String speak()
    {
        return "oink";
    }
}
