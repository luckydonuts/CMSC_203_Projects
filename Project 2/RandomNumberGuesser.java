/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: Random number guesser game
 * Due: 09/26/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michael Bushman
*/
import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring variables
	Scanner sc = new Scanner (System.in);
	int lowGuess = 0;
	int highGuess = 100;
	int nextGuess;
	int randInt = RNG.rand(); // generates the random number
	int count = RNG.getCount(); // gets the current guess count
	String userInput;
	System.out.println("This application generates a random integer between 0 and 100 and asks the user to guess repeatedly until they guess correctly\n");
	System.out.println("Enter your first guess:");
	nextGuess = sc.nextInt();
	// loop continues while user's guess doesn't equal the random number
		while (nextGuess != randInt) {
		
			if (nextGuess < randInt) {
				System.out.println("Your guess is too low");
				lowGuess = nextGuess;
				count++;
			}
		
			else if (nextGuess > randInt) {
				System.out.println("Your guess is too high");
				highGuess = nextGuess;
				count++;
			}
		
			if (count != 0)
				System.out.println("Number of Guesses is: " + count);
			
			if (count > 6) {
				System.out.println("You ran out of guesses.");
				System.exit(0);
			}
			// uses the inputvalidation method to print out the next low and high guess
			while (!RNG.inputValidation(nextGuess, lowGuess, highGuess)) {	
				nextGuess = sc.nextInt();
			}
			// if user's guess equals random number, then do the following
			if (nextGuess == randInt) {
				System.out.println("Congratulations, you guessed correctly.\nTry Again? (yes or no)");
				userInput = sc.next();
				
				if (userInput.equalsIgnoreCase("yes")) {
					RNG.resetCount(); // RNG method to reset the guess count
					main(args);
				}
				
				else {
					System.out.println("Thanks for playing...\n");
					System.out.println("Programger: Michael Bushman");
					System.exit(0);
				}
			}
		}
	}
}


	