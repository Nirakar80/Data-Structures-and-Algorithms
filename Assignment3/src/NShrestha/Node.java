package NShrestha;

// Creating a node class
class Node<T> 
{
	// For entry in bag
	private T data;
	// For link to next Node
	private Node<T> next;
	
	// Constructor to call the second constructor
	Node(T dataPortion)
	{
		this(dataPortion, null);
	}
	
	// Constructor to store passed arguments into the class's private variables.
	Node(T dataPortion, Node<T> nextNode)
	{
		data = dataPortion;
		next = nextNode;
	}

	// Accessor method to get the value currently stored in 'data'.
	public T getData() {
		return data;
	}

	// Setter method to store the value into the class's 'data'.
	public void setData(T data) {
		this.data = data;
	}

	// Another Accessor method of the class to get the next node data. 
	public Node<T> getNext() {
		return next;
	}

	// Setter method to store the value in the class's 'next'
	public void setNext(Node<T> next) {
		this.next = next;
	}
}
