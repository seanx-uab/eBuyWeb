public class Product {
	
	private String name;
	private double price;
	private boolean isAvail;
	
	public Product() {
		this.name = "";
		this.price = 0.0;
		this.isAvail = false;
	}

	public Product(String name, double price, boolean isAvail) {
		this.name = name;
		this.price = price;
		this.isAvail = isAvail;
	}

}
