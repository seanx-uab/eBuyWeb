public class Product {
	
	private String name;
	private double price;
	private boolean isAvail;
	
	public Product() {
		this.name = "";
		this.price = 0.0;
		this.isAvail = fals;
	}

	public Product(String name, double price, boolean isAvail) {
		this.name = name;
		this.price = price;
		this.isAvail = isAvail;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;	
	}

	public void setPrice(double price) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;	
	}

}
