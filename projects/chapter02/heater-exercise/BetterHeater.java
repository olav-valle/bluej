
/**
 * App for controlling the thermostat of a heater.
 */
public class BetterHeater
{
    // the only instance field is current temperature.
    private double temperature;
    private double maxTemp;
    private double minTemp;
    private double increment;

    /**
     * Constructor for instance of class Heater2
     * Initializes the field temperature to 15.0 degrees. 
     * Temperature unit unspecified.
     */
    public BetterHeater(double initialMinTemp, double initialMaxTemp)
    {
        // assign value to temperature field
        temperature = 15.0;
        minTemp = initialMinTemp;
        maxTemp = initialMaxTemp;
        increment = 5.0;
    }

    /**
     * Sets the value of a temperature increment/decrement.
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
        if (temperature <= (maxTemp -  increment)){
            // increase by value of decrement
            temperature += increment;
        }
        else if(temperature < maxTemp){
            temperature = maxTemp;
        }
        else {
            System.out.println("Temperature already at maximum of " + maxTemp + " degrees");
        }

    }

    /**
     * Mutator for lowering temperature by the defined increment.
     */
    public void cooler()
    {
        // lower the temperature, unless this decrease would go below minTemp
        if (temperature >= (minTemp + increment)){
            temperature -= increment;
        }
        else if (temperature > minTemp){
            temperature = minTemp;
        }
        else{
            System.out.println("Temperature already at minimum of " +minTemp+ " degrees.");
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
