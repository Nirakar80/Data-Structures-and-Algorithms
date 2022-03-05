package NShrestha;

/*
 * Nirakar Shrestha
 * CS 216 009
 * Professor Rosemina Vohra
 * Assignment 2
 */

// This is the interface for the project. 
 
public interface BagInterface<T> 
	{

	// Gets the current number of entries in the bag.	
	public int getCurrentSize();
	
	// Checks whether the bag is empty or not and returns true if empty and false if not.
	public boolean isEmpty();
	
	// Adds a new entry to the bag and, returns true if successful and false if not.
	public boolean add(T newEntry);
	
	// Removes an unspecified entry from the bag, if there is any.
	public T remove();
	
	// Removes all entries from the bag.
	public void clear();
	
	// Counts the number of times the entry appears in the bag.
	public int getFrequencyOf(T anEntry);
	
	// Checks whether the bag contains the given entry and, returns true if does and false if not.
	public boolean contains(T anEntry);
	
	// Retrieves all the entries of the bag in a new array.
	public T[] toArray();
	
	// Removes an item form the bag and, returns true if successful and false if not.
	public boolean remove(T anEntry);
	
	
	 
	}
