package chapter12;

import chapter10.ListInterface;

public class LList<T> implements ListInterface<T> 
{
	private Node<T> firstNode;
	private int numberOfEntries;
	
	public LList()
	{
		firstNode = null;
		numberOfEntries = 0;
	}
	
	private Node<T> getNodeAt(int givenPosition)
	{
		Node<T> currentNode = firstNode;
		for(int i = 1; i < givenPosition; i++)
		{
			currentNode = currentNode.getNextNode();
		}
		return currentNode;
	}
	
	@Override
	public void add(T newEntry)
	{
		Node<T> newNode = new Node(newEntry);
		if(isEmpty())
		{
			firstNode = newNode;
		}
		else
		{
			Node<T> lastNode = getNodeAt(numberOfEntries);
			lastNode.setNextNode(newNode);
		}
		numberOfEntries++;
	}

	@Override
	public void add(int givenPosition, T newEntry)
	{
		if((givenPosition >= 1) && (givenPosition <= numberOfEntries + 1))
		{
			Node<T> newNode = new Node(newEntry);
			if(givenPosition == 1)
			{
				newNode.setNextNode(firstNode);
				firstNode = newNode;
			}
			else
			{
				Node<T> nodeBefore = getNodeAt(givenPosition - 1);
				Node<T> nodeAfter = nodeBefore.getNextNode();
				newNode.setNextNode(nodeAfter);
				nodeBefore.setNextNode(newNode);
			}
			numberOfEntries++;
		}
		else
		{
			throw new IndexOutOfBoundsException("Illegal position given");
		}
	}

	@Override
	public T remove(int givenPosition)
	{
		return null;
	}

	@Override
	public void clear() 
	{
		firstNode = null;
		numberOfEntries = 0;
	}

	@Override
	public T replace(int givenPosititon, T newEntry)
	{
		return null;
	}

	@Override
	public T getEntry(int GivePosition)
	{
		return null;
	}

	@Override
	public T[] toArray() 
	{
		T[] result = (T[]) new Object[numberOfEntries];
		int i = 0;
		Node<T> currentNode = firstNode;
		while(i < numberOfEntries && currentNode != null)
		{
			result[i] = (T) currentNode.getData();
			currentNode = currentNode.getNextNode();
			i++;
		}
		return result;
	}

	@Override
	public boolean contains(T anEntry)
	{
		return false;
	}

	@Override
	public boolean isEmpty() 
	{
		return numberOfEntries == 0;
	}

	@Override
	public int getLength()
	{
		return numberOfEntries;
	}

}
