package application;

public abstract class Product {

	String name;
	double price;
	
	Product() {
	}
	
	Product(String name, String type, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Overload
	Product(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
	}

	
	//getters and setters
	abstract String getName();
	
	abstract void setName(String name);

	abstract double getPrice();
	
	abstract void setPrice(double price);
	
	//toString
	@Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice();
    }

	
	//boolean
	private boolean sellOne(double price) {
		while (this.price != price)
			return false;
		return true;
	}
}
