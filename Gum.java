package application;

public class Gum extends Snack{

	String brand, flavor;
	int pieces;
	
	Gum(){
	}

	//USE SUPER TO INITIALIZE BASE CLASS PART
	Gum(String name, double price, double height, double weight, double width, String brand, String flavor, int pieces){
		this.name = name;
		this.price = price;
		this.height = height;
		this.weight = weight;
		this.width = width;
		this.brand = brand;
		this.flavor = flavor;
		this.pieces = pieces;
	}
	
	Gum(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
	}
	
	//USE SUPER TO INITIALIZE BASE CLASS PART
	Gum(Snack snack) {
		this.name = snack.name;
		this.price = snack.price;
		this.height = snack.height;
		this.weight = snack.weight;
		this.width = snack.width;
	}	
	
	//USE SUPER TO INITIALIZE BASE CLASS PART
	Gum(Gum gum) {
		this.name = gum.name;
		this.price = gum.price;
		this.height = gum.height;
		this.weight = gum.weight;
		this.width = gum.width;	
		this.brand = gum.brand;
		this.flavor = gum.flavor;
		this.pieces = gum.pieces;
	}

	//MOST OF THESE SHOULD BE CODED IN THE BASE CLASS
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
	
	double getHeight() {
		return this.height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	double getWeight() {
		return this.weight;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	double getWidth() {
		return this.width;
	}

	void setWidth(double width) {
		this.width = width;
	}

	String getBrand() {
		return this.brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getFlavor(){
		return this.flavor;
	}
	
	void setFlavor(String flavor){
		this.flavor = flavor;
	}

	int getPieces(){
		return this.pieces;
	}
	
	void setPieces(int pieces){
		this.pieces = pieces;
	}
	
    @Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nHeight: " + this.getHeight() + "\nWeight: " + this.getWeight() + "\nWidth: " + this.getWidth() + "\nBrand: " + this.brand + "\nFlavor: " + this.flavor + "\nPieces: " + this.pieces;
    }

}
