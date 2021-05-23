
/**
 * Defines properties of objects of type Animal.
 *
 * @author Rohit Tallapragada
 * @version Nov 26, 2020
 */
public abstract class Animal implements Comparable
{
    private String latinName;
    private String commonName;

    /**
     * Sets latinName to a new value.
     * 
     * @param   name   the common name
     */
    public void setLatinName(String name)
    {
        latinName = name;
    }

    /**
     * Sets commonName to a new value.
     * 
     * @param   name   the common name
     */
    public void setCommonName(String name)
    {
        commonName = name;
    }

    /**
     * Returns latinName's value.
     * 
     * @return  the latin name
     */
    public String getLatinName()
    {
        return latinName;
    }

    /**
     * Returns commonName's value.
     * 
     * @return  the common name
     */
    public String getCommonName()
    {
        return commonName;
    }

    /**
     * Compares the current object's common name to the other objects common name.
     * 
     * @param obj the compared object
     * 
     * @return  0 if the two names are lexiocographically equal
     *         >0 if this object's name is alphabetically eariler
     *            than the obj's name
     *         <0 if this object's name is alphabtically later
     *            than the obj's name
     */
    @Override
    public int compareTo(Object obj)
    {
        if (obj instanceof Animal)
        {
            Animal animal = (Animal)obj;
            return this.getCommonName().compareTo(animal.getCommonName());
        }
        throw new IllegalArgumentException("Object does not belong to the Animal class.");
    }

    /**
     * Returns a String of the noise of the animal.
     * 
     * @return  the animal's noise
     */
    public abstract String speak();

    /**
     * Constructor for objects of class Animal.
     * 
     * @param latin     the latin name
     * @param common    the common name
     */
    public Animal(String latin, String common)
    {
        latinName = latin;
        commonName = common;
    }

}
