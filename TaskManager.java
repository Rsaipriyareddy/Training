package com.lti.training.day4.interfaces;

/**
 * an InBuilt TaskManager
 * @author Google Inc
 *
 */
public class TaskManager {
	
	private  MobileApplication [] runningApps;
	private int count;
	
	public TaskManager() {
		runningApps=new MobileApplication[9999];
	}
	
	public void infrom(MobileApplication mobileApp) {
		runningApps[count++]=mobileApp;
	}
	
	public int runningApps() {
		return count;
	}
	
	public void clearAll() {
	for(int i=0;i<count;i++)
//	for(MobileApplication app : runningApps)
			runningApps[i].stop();
	}
	
	
	
}
