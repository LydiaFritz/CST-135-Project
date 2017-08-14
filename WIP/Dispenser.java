package application;

import java.util.ArrayList;
import java.util.List;

public class Dispenser {
	
	private ArrayList<Product> products = new ArrayList<Product>();
	final int CAPACITY = 100;
	
	Dispenser() {
		products.add(new Candy("Kitkat", 1.75, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		products.add(new Chips("Wavy Lay's", .75, 1.23, .98, 1.45, "Lay's", "Sour Cream and Onion"));
		products.add(new Drink("Coke", 1.75, "Coca-cola", "Classic"));
		products.add(new Gum("Juicy Fruit", .89, .55, .75, .98, "Wriggly's", "fruit", 16));
	}

	//ADD PRODUCT
	boolean addProduct(Product prod) {
		if(products.size() < CAPACITY) {
			products.add(prod);
			return true;			
		}
		return false;	
	}
	
	//REMOVE PRODUCT
	boolean removeProduct(Product prod) {
		if(products.size() > CAPACITY) {
			products.remove(prod);
			return true;
		}
			return false;
		}
	
	//CHANGE PRICE 
	public void changePrice(Product prod, double price) {
			prod.price = price;
	}


	//ITEMS IN AN ARRAY
	public void displayProducts(){
    	for(int i = 0; i < products.size(); i++) {
    		System.out.println(products.get(i).toString());
    	}
	}
	
	//toString()
    public String toString(){
    	return "Number of Items: " + this.products.size() + "\nTotal Capacity: " + this.CAPACITY;
    	
    }

}
