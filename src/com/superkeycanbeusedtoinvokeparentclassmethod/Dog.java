package com.superkeycanbeusedtoinvokeparentclassmethod;

public class Dog  extends Animal{
void eat () {

	System.out.println("eating bread");
	
	
}
void bark() {
	System.out.println("bow wow");
	
}


void work() {
	
	super.eat();
	
	bark();
	eat();
	
}
	public static void main(String[] args) {
	
		
		Dog ob = new Dog();
		
		ob.work();

	}

}
