
/**
 * Represents a clock. Creates two DigitDisplay instances, one for minutes, one for hours.
 *
 * @author Olav Valle
 * @version 0.1 [201909031147]
 */
public class ClockDisplay
{
    private DigitDisplay hours;
    private DigitDisplay minutes;
    
    public ClockDisplay(int hoursValue, int minutesValue)
    {
        this.hours = new DigitDisplay(hoursValue, 24);
        this.minutes = new DigitDisplay(minutesValue, 60);
    }
    
    public void displayTime()
    {
        System.out.println("The time is: " + hours.getValueAsString() + ":" + minutes.getValueAsString());
    }

}