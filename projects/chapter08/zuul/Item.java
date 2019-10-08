/**
 * Represents an item in the game world.
 * @author Olav Valle
 * @version 20191008
 */

public class Item
{
    private double weight;
    private String description;
    private String name;

    /**
     *  Constructs Item object.
     * @param name String for item name
     * @param description String describing the item
     * @param weight Weight of item in grams, e.g. 2000 = 2kg
     */
    public Item(String name, String description, double weight)
    {
        // fills fields with given values
        this.weight = weight;
        this.description = description;
        this.name = name;
    }

    /**
     * Returns the weight of the item in grams.
     * @return the weight of the item in grams.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns the description of the item.
     * @return the description of the item
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the name of the object.
     * @return the name of the object
     */
    public String getName() {
        return name;
    }

}