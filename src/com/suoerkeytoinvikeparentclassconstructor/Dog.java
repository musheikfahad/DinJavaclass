package com.suoerkeytoinvikeparentclassconstructor;

public class Dog extends Animal {
	
	 Dog() {
	 super();
	 System.out.println("Dog is created");
	 }
	 
	 
	 public static void main(String[] args) {
		Dog ob = new Dog();
	
	}

}
