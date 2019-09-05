
/**
 * Write a description of class TestBetterClock here.
 *
 * @author Olav Valle
 * @version 2019 0905 1430
 */
public class TestBetterClock
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class TestBetterClock
     */
    public TestBetterClock()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void testNoon()
    {
        BetterClockDisplay testClock = new BetterClockDisplay();

        testClock.setTime(11, 59);
        System.out.println(testClock.getTime24());
        System.out.println(testClock.getTime12());
        System.out.println("Tick!");
        testClock.timeTick();
        System.out.println(testClock.getTime24());
        System.out.println(testClock.getTime12());
    }

    public void testMidnight()
    {
        BetterClockDisplay testClock = new BetterClockDisplay();

        testClock.setTime(23, 59);
        System.out.println(testClock.getTime24());
        System.out.println(testClock.getTime12());
        System.out.println("Tick!");
        testClock.timeTick();
        System.out.println(testClock.getTime24());
        System.out.println(testClock.getTime12());

    }

    public void testSetTime(int hour, int minute)
    {
        BetterClockDisplay testClock = new BetterClockDisplay();

        testClock.setTime(hour, minute);
        System.out.println(testClock.getTime24());
        System.out.println(testClock.getTime12());

    }

    public void testEveryHour()
    {
        int hourCounter = 0;
        BetterClockDisplay testClock = new BetterClockDisplay();

        while (hourCounter < 24) {
            testClock.setTime(hourCounter, 0);

            System.out.println(testClock.getTime24());
            System.out.println(testClock.getTime12());
            System.out.println("");

            hourCounter++;
        }
        
        testNoon();
    }
}
