package NShrestha;

// Importing required pacages for the class.
import java.util.Random;
import java.util.Scanner;

/*
 * Nirakar Shrestha
 * CS 216 009
 * Professor Rosemina Vohra
 * Assignment 2
 */

public class GuessingGame 
{

	public static void main(String[] args) 
	{
	// Initializing a Scanner and a Random object.
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	// Creating a new instance of ArrayBag as an Integer.
	ArrayBag<Integer> numbersBag = new ArrayBag<Integer>();
	
	// Prompting user for the number of random numbers to be generated.
	System.out.print("How many random numbers do you want to generate: ");
	int numbers = input.nextInt();
	int num = numbers;
	
	// Prompting user for the range of the numbers to be generated from.
	System.out.print("Enter the range of numbers to be generated: ");
	int range = input.nextInt();
	
	// Creating integer variables and initializing them.
	int randomNumber;
	int guessedNumber;
	int correctGuesses = 0;
	
	// Creating a for loop to generate the desired number of random numbers.
	for (int i = 0; i < numbers; i++)
	{
		randomNumber = rand.nextInt(range);
		// Storing the generated number to numberBags
		numbersBag.add(randomNumber);
	}
	
	
	// Displaying the contents of the numbersBag.
	displayBag(numbersBag);
	
	
	// Creating an Array for the numberBags.
	Object[] numbersBagArray = numbersBag.toArray();
	
	// Informing the user about the game instructions.
	System.out.println("Let the Guessing Game begin.....");
	System.out.println("Enter " + numbers + " numbers in between 0 and " + range +":");
	
	// Using a while loop to make the user keep trying until they guess all the numbers right.
	while (!(correctGuesses >= numbers))
	{
		// Creating another new instance of ArrayBag
		ArrayBag<Integer> guessBag = new ArrayBag<Integer>();
		
		// Prompting user to enter their guess using for loop.
		System.out.println("Enter your guess: ");
		for ( int i = 0 ; i < numbers; i++)
		{
			System.out.print(" ");
			guessedNumber = input.nextInt();
			guessBag.add(guessedNumber);
		}
		
		
		Object[] guessBagArray = guessBag.toArray();
		
		// Displaying the user's guesses.
		System.out.print("Your guess is: "); 
		displayBag(guessBag);
		
		correctGuesses = 0;
		
		// Creating a nested for-loop to compare the random numbers and the user's guesses.
		for (int i = 0; i < numbers; i++)
		{
			Object[] tempBagArray = numbersBagArray;
			for ( int j = 0; j < num; j++)
			{
				Object[] tryBagArray = guessBag.toArray();
				int minus = 0;
				minus = guessBag.getFrequencyOf((Integer) guessBagArray[i]) - 1;
				// Creating an if block to increment the counter if the guess is correct.
				if (tryBagArray[j] == tempBagArray[i])
				{	
					correctGuesses++;
					correctGuesses = correctGuesses - minus;
					i++;
					j = 0;
				}
				else
				{
					break;
				}
			}	
		}
		// Displaying how many numbers the user guessed correctly.
		System.out.println("You have guessed " + correctGuesses + " number/s correctly.");
	}
		// Out of the Game.
		System.out.println("Congratualtions you have guessed all the numbers.");
	}
	
	// Creating a method that displays all the content of a bag.
	private static void displayBag(BagInterface<Integer> bag) 
	{
		Object[] aBagArray = bag.toArray();
		for (int i = 0; i < aBagArray.length; i++)
		{
			System.out.print(aBagArray[i] + " ");
		}
		System.out.println();
	}
	

}


