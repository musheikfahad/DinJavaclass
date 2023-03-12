package com.keywords;

public class ThisChild extends SuperParent {
	int a = 10;

	public void num2() {
		System.out.println(a);
		
		
		System.out.println(this.a);
		System.out.println("Child Method");
		System.out.println(super.a);
	}
// super is a parent class ref and this ==> child  or current class rref

	@Override
	public void num1() {

		super.num1(); // aka invokig or calling
		this.num2();  // aka invoking or call
	}

	public static void main(String[] args) {
		ThisChild obj = new ThisChild();

		obj.num2();
System.out.println("=============================================");
		obj.num1();

	}

}
