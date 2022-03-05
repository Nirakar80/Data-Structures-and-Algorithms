
public class LinkedBagDemo {

	public static void main(String[] args) 
	{
		BagInterface<String> aBag = new LinkedBag<>();
		aBag.add("A");
		aBag.add("D");
		aBag.add("B");
		aBag.add("A");
		displayBag(aBag);
		aBag.remove();
		displayBag(aBag);
		aBag.remove("D");
		displayBag(aBag);
		
		System.out.println("The frequecy of A's in aBag is " +
		aBag.getFrequencyOf("A"));
		
		System.out.println("The aBag contains C?  " +
				aBag.contains("c"));
		
		BagInterface<Integer> iBag = new LinkedBag<>();
		
		iBag.add(1);
		iBag.add(2);
		iBag.add(3);
		iBag.add(4);
		iBag.add(1);
		displayBag(iBag);
		iBag.remove(1);
		displayBag(iBag);
		
		BagInterface<Double> dBag = new LinkedBag<>();
		
		dBag.add(2.1);
		dBag.add(3.2);
		dBag.add(4.9);
		dBag.add(5.0);
		dBag.add(2.4);
		displayBag(dBag);
		dBag.remove(5.4);
		displayBag(dBag);
		System.out.println("Frequency of '2' is " + dBag.getFrequencyOf(2.0));
	}
	
	private static<T> void displayBag(BagInterface<T> aBag) {
		Object[] aBagArray = aBag.toArray();
		for (int i = 0; i < aBagArray.length; i++)
		{
			if (aBagArray[i] == null)
			{
				System.out.println(" ");
			}
			else
			{
				System.out.print(aBagArray[i] + " ");				
			}

		}
		System.out.println();
	}

}
