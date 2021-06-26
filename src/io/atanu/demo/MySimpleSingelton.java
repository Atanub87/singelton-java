package io.atanu.demo;

public class MySimpleSingelton {
	
	private static MySimpleSingelton instance;
	
	private MySimpleSingelton() {}
	
	public static MySimpleSingelton getInstance() {
		if (instance == null) {
			instance = new MySimpleSingelton();
		}
		return instance;
	}

}
