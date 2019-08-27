
/**
 * App for controlling the thermostat of a heater.
 */
public class Heater
{
    // the only instance field is current temperature.
    private double temperature;

    /**
     * Constructor for instance of class Heater
     * Initializes the field temperature to 15.0 degrees. 
     * Temperature unit unspecified.
     */
    public Heater()
    {
        // assign value to temperature field
        temperature = 15.0;
    }

    /**
     * Mutator for raising temperature by 5.0 degrees.
     */
    public void warmer()
    {
        // increase by 5.0
        temperature += 5.0;
    }
    
    /**
     * Mutator for lowering temperature by 5.0 degrees.
     */
    public void cooler()
    {
        // decrease by 5.0
        temperature -= 5;
    }
    
    /**
     * Accessor for the value of temperature.
     */
    public double getTemperature()
    {
        return temperature;
    }
}
