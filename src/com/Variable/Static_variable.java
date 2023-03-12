package com.Variable;
/*
 * must be ouside the method and inside the class
 * its loifecycle through the class
 * if we not initialize the value then default value of particular datatype is assinged
 * we can use static keyword for class variable but we cant use it for loocal variable
 * 
 * features of static :
 * once we dcalare the class vriables as a static variables and method as a static method, then without using object we can call the static variables and method
 * 
 */




public class Static_variable {
	
	
	int y =12;
	
	static int j =8798;
	
	static float z =12.97f;
	
	
	public void pulser() {
		System.out.println("integer y=" +y);
		System.out.println(" int j = "+j);
		
		System.out.println(" float z= "+z);
	// we cant give static to local var static 	int b=12;

	}
	
	public static void honda() {
		System.out.println("static method");
		System.out.println("see vdo musheik if you have doubt");
		// we can use static keywor for method
		// but we cant use static key word for class

	}
	
	public static void main(String[] args) {
		
	//we can call the method without creating a object
		
	    honda();
	    System.out.println("int j ="+ j);
	    
	    System.out.println("float z ="+z);
	    
	    
		Static_variable obj = new Static_variable();
	    System.out.println("y is = "+obj.y);
	    obj.pulser();
		
	    
	    // but to call the pulser method we have to create the object
	    
	}

}
