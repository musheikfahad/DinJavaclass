package com.Oops;

public class Type_Cast_oops_Child extends Type_Cast_opps_Parent {
	
	private void childMethod() {
		System.out.println("Children Method");

	}

	public static void main(String[] args) {
		
		Type_Cast_oops_Child obj2 = new Type_Cast_oops_Child();// child class obj
		//child class ref
//	 normal calling	
	/*	obj2.childMethod();
		
		obj2.parentMethod();
		*/
		
		
		// upcasting
		
	Type_Cast_opps_Parent obj1 = new Type_Cast_oops_Child(); // child class obj
		// parent class ref
		obj1.parentMethod();
		
		// downcating ===>> not possible in java
//	0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
		
		
		
		
		
		

	}

}
