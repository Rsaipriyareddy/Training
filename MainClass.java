package com.lti.training.day4.interfaces;

public class MainClass {
	public static void main(String[] args) {
		
		Launcher launcher = new Launcher();
		
		MyMobileApplication1 app1 = new MyMobileApplication1();
		launcher.launch(app1);
		
		MyMobileApplication2 app2 = new MyMobileApplication2();
		launcher.launch(app2);
		
		
		//try displaying the count of running apps
		
		//Launcher.taskManager.runningApps();	//Error
		
		//to close all running Apps
		launcher.closeAllRunningApps();
		app1.version();
		app2.version();
		
	}
}
