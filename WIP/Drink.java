package application;

public class Drink extends Product {

	String Brand;
	String Flavor;
	
	Drink() {
	}
	
	Drink(String name, double price, int quantity, String brand, String flavor) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.Brand = brand;
		this.Flavor = flavor;
	}
	
	Drink(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
		this.quantity = prod.quantity;
	}
	
	Drink(Drink drink) {
		this.name = drink.name;
		this.price = drink.price;
		this.quantity = drink.quantity;
		this.Brand = drink.Brand;
		this.Flavor = drink.Flavor;
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getPrice() {
		return this.price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	int getQuantity() {
		return this.quantity;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getBrand() {
		return this.Brand;
	}
	
	public void setBrand(String Brand) {
		this.Brand = Brand;
	}
	
	public String getFlavor() {
		return this.Flavor;
	}
	
	public void setFlavor(String Flavor) {
		this.Flavor = Flavor;
	}

	@Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nQuantity: ";
    	
    }

}