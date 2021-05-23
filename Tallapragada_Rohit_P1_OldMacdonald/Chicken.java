
/**
 * Defines properties of objects of type Chicken.
 *
 * @author Rohit Tallapragada
 * @version Nov 26, 2020
 */
public class Chicken extends Animal
{
    /**
     * Constructor for objects of Chicken.
     */
    public Chicken() 
    {
        this("chicken"); 
    }

    /**
     * Constructor for Chicken
     * 
     * @param   chickenType the type of chicken
     */
    public Chicken(String chickenType) 
    {
        super("Gallus Gallus Domesticus", chickenType); 
    }

    /**
     * Returns a String of the noise of the animal.
     * 
     * @return  the noise of the chicken
     */
    @Override
    public String speak()
    {
        return "bawk";
    }
   
}
