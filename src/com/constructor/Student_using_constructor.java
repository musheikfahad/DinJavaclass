package com.constructor;
// constructor and class name always same so its follow the pascal
public class Student_using_constructor {
	
	public Student_using_constructor () { // non parametrized constructor or default constructor
		System.out.println("default constructor");
	}
	
	public Student_using_constructor (String name){    //parametrized construtor
		// constructor supports method over loading
		System.out.println(name);
	}
	
	public Student_using_constructor( float height) {  // parametrized constructor
		System.out.println(height);
	}

	public static void main(String[] args) {
		// we dont dont first create pbject and then call the method 
		// here we directly call the constructor
		
		Student_using_constructor obj1 = new Student_using_constructor("Hayyan");
		
		Student_using_constructor obj2 = new Student_using_constructor("5.11");
		 Student_using_constructor obj3 = new Student_using_constructor();
		 

	}

}
