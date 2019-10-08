import java.util.HashMap;
import java.util.Iterator;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits; // Stores the rooms that this room connects to
    private Item item;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description)
    {
        this.description = description;
        this.exits = new HashMap<>();
        this.item = null;
    }

    public void addItem(Item item)
    {
        this.item = item;
    }
    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param direction The direction of the exit.
     * @param neighbor Room object that exit leads to.

     */
    public void setExits(String direction, Room neighbor)
    {
            exits.put(direction, neighbor);
    }

    /**
     *  Returns the Room object that is connected to the exit in the specified direction.
     * @param direction The direction of the exit
     * @return the connected Room object.
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }

    /**
     *  Returns a description of the of the room's exits.
     *  For example "Exits: south east"
     * @return Description of available exits.
     */
    public String getExitString()
    {
        String validExits = "Exits: ";

        for(String exit : exits.keySet()) {
            validExits += " " + exit;
        }
        return validExits;
    }

    /*
    public String getExitString()
    {
        String validExits = "Exits: ";
        Iterator it = (exits.keySet()).iterator();

        while (it.hasNext()) {
            validExits = validExits + it.next() + " ";
        }
        return validExits;

    }*/

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Long description of the room, in the form:
     *      "You are in the kitchen.
     *      Exits: east west"
     * @return Long description of room, and its exits.
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }
}
