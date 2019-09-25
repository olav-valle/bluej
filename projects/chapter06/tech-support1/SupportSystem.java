import java.util.Random;
import java.util.ArrayList;
/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class SupportSystem
{
    private static InputReader reader;
    private static Responder responder;
    private static SupportSystem support;
    private static RandomTester randomiser;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
	randomiser = new RandomTester();
    }
    
    public static void main(String[] args)
    {
        support = new SupportSystem();
        support.start();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {

	boolean finished = false;

	printWelcome();

	while(!finished) {
	    String input = reader.getInput().trim().toLowerCase();

	    if(input.equals("bye")) {
                finished = true;
	    }

	    else {
		if(input.equals("random")) {
		    printRandom();
		}	
	    
		else {
		String response = responder.generateResponse();
		System.out.println(response);
		}
	    }
	}

        printGoodbye();
    }

    /**
    * Prints out numbers generated by RandomTester.
    */

    private void printRandom()
    {
	System.out.println("How many numbers would you like to generate?"); //user has asked for random number(s)
	
	int howMany = reader.getIntInput();
	
	ArrayList<Integer> randomNumbers = (randomiser.getManyRandom(howMany)); //call to RandomTester for PRNG

	for(int random: randomNumbers) { 
	    System.out.println(random);
	}
    }


    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
