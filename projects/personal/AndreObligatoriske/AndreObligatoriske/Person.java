import java.util.ArrayList;
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age)
    {
        // initialise instance variables
        this.name = name;
        this.age = age;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void makeList()
    {
        ArrayList<Person> personList = new ArrayList<Person>();
    }
    
    public void printDetails()
    {
        System.out.println(name + age);
    }
}