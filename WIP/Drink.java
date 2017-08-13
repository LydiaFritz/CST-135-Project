package application;

public class Drink extends Product {

	String Brand;
	String Flavor;
	
	Drink() {
	}
	
	Drink(String name, String type, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	Drink(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
		this.quantity = prod.quantity;
	}
	
	Drink(Drink drink) {
		this.Brand = drink.Brand;
		this.Flavor = drink.Flavor;
	}
	
	public String getBrand() {
		return this.Brand;
	}
	
	public void setBrand() {
		this.Brand = Brand;
	}
	
	public String getFlavor() {
		return this.Flavor;
	}
	
	public void setFlavor() {
		this.Flavor = Flavor;
	}
	
	public String toString() {
		return this.getClass().getName() + '@' + Integer.toHexString((int) Product.getPrice());
	}
}
