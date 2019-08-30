/**
* The student class represents a student
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
	/**
	* Creates and returns a system login name for the student.
	* Login consists of first 4 characters  of string variable name,
	* and first 3 characters of string variable id.
	*/
	//public String getLoginName()
	//{
	//	if (name.length() < 4) {
	//		String nameSub = 
	//	return (name.substring(0,4) + id.substring(0,3));
	//}

/**
* start by checking if name has length() enough to be used for .substring(0,4)
* if long enough, use 4 as final index in .substring(0,4)
* if name.length() is shorter than 4, use whole name string as substitute for name.substring(0,4)
* and calculate difference between length of name string and 4.
* extend the id.substring(0,3+) ... hold that thought
*/

/**
* instead of using if-else, simply calculate difference in length of each String, name and id.
* extend the final index of name.substring(a,b+difId) with the difference int difId = (3 - id.length());,
* and vice versa for final index of id.substring(a,b) with difference int difName = (4 - name.length());
*/

	public String getLoginName()
	{
		int difId = (3 - id.length());
		int difName = (4 - name.length());

		return (name.substring(0,4+difId) + id.substring(0,3+difName));
	}

