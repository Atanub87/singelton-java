package io.atanu.demo;

public class DemoApp {

	public static void main(String[] args) {
		MySimpleSingelton simpleSingleton1 = MySimpleSingelton.getInstance();
		System.out.println(simpleSingleton1.hashCode());
		MySimpleSingelton simpleSingleton2 = MySimpleSingelton.getInstance();
		System.out.println(simpleSingleton2.hashCode());
		
		MyThreadSafeSingelton threadsafeSingleton1 = MyThreadSafeSingelton.getInstance();
		System.out.println(threadsafeSingleton1.hashCode());
		MyThreadSafeSingelton threadsafeSingleton2 = MyThreadSafeSingelton.getInstance();
		System.out.println(threadsafeSingleton2.hashCode());
	}
	
}
