package com.constructor;

public class Parameterized_constructor {

	int id ;
	String name ;
	
	public Parameterized_constructor(int i  , String n){
		id =i;
		name = n;
		
		System.out.println(name +" " + id);
	
	}
	
	public Parameterized_constructor(int x , String m , float p ) { // overloading
		
		System.out.println("over loading");
	}
	
	public void display() {
		System.out.println(id +"  "+ name);
	}
	public static void main(String[] args) {
		
		Parameterized_constructor s1 = new Parameterized_constructor(123,"mushk");
		
		Parameterized_constructor s2 = new Parameterized_constructor(145, "fahath");
		
		
//		s1.display();
//		s2.display();
		
		
		Parameterized_constructor s3 = new Parameterized_constructor(12, "df", 0.5f);
		
		
	}
	
	
}
