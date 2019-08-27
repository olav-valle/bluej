
/**
 * App for controlling the thermostat of a heater.
 */
public class Heater2
{
    // the only instance field is current temperature.
    private double temperature;
    private double max;
    private double min;
    private double increment;
    
    /**
     * Constructor for instance of class Heater2
     * Initializes the field temperature to 15.0 degrees. 
     * Temperature unit unspecified.
     */
    public Heater2(double initialMin, double initialMax)
    {
        // assign value to temperature field
        temperature = 15.0;
        min = initialMin;
        max = initialMax;
        increment = 5.0;
    }

    /**
     * Mutator for setting the value of a temperature increment/decrement.
     * Does not accept negative values.
     */
    public void setIncrement(double newIncrement)
    {
        if (newIncrement > 0){
            increment = newIncrement;
        }
        else {
            System.out.println("Please input a positive decimal number.");
        }
    }
    
    /**
     * Mutator for raising temperature by the defined increment.
     */
    public void warmer()
    {
        if (temperature <= (max -  increment)){
            // increase by 5.0
            temperature += increment;
        }
            else if(temperature < max){
                temperature = max;
            }
            else {
                System.out.println("Temperature already at maximum of " +max+ " degrees");
            }
    
    }
    
    /**
     * Mutator for lowering temperature by the defined increment.
     */
    public void cooler()
    {
        // decrease temperature by 5.0, unless this decrease would go below min
        if (temperature >= (min + increment)){
            temperature -= increment;
        }
            else if (temperature > min){
                temperature = min;
            }
            else{
                System.out.println("Temperature already at minimum of " +min+ " degrees.");
            }
    }
    
    /**
     * Accessor for the value of temperature.
     */
    public double getTemperature()
    {
        return temperature;
    }
}
