package com.lti.training.day3.inheritance;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Testing our Logger
		
		Logger l=new Logger();
		l.log("Some Message", LogLevel.INFO);
		l.log("Again Some Message", LogLevel.WARN);
		l.log("Some Critical Message", LogLevel.ERROR);
		
		l.log("App Started Successfully");
	}

}
