package com.lti.training.day4.interfaces;

public interface Sample1 {

	String INFO = "Developing by Google Inc";
	public default void version() {
		
		System.out.println(INFO+"Version is 1.0");
	}
}
