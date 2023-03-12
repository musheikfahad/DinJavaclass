package com.Variable;

//import com.Inheritance.*;

public class LocalVariables  {
	
	/* 1) its musst be inside A METHOD or variable inside a method is a local variable
	 * 2)ITS LIFE Cycle through out the method , it cant access outside a method
	 * 3)we must initialize the local variable
	 * 4) we cant access thatt local variables outside that particular method 
	 */
	
	public void localVariables() {
		int a =12;               // local variable
		System.out.println("a =" + a);

	}
	/* public void Number() {
		System.out.println(a);
		
		// we cant access the local variables

	}
	*/
	 

	public static void main(String[] args) {
		
		
		LocalVariables obj = new LocalVariables();
		obj.localVariables();
		
		
//		Daughter2_hierarchical objj = new Daughter2_hierarchical();
	//	objj.ring();
		
	}

}
