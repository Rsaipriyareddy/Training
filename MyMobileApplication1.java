package com.lti.training.day4.interfaces;

/**
 * My Dummy Mobile App
 * @author Rafiq and Sai Priya
 *
 */
public class MyMobileApplication1 implements MobileApplication{

	public void start() {
		System.out.println("My Fantastic MobileApplication1 started...");
	}
	public void pause() {
		System.out.println("My Fantastic MobileApplication1 Paused...");
	}
	
	public void stop() {
		System.out.println("My Fantastic MobileApplication1 stopped...");
	}
}
