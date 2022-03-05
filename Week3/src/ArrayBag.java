
public class ArrayBag<T> implements BagInterface<T> {

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

	private boolean isArrayFull() {
		return numberOfEntries >= bag.length;
	}

	@Override
	public T remove() {
		T result = removeEntry(numberOfEntries - 1);
		return result;
	}
	
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

	@Override
	public boolean remove(T anEntry) {
		int i = getIndexOf(anEntry);
		T result = removeEntry(i);
		return anEntry.equals(result);
	}
	
	private int getIndexOf(T anEntry) {
		int where = -1;
		boolean found = false;
		int i = 0;
		while (!found && (i < numberOfEntries)) {
			if(anEntry.equals(bag[i])) {
				found = true;
				where = i;
			}
		i++;	
		}
 		return where;
	}

	@Override
	public void clear() {
		while (!isEmpty()) {
			remove();
		}

	}
	

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
