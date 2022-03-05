
public class ArrayBagDemo {

	public static void main(String[] args) {
		
		BagInterface<String> aBag = new ArrayBag<String>();
		aBag.add("A");
		aBag.add("A");
		aBag.add("B");
		aBag.add("C");
		displayBag(aBag);
		System.out.println("Is aBag empty? " + aBag.isEmpty());
		System.out.println("Number of A's in aBag = " + aBag.getFrequencyOf("A"));

		
		BagInterface<String> bBag = new ArrayBag<String>();
		bBag.add("B");
		bBag.add("A");
		bBag.add("D");
		displayBag(bBag);
		System.out.println("Size of bBag = " + bBag.getCurrentSize());
		
		BagInterface<String> cBag = new ArrayBag<String>(7);
		cBag.add("C");
		cBag.add("A");
		cBag.add("T");
		displayBag(cBag);
		System.out.println("Number of C's in cBag = " + cBag.getFrequencyOf("C"));
		System.out.println("Removing 'T' ... " + cBag.remove("T") );
		displayBag(cBag);
		cBag.clear();
		displayBag(cBag);
	}

	private static void displayBag(BagInterface<String> aBag) {
		Object[] aBagArray = aBag.toArray();
		for (int i = 0; i < aBagArray.length; i++)
		{
			System.out.print(aBagArray[i] + " ");
		}
		System.out.println();
	}
}
