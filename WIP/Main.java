package application;



public abstract class Main {
	
	public static void main(String[] args) {

		Dispenser testDispenser = new Dispenser();
		testDispenser.displayProducts();
		System.out.println(testDispenser.toString());
		
	}
}
