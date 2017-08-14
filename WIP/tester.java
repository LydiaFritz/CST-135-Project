package application;

public class tester {

	public static void main(String[] args) {
		//printTest(new Candy());
		//printTest(new Chips());
		//printTest();
		//printTest(new Gum());

		Dispenser testDispenser = new Dispenser();
		testDispenser.displayProducts();
		
	}
	public static void printTest(Product prod) {
		System.out.print(prod.getClass().getName() + ":\n" + prod.toString() + "\n\n");
	}

}
