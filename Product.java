//SEE MY COMMENTS - LYDIA

//MUST INCLUDE NAME AND STATEMENT THAT WORK IS YOUR OWN AT THE TOP OF EVERY FILE

package application;

//ABSTRACT SHOULD BE INDICATED IN UML DIAGRAM
public abstract class Product {

	//NEED TO ADD A FIELD FOR THE QUANTITY
	String name;
	double price;
	
	Product() {
	}
	
	//WHY IS THERE AN ARGUMENT FOR TYPE?  YOU AREN'T USING IT HERE.
	Product(String name, String type, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Overload
	Product(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
	}

	//THESE SHOULD BE IMPLEMENTED HERE - THEY BEHAVE EXACTLY THE SAME FOR ALL SUBCLASSES
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

	//NOT HOW SELLONE WORKS - IF THE PRODUCT HAS A QUANTITY > 0 THEN REDUCE QUANTITY BY 1 AND RETURN TRUE
	//OTHERWISE RETURN FALSE.
	//boolean
	private boolean sellOne(double price) {
		while (this.price != price)
			return false;
		return true;
	}
}
