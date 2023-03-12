package com.constructor;

public class DEFAULT_CONSTRUCTOR_DEFAULT_VALUES {
	
	
	int id ;
	
	String name;
	public void display() {
System.out.println(id);
System.out.println(name);
	}

	public static void main(String[] args) {

		DEFAULT_CONSTRUCTOR_DEFAULT_VALUES obj1 = new DEFAULT_CONSTRUCTOR_DEFAULT_VALUES();
		obj1.display();
		DEFAULT_CONSTRUCTOR_DEFAULT_VALUES obj2 = new DEFAULT_CONSTRUCTOR_DEFAULT_VALUES();
		obj2.display();
		
	}

}
