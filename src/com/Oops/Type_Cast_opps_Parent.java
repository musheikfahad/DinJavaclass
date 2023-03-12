 package com.Oops;

public class Type_Cast_opps_Parent {
	
public void parentMethod() {
	System.out.println("www.ilham.co.in");

}

	public static void main(String[] args) {
	 Type_Cast_opps_Parent obj1 = new Type_Cast_opps_Parent();   // parent class obj
	//parent class ref	 
		 obj1.parentMethod();
		
		 long a = 10;
		 int b;
		  b = (int) a;
		  
		  

	}

}
