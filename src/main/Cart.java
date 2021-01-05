package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Cart {
	ArrayList<Product> pList=new ArrayList<Product>();
	public Cart() {
		// TODO Auto-generated constructor stub
		
	}
	Cart(ArrayList<Product> src){
		Collections.copy(this.pList, src);
	}
	public void addToCart(Product newP) {
		this.pList.add(newP);
	}
	public void removeCart(Product delP) {
		this.pList.removeIf(prod-> prod.getName() == delP.getName());
	}
	public ArrayList< Product> search(String value){
		ArrayList<Product> arl = new ArrayList<Product>();
		arl.addAll(this.pList.stream().filter(prod-> prod.getName().contains(value)).collect(Collectors.toList()));
		return arl;
	}
	public void customSort(String sortBy) {
		if(sortBy.equalsIgnoreCase("product"))
		Collections.sort(this.pList, (Product s1, Product s2) ->{
	        return s1.getName().compareToIgnoreCase(s2.getName());
	});
		else
		Collections.sort(this.pList, (Product s1, Product s2) ->{
	        return s1.getPrice().compareTo(s2.getPrice());
	});
	}
	public void checkout() {
		
	}
	public ArrayList< Product> getList(){
		return this.pList;
	}
}
