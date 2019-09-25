import java.util.Scanner;

public class IsPrime
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("which number?");

		int checkThis = scan.nextInt();

		boolean notPrime = true;
		int index = 2;

		while((index < checkThis) && notPrime){

			if((checkThis % index) == 0){
				notPrime = false;
			}

			index++;
		}

		if(notPrime) { System.out.println(checkThis + " is prime.");}
		else { System.out.println(checkThis + " is not prime.");}
	}
}
