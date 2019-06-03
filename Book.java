package com.lti.training.day3.inheritance1;

public class Book extends Product {
	
public	Book(String name, int stockInHand, double price, String description) {
		super(name, stockInHand, price, description);
	}

@Override
public double calculateDiscount() {
	
	return 0.1*getPrice();
}
}
