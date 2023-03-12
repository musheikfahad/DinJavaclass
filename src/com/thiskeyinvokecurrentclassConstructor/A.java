package com.thiskeyinvokecurrentclassConstructor;

public class A {
	
	public A() {
		System.out.println("heelo a");
	}
	
	
	public A(int x){
		this();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		A obj = new A(10);
		
		
	}
	

}
