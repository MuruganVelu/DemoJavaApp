package com.mrgn.app;

public class DemoClass implements MyInterface {

	@Override
	public void method1() {
		System.out.println("method 1 Implementation");
	}

	@Override
	public void method2() {

		System.out.println("method 2 Implementation");

	}

	public static void main(String[] args) {

		System.out.println("Demo CI Test");

		MyInterface myInterface = new DemoClass();

		myInterface.method1();
		myInterface.method2();

	}

}
