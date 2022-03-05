package NShrestha;

/*
 * Nirakar Shrestha  
 * CS 216 009
 * Professor Rosemina Vohra
 * Assignment 3
 */

public class LinkedPile<T> implements PileInterface<T> {

	// Declaring private variables for the class.
	private Node<T> firstNode;
	private int numberOfEntries;
	
	// Constructor class for the initialization of the class's variables.
	public LinkedPile()
	{
		firstNode = null;
		numberOfEntries = 0;
	}

	// Boolean method that adds new data in the node and returns true in the end.
	@Override
	public boolean add(T newBook) 
	{
		Node<T> newNode = new Node<T>(newBook);
		//Making new node reference rest of the chain.
		newNode.setNext(firstNode);
		//newNode is beginning of chain.
		firstNode = newNode;
		// Increasing the number of data stored as the new data gets stored.
		numberOfEntries++;
		return true;
	}

	// Method to remove the first data from the dataset.
	@Override
	public T remove() 
	{
		T result = null;
		if(firstNode != null)
		{
			// Removing first node from the linked list.
			result = firstNode.getData();
			firstNode = firstNode.getNext();
			// Decrementing the number of data stored as the first data gets deleted.
			numberOfEntries--;
		}
		return result;
	}

	// Accessor method that returns the first data on the dataset i.e. top book of the pile.
	@Override
	public T getTopBook() 
	{
		T result = null;
		if(firstNode != null)	
		{
			// Removing first node from the linked list.
			result = firstNode.getData();
		}
		return result;
	}

	// Boolean method that checks where the pile is empty or not and returns true if empty and false if not empty.
	@Override
	public boolean isEmpty() 
	{
		return numberOfEntries == 0;
	}
	
	// Clearing the dataset.
	@Override
	public void clear()
	{
		// Creating a while loop to apply remove() class to empty the dataset.
		while (!isEmpty())
		{
			remove();
		}
		// Displaying the information of the pile being cleared.
		System.out.println("The pile has been cleared");
	}

	// Integer type method that returns the number of books in the pile. 
	@Override
	public int getCurrentSize()
	{
		return numberOfEntries;
	}
	
	// Converts the dataset into array for various purposes.
	@Override
	public T[] toArray() 
	{
		T[] result = (T[])new Object[numberOfEntries];
		
		int i = 0;
		Node currentNode = firstNode;
		// Creating a while loop to store data from the dataset to an array.
		while((i < numberOfEntries) && (currentNode != null))
		{
			result[i] =(T) currentNode.getData();
			i++;
			currentNode = currentNode.getNext();
		}
		return result;
	}
	
	

}
