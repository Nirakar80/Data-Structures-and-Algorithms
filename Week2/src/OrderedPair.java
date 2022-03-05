
public class OrderedPair<T> implements Pairable<T> {
	
	private T first;
	private T second;
	
	public OrderedPair(T firstItem, T secondItem)
	{
		first = firstItem;
		second = secondItem;
		
	}
	
	@Override
	public T getFirst() {
		return first;
	}

	@Override
	public T getSecond() {
		return second;
	}

	@Override
	public void changeOrder() {
		T temp = first;
		first = second;
		second = temp;
	}

	@Override
	public String toString() {
		return "OrderedPair [first=" + first + ", second=" + second + "]";
	}

}
