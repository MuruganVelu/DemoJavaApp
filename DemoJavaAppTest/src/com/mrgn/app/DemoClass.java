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
	
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method 3 Implementation");

		
	}
	@Override
	public void method4() {
		System.out.println("method 4 Implementation");
		
	}

	public static void main(String[] args) {

		System.out.println("Demo CI Test");

		MyInterface myInterface = new DemoClass();

		myInterface.method1();
		myInterface.method2();
		myInterface.method3();
		myInterface.method4();



	}

	

}
