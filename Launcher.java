package com.lti.training.day4.interfaces;


/**
 * InBuilt Launcher  
 * for Launching Mobile apps
 * @author Google Inc
 *
 */
public class Launcher{
	
	private static TaskManager taskManager = new TaskManager();
	public void launch(MobileApplication mobileApp){
		mobileApp.start();
		taskManager.infrom(mobileApp);
		
		//mobileApp.pause();
		//	mobileApp.stop();
		
	}
	
	public void closeAllRunningApps() {
		taskManager.clearAll();
	}
}
