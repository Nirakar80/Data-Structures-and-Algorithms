package NShrestha;

/*
 * Nirakar Shrestha  
 * CS 216 009
 * Professor Rosemina Vohra
 * Assignment 3
 */

// Importing Scanner class.
import java.util.Scanner;

public class PileOfBookDemo 
{
	public static void main(String[] args) 
	{
		// Initializing a scanner object.
		Scanner input = new Scanner(System.in);

		// Declaring necessary variable for the class.
		PileInterface<String> pile = new LinkedPile<>();
		int numberOfBooks;
		String book;
		
		// Prompting users for the number of books in the pile.
		System.out.print("How many books do you want to stack? ");
		numberOfBooks = input.nextInt();

		// Prompting users for the names of the books and storing them in 'pile' using for loop
		System.out.println("Enter the name of the books you want to place from bottom to top: ");
		for ( int i = 0; i <= numberOfBooks; i++)
		{
			book = input.nextLine();
			// Calling the accessor method of LinkedPile class to add the data into tha dataset.
			pile.add(book);
		}
		System.out.println(" ");
		// Displaying the pile of book.
		displayPile(pile);
		System.out.println("There are " + pile.getCurrentSize() + " books in the pile.");
		System.out.println(" ");
		// Removing the top book of the pile.
		System.out.println("Removing the book on the top i.e. " + pile.remove());
		System.out.println(" ");	
		// Displaying the pile of book after the change.
		displayPile(pile);
		// Checking whether the pile is empty.
		System.out.println("Is the pile empty? " + pile.isEmpty());
		
		// Clearing the pile.
		System.out.println("Clearing the pile...");
		pile.clear();
		displayPile(pile);
		System.out.println("Is the pile empty? " + pile.isEmpty());

	}

	// Method required by the class to display the contents and order of the pile.
	private static<T> void displayPile(PileInterface<T> pile) 
	{
		System.out.println("The list of the books stacked from top to bottom is: ");
		Object[] aBagArray = pile.toArray();
		// Using for loop and toArray() method to print the elemnts of dataset. 
		for (int i = 0; i < aBagArray.length; i++)
		{
			if (aBagArray[i] == null)
			{
				System.out.println(" ");
			}
			else
			{
				System.out.println(aBagArray[i] + " ");				
			}
		}
		System.out.println(" ");
	}
}