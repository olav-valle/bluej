
/**
 * The ClockDisplayThreePart class implements a digital clock display for 
 * both a 12 hour AM/PM clock, and a European-style 24 hour clock. 
 * The clock shows hours and minutes. The display creates 3 objects, one 
 * for minutes, and one each for the 12 hour and 24 hour displays
 * 
 * The range of the 24 hour clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The range of the 12 hour clock is 12:00 am (midnight) to 11:59 am (one minute 
 * before noon), and from 12:00 pm (noon) to 11:59 pm (one minute to midnight).
 * The NumberDisplay object handles time-keeping, 
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the displays. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class ClockDisplayThreePart
{
    private NumberDisplay hours24;
    private NumberDisplay hours12;
    private NumberDisplay minutes;
    private String displayString24;     // simulates the 24 hour display
    private String displayString12;     // simulates the 12 hour display
    
    /**
     * Constructor for ClockDisplayThreePart objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplayThreePart()
    {
        hours24 = new NumberDisplay(24);
        hours12 = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplayThreePart objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplayThreePart(int hour, int minute)
    {
        hours24 = new NumberDisplay(24);
        hours12 = new NumberDisplay(12);
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
            hours24.increment();
            hours12.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute. Passes the same parameter to both 12 and 24 hour objects 
     * The 12 hour object handles conversion from 24 to 12.   
     */
    public void setTime(int hour, int minute)
    {
        hours24.setValue(hour);
        hours12.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current 24-hour time of this display in the format HH:MM.
     */
    public String getTime24()
    {
        return displayString24;
    }
    
        /**
     * Return the current 12-hour time of this display in the format HH:MM am/pm.
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
        displayString24 = hours24.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
        
                        displayString12 = hours12.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
    }
}
