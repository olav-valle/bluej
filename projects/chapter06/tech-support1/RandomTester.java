import java.util.Random;
import java.util.ArrayList;
/**
* Tester for a pseudo random number generator class.
*@author		Olav Valle
*@version		0.1 Wed 25 Sep 2019 09:44:18 CEST
*/

public class RandomTester
{
	Random randomiser;

	public RandomTester()
	{
			randomiser = new Random();
	}

		
	public int getOneRandom()
	{
		return randomiser.nextInt();
		
	}
	/**
	* Generates and returns an ArrayList of a specified number 
	* of pseudo-random numbers(PRN).
	*@param howMany integer value for number of PRN to return
	*@return ArrayList<Integer> containing PRN
	*/
	 
	public ArrayList<Integer> getManyRandom(int howMany)
	{
		int index = 1;
		ArrayList<Integer> numbers = new ArrayList<>();
		while(index <= howMany) {
			numbers.add(randomiser.nextInt());
			index++;
		}
		return numbers;
	}
}
