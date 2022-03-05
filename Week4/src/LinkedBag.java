
public class LinkedBag<T> implements BagInterface<T> {

	private Node<T> firstNode;
	private int numberOfEntries;
	
	public LinkedBag()
	{
		firstNode = null;
		numberOfEntries = 0;
	}
	
	@Override
	public int getCurrentSize() {
		return numberOfEntries;
	}

	@Override
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}

	@Override
	public boolean add(T newEntry) {
		Node<T> newNode = new Node<T>(newEntry);
		// Making new node reference rest of the chain.
		newNode.setNext(firstNode);
		//newNode is beginning of chain.
		firstNode = newNode;
		numberOfEntries++;
		return true;
	}

	@Override
	public T remove() {
		T result = null;
		if(firstNode != null)
		{
			// Removing first node from the linked list.
			result = firstNode.getData();
			firstNode = firstNode.getNext();
			numberOfEntries--;
		}
		return result;
	}

	@Override
	public void clear() {
		while (!isEmpty())
		{
			remove();
		}
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		int frequency = 0;
		int i = 0;
		Node currentNode = firstNode;
		
		while((i < numberOfEntries) && (currentNode != null))
		{
			if(anEntry.equals(currentNode.getData()))
			{
				frequency++;			
			}
			i++;
			currentNode = currentNode.getNext();
		}
		
		return frequency;
	}

	@Override
	public boolean contains(T anEntry) {
		boolean found = false;
		Node currentNode = firstNode;
		while(!found && currentNode != null)
		{
			if(anEntry.equals(currentNode.getData()))
			{
				found = true;
			}
			else
			{
				currentNode = currentNode.getNext();
			}
		}
		return false;
	}

	@Override
	public T[] toArray() {
		T[] result = (T[])new Object[numberOfEntries];
		
		int i = 0;
		Node currentNode = firstNode;
		while((i < numberOfEntries) && (currentNode != null))
		{
			result[i] =(T) currentNode.getData();
			i++;
			currentNode = currentNode.getNext();
		}
		return result;
	}

	@Override
	public boolean remove(T anEntry) {
		boolean result = false;
		Node nodeN = getReferenceTo(anEntry);
		if(nodeN != null)
		{
			nodeN.setData(firstNode.getData());
			firstNode = firstNode.getNext();
			numberOfEntries--;
			result = true;
		}
		return result;
	}

	private Node getReferenceTo(T anEntry) {
		boolean found = false;
		Node<T> currentNode = firstNode;
		while(!found && (currentNode != null))
		{
			if(anEntry.equals(currentNode.getData()))
			{
				found = true;
			}
			else
			{
				currentNode = currentNode.getNext();
			}
		}
		return currentNode;
	}

}
