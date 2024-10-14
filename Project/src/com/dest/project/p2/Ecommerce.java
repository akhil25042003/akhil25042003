package com.dest.project.p2;
import java.util.ArrayList;

class Product{
	private int ProductId;
	private String ProductName;
	private double price;
	
	public Product() {

	}
	
	
}
class Cart{
	
}
class Bill{
	
}

public class Ecommerce {
	public static void main(String[] args) {
		System.out.println();
		Product pl = new Product();
		ArrayList<String> Home_decoration = new ArrayList<String>(); 
		Home_decoration.add("Flowers");
		Home_decoration.add("Toys");
		Home_decoration.add("Books");
		Home_decoration.add("Cars");
		System.out.println(Home_decoration);
		ArrayList<String> Electronics = new ArrayList<String>();
		Electronics.add("Mobile");
		Electronics.add("Laptop");
		Electronics.add("Charger");
		System.out.println(Electronics);
		System.out.println(Electronics.get(1));
		
	}
}
