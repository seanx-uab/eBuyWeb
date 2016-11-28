public class Product {
	
	private String name;
	private double price;
	
	public Product() {
		this.name = "";
		this.price = 0.0;	
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void getName() {
		return this.name;	
	}

}
