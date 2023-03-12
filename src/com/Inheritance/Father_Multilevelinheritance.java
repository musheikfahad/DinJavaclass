package com.Inheritance;

// multi level inhertance

public class Father_Multilevelinheritance  extends Grand_father_Multilevelinheritance{
	
	
	public void chest() {
		System.out.println("golden chest");

	}

	public static void main(String[] args) {
		
		Father_Multilevelinheritance obj1 = new Father_Multilevelinheritance();
		
		obj1.bus();
		obj1.land();
		obj1.chest();

	}

}
