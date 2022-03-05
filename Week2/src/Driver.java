
public class Driver {

	public static void main(String[] args) {
		
		OrderedPair<String> fruit = new OrderedPair<>("orange", "banana");
		System.out.println(fruit);
		fruit.changeOrder();
		System.out.println(fruit);

		OrderedPair<Integer> intPair = new OrderedPair<>(80, 179);
		System.out.println(intPair);
		intPair.changeOrder();
		System.out.println(intPair);
	}

}
