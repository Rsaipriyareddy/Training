package com.lti.training.day4.interfaces;


/**
 * Contract for a Mobile Application
 * @author Google Inc
 *
 */
public interface MobileApplication {
	
	public void start();
	public void pause();
	public void stop();
	
	String INFO = "Developing by Google Inc";
	public default void version() {
		
		System.out.println(INFO+"Version is 1.0");
	}
	
}
