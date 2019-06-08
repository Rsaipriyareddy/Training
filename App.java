package com.lti.training.day7.jdbc;

import java.util.List;

public class App {

	public static void main(String[] args) {

	ProductDao dao =  new ProductDao();
	
	/*Product p =  new Product();
	p.setId(5);
	p.setName("Nokia 6600");
	p.setPrice(5000);
	p.setQuantity(99);
	
	dao.add(p);
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println( p.getPrice());
	System.out.println(p.getQuantity());*/
	
	List<Product> product=dao.fetchAll();
	
	for(Product p:product) {
		System.out.println("ID: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Price: "+p.getPrice());
		System.out.println("Quantity: "+p.getQuantity());
	}
	
	
	
	
	
	
	}
}