package com.thiskeycurrentclassMethod;


//to invoke the method of current class
//if we forget to add this key then compiler autmatically add
public class MandN {

	 void m() {
		 System.out.println("hello M");
	}
	 void n() {
		 System.out.println("hello n");
		 
		 this.m();
	 }
	
	public static void main(String[] args) {
		
		MandN obj =new MandN();
		obj.n();

	}

}
