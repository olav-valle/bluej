public class Sum
{
	public static void main(String[] args)
	{
		int counter = 0;
		int index = 1;

		while(index <= 10){
			counter = counter + index;
			System.out.println("The sum of 1 through " + index + " is " + counter + "!");
			index++;

		}
		System.out.println("The sum of 1 through 10 is: " + counter + "!");
	}
}
