package io.atanu.demo;

public class MyThreadSafeSingelton {
	
	private static MyThreadSafeSingelton instance;
	
	private MyThreadSafeSingelton(){};
	
	public static synchronized MyThreadSafeSingelton getInstance() {
		if (instance == null) {
			instance = new MyThreadSafeSingelton();
		}
		return instance;
	}
}
