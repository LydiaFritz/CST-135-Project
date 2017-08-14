package application;

public class Drink extends Product {

	String brand;
	String flavor;
	
	Drink() {
	}
	
	Drink(String name, double price, String brand, String flavor) {
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.flavor = flavor;
	}
	
	Drink(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
	}
	
	Drink(Drink drink) {
		this.name = drink.name;
		this.price = drink.price;
		this.brand = drink.brand;
		this.flavor = drink.flavor;
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
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String Brand) {
		this.brand = Brand;
	}
	
	public String getFlavor() {
		return this.flavor;
	}
	
	public void setFlavor(String Flavor) {
		this.flavor = Flavor;
	}

	@Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nBrand: " + this.getBrand() + "\nFlavor: " + this.getFlavor();
    	
    }

}