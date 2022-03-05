package NShrestha;

/*
 * Nirakar Shrestha  
 * CS 216 009
 * Professor Rosemina Vohra
 * Assignment 3
 */

	/**
	 An interface for a pile of books.
	*/
public interface PileInterface<T>
{
	/** Adds a new book to the top of this pile.
	@param newBook An object to be added to the pile. 
	 * @return */
	public boolean add(T newBook);
	
	/** Removes and returns this pile's top book.
	@return Either the book at the top of the pile or, if the
	 pile is empty before the operation, null. */
	public T remove();
	
	/** Retrieves this pile's top book.
	@return Either the book at the top of the pile or null if
	 the pile is empty. */
	public T getTopBook();
	
	/** Detects whether this pile is empty.
	@return True if the pile is empty. */
	public boolean isEmpty();
	
	/** Removes all books from this pile. */
	public void clear();

	/** Return the size of the Pile */
	public int getCurrentSize();

	// Converts the set of data into array.
	public T[] toArray();
} // end PileInterface

