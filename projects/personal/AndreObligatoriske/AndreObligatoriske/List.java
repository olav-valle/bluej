import java.util.ArrayList;
/**
 * Write a description of class List here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class List
{
    // instance variables - replace the example below with your own
    private ArrayList<Person> personList;

    /**
     * Constructor for objects of class List
     */
    public List()
    {
        // initialise instance variables
        personList = new ArrayList<Person>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addPerson(String name, int age)
    {
        // put your code here
        Person newPerson = new Person(name, age);
        personList.add(newPerson);
    }
    
    public void getPerson(int index)
    {
        Person someVariable = personList.get(index);
        
        someVariable.printDetails();
        
    }
    
    public void printAllPerson()
    {
        for (Person person : personList) {
            person.printDetails();
        }
    }
}
