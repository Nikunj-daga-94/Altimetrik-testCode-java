package main;

public class Product {
	private Double price;
	private String name;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	Product(String name,Double price){
		this.setName(name);
		this.setPrice(price);
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
