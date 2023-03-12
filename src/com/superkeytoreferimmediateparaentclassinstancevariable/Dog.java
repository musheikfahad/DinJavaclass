package com.superkeytoreferimmediateparaentclassinstancevariable;

		
	public class Dog extends Animal {
		String color = "white";
			
			void printcolor(){
				System.out.println(color);
				System.out.println(super.color);
			}
			
			public static void main(String[] args) {
				Dog d = new Dog();
				d.printcolor();
				
			}	
			

		}


