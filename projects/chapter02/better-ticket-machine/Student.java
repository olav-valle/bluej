 
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // Full name
    private String name;
    // Assigned student ID
    private String id;
    // Credits for studies taken so far
    private int credit;
    
    /**
    * Constructor.
    * Parameters are stored in class wide fields.
    * Credits are set to 0.
    */
    public Student(String fullName, String studentId)
    {
	name = fullName;
	id = studentId;
	credit = 0;
    }

    public String getLoginName()
    {
        int difId = (3 - id.length());
        int difName = (4 - name.length());
        
        return (name.substring(0,4+difId) + id.substring(0,3+difName));
    }
}
