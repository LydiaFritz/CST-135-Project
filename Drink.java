//NAME AND STATEMENT OF OWN WORK NEEDED.
//I WANT TO KNOW WHO AUTHORED EACH FILE


package application;

public class Drink extends Product {

	String brand;
	String flavor;
	
	Drink() {
	}
	
	//THIS SHOULD NOT BE POSSIBLE IF NAME AND PRICE ARE DECLARED PRIVATELY.
	//NEED TO USE SUPER TO INITIALIZE THE NAME AND PRICE, AS IN
	//super(name, price);
	Drink(String name, double price, String brand, String flavor) {
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.flavor = flavor;
	}
	
	//GET RID OF THIS CONSTRUCTOR - IT IS REDUNDANT
	Drink(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
	}
	
	//AGAIN, NAME AND PRICE SHOULD BE PRIVATE IN THE PRODUCT CLASS
	//MUST USE super(name, price) TO INITIALIZE THE BASE CLASS OBJECT
	Drink(Drink drink) {
		this.name = drink.name;
		this.price = drink.price;
		this.brand = drink.brand;
		this.flavor = drink.flavor;
	}
	
	
	//IMPLEMENT IN THE BASE CLASS
	String getName() {
		return this.name;
	}
	//IMPLEMENT IN THE BASE CLASS
	void setName(String name) {
		this.name = name;
	}
	//IMPLEMENT IN THE BASE CLASS
	double getPrice() {
		return this.price;
	}
	//IMPLEMENT IN THE BASE CLASS
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
