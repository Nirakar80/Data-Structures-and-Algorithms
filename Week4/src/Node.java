
class Node<T> 
{
	// For entry in bag
	private T data;
	// For link to next Node
	private Node<T> next;
	
	// Construction
	Node(T dataPortion)
	{
		this(dataPortion, null);
	}
	
	Node(T dataPortion, Node<T> nextNode)
	{
		data = dataPortion;
		next = nextNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
