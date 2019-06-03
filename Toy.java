package com.lti.training.day3.inheritance1;

public class Toy extends Product {
	
	private String ageGroup;
	
	public Toy(String name, int stockInHand, double price, String description,String ageGroup) {
		super(name, stockInHand, price, description);
		this.ageGroup=ageGroup;
	}

	@Override
	public double calculateDiscount() {
	
		if(ageGroup.equals("2-4"))
			return 0.15*getPrice();
		else if(ageGroup.equals("4-5"))
			return 0.05*getPrice();
		else
			return 0;
	}

}
