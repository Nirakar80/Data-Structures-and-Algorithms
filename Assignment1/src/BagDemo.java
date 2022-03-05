/*
 * Nirakar Shrestha
 * CS 216 009
 * Professor Rosemina Vohra
 * Assignment 1
 */

public class BagDemo 
{

	public static void main(String[] args) 
	{	
		// Declaring String variables that are defined as per the BagInterface.
		Bag<String> letters = new Bag<String>();
		Bag<String> vowels = new Bag<String>(); 
		Bag<String> storage = new Bag<String>();
		
		// Adding the vowels to the bag 'vowels'.
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
 		
		// Adding random one-letter strings to the bag 'letters'.
		letters.add("n");
		letters.add("i");
		letters.add("r");
		letters.add("a");
		letters.add("k");
		letters.add("a");
		letters.add("r");
		letters.add("o");
		letters.add("a");
		letters.add("t");
		letters.add("i");
		letters.add("a");
		letters.add("s");
		letters.add("u");
		letters.add("u");
		letters.add("o");
		letters.add("o");
		letters.add("b");
		letters.add("i");
		
		// Creating a for loop to compare all the strings in 'letters' with the 'vowels' and extract them into 'storage'.
		for (int i = letters.getCurrentSize(); i > 0 ; i--)
		{
			String toCheck = letters.remove();
			if (vowels.contains(toCheck))
			{
				// Adding the vowels from 'letters' to 'storage'.
				storage.add(toCheck);
			}
		}
		
		// Displaying the results from the 'storage'
		System.out.println("The bag of 'letter' contains " + storage.getCurrentSize() + " vowels.");
		System.out.println("The bag of 'letter' contains " + storage.getFrequencyOf("a") + " a.");
		System.out.println("The bag of 'letter' contains " + storage.getFrequencyOf("e") + " e.");
		System.out.println("The bag of 'letter' contains " + storage.getFrequencyOf("i") + " i.");
		System.out.println("The bag of 'letter' contains " + storage.getFrequencyOf("o") + " o.");
		System.out.println("The bag of 'letter' contains " + storage.getFrequencyOf("u") + " u.");
		
	}

}
