package com.lti.training.day4.interfaces;

/**
 * My Dummy Mobile App
 * @author Rafiq and Sai Priya
 *
 */
public class MyMobileApplication2 implements MobileApplication{

	public void start() {
		System.out.println("My Super Fantastic MobileApplication2 started...");
	}
	public void pause() {
		System.out.println("My Super Fantastic MobileApplication2 Paused...");
	}
	
	public void stop() {
		System.out.println("My Super Fantastic MobileApplication2 stopped...");
	}
}
