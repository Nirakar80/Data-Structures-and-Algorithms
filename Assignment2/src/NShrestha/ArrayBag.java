package NShrestha;

/*
 * Nirakar Shrestha
 * CS 216 009
 * Professor Rosemina Vohra
 * Assignment 2
 */

public class ArrayBag<T> implements BagInterface<T> 
{
	// Creating private variables for the class.
	private final T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY = 25;
	
	// Creates an empty bag with capacity of 25
	public ArrayBag() {
		this(DEFAULT_CAPACITY);
	}
	
	//	Creates an empty bag with desired capacity.
	public ArrayBag(int desiredCapacity) {
		T[] tempBag = (T[]) new Object[desiredCapacity];
		bag = tempBag;
		numberOfEntries = 0;
	} 

	// Gets you the number of entries in the bag.
	@Override
	public int getCurrentSize() {
		return numberOfEntries;
	}

	// Checks if the bag is empty or not and return true if empty and false if not.
	@Override
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}
	
	// Checks if bag is full before adding items to it.	
	@Override
	public boolean add(T newEntry) {
		boolean result = true;
		if(isArrayFull()) {
			result = false;
		}
		else {
			bag[numberOfEntries] = newEntry;	
			numberOfEntries++;
		}
		return false;
	}

	// Checks if the bag is full.
	private boolean isArrayFull() {
		return numberOfEntries >= bag.length;
	}

	// Removes the last entry of the bag.
	@Override
	public T remove() {
		T result = removeEntry(numberOfEntries - 1);
		return result;
	}
	
	/* Removes the desired entry/entries from the bag by replacing the desired entry by the 
	last entry of the bag and replacing the  last entry spot by null.
	*/
	
	private T removeEntry(int i) {
		T result = null;
		if (!isEmpty() && i >= 0) {
			result = bag[i];
			int lastIndex = numberOfEntries - 1;
			bag[i] = bag [lastIndex];
			bag[lastIndex] = null;
			numberOfEntries--;
		}
		return result;
	}

	// Removes entered entry/entries.
	@Override
	public boolean remove(T anEntry) {
		int i = getIndexOf(anEntry);
		T result = removeEntry(i);
		return anEntry.equals(result);
	}
	
	// Gets the position of a desired entry.
	private int getIndexOf(T anEntry) {
		int where = -1;
		boolean found = false;
		int i = 0;
		// Creating while loop to find the index.
		while (!found && (i < numberOfEntries)) {
			if(anEntry.equals(bag[i])) {
				found = true;
				where = i;
			}
		i++;	
		}
 		return where;
	}

	// Removes entries one ate a time in loop until the bag is empty.
	@Override
	public void clear() {
		while (!isEmpty()) {
			remove();
		}

	}
	
	// Returns the number of times a value appears in the bag.
	@Override
	public int getFrequencyOf(T anEntry) {
		int counter = 0;
		for (int i = 0; i < numberOfEntries; i++)
		{
			if(anEntry.equals(bag[i])) {
				counter++;
			}
		}
		return counter;
	}
	
	// Checks if the bag contains a entry.
	@Override
	public boolean contains(T anEntry) {
		boolean found = false;
		int i = 0;
		while (!found && i < numberOfEntries) {
			if (anEntry.equals(bag[i])) {
				found = true;
			}
			i++;
		}
		return found;
	}

	// Converts a bag to Array.
	@Override
	public T[] toArray() {
		T[] result =(T[]) new Object[numberOfEntries];
		
		for (int i = 0; i < numberOfEntries; i ++)
		{
			result[i] = bag[i];
		}
		return result;
	}
}
