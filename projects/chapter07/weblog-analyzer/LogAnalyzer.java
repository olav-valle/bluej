import java.util.Arrays;
import java.util.Comparator;
/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private Integer[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    {
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new Integer[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }

    /**
     * Constructs LogAnalyzer, that also creates log file with the name fileName.
     * @param fileName N    ame to give generated log file.
     */
    public LogAnalyzer(String fileName)
    {
        hourCounts = new Integer[24];
        LogfileCreator make = new LogfileCreator();
        make.createFile(fileName, 200);
        reader = new LogfileReader(fileName);
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);

        }
    }

    /**
     * Print the hourly counts using a while loop.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCountsWhile()
    {
        int hour = 0;
        System.out.println("Hr : Count");

        while (hour < hourCounts.length){
            System.out.println(hour + ":" + hourCounts[hour]);
            hour++;
        }
    }

    /**
     * Return the number of accesses recorded in the log file.
     * @return Sum total of all accesses in log file.
     */
    public int numberOfAccesses()
    {
        int total = 0;

        for(int index = 0; index < hourCounts.length; index++){
            total = total + hourCounts[index];
        }
        return total;
    }

    /**
     * Returns the busiest hour of the day.
     * @return int value representing hour
     */
    public int busiestHour()
    {
    }


    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
