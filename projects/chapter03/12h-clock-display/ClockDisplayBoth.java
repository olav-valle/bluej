
/**
 * This is a variation of the ClockDisplay, designed to show time in
 * both the European 24 hour style, and the American 12 hour AM/PM style. 
 * It is based on the 24 hour version, and uses the values from the 
 * 24 hour version to show AM/PM time. 
 * 
 * Both display styles are stored as separate strings, and are updated
 * simultaneously by all methods.
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes and Olav Valle
 * @version 201909051230
 */
public class ClockDisplayBoth
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString24;   // simulates the 24 hour display
    private int hoursValue12;       // stores hours string as int for 24 to 12 conversion
    private String displayString12; // simulates the 12 hour display
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplayBoth()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
        updateDisplay12();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplayBoth(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
        updateDisplay12();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
        updateDisplay12();
    }

    /**
     * Return the current time of this display in the format "HH:MM".
     */
    public String getTime24()
    {
        return displayString24;
    }
    
      /**
     * Return the current time of this display in the format "HH:MM am/pm".
     */
    public String getTime12()
    {
        return displayString12;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString24 = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
    }
    
    /**
     * Update the internal string that represents the 12-hour display.
     */
    private void updateDisplay12()
    {
        
        hoursValue12 = Integer.parseInt(hours.getDisplayValue());
        
        if (hoursValue12 == 12){
            displayString12 = "12" + ":" + minutes.getDisplayValue() + " pm";
        }
        
        else if (hoursValue12 == 0){
            displayString12 = "12" + ":" + minutes.getDisplayValue() + " am";
        }
        
        else if (hoursValue12 > 12){
            displayString12 = (hoursValue12 % 12) + ":" + 
                        minutes.getDisplayValue() + " pm";
        }
        
        else {
            displayString12 = (hoursValue12 % 12) + ":" + 
                        minutes.getDisplayValue() + " am";
        }
    }
    
    
    
}
