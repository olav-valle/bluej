
/**
 * General class for creating a double digit counter display with a value range, 
 * and a roll-over limit.
 *
 * @author Olav Valle
 * @version 0.1 [201909031050]
 */

public class DigitDisplay
{
    private int value;
    private int limit;

    /**
     * Initialize value and limit
     */
    public DigitDisplay(int value, int limit)
    {
        this.value = value;
        this.limit = limit;
    }
    // accessors
    public int getValue()
    {
        return this.value;
    }

    public int getLimit()
    {
        return this.limit;
    }

    // mutators
    public void setValue(int newValue)
    {
        this.value = newValue;
    }

    public void setLimit(int newLimit)
    {
        this.limit = newLimit;
    }

    // methods
    /**
     * counts the value up 1 
     */
    public void incrementValue()
    {
        this.value++;

        this.value = (this.value % this.limit);
    }
    
    public String getValueAsString()
    {
        String valueAsString;
        
        if (value >= 10) {
            // the value is double digit
            valueAsString = "" + this.value; 
        }
        else {
            valueAsString = "0" + this.value;
        }
        
        return valueAsString;
    }
}
