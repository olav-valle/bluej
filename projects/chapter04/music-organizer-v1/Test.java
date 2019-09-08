
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    public MusicOrganizer mOTest;

    /**
     * Constructor for objects of class test
     */
    public Test()
    {
    }

    public void makeLibrary()
    {
        this.mOTest = new MusicOrganizer();
        
        mOTest.addFile("song0");
        mOTest.addFile("song1");
        mOTest.addFile("song2");
        mOTest.addFile("song3");
    }
    
    public void testCheckIndex()
    {
        int indexIncrement = 0;
        while (indexIncrement <= mOTest.getNumberOfFiles()) {
            System.out.println("Testing index number: " + indexIncrement);
            mOTest.checkIndex(indexIncrement);
            indexIncrement++;
        }
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
