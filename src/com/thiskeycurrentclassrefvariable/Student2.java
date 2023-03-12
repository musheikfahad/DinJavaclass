package com.thiskeycurrentclassrefvariable;
//this: to refer current class instance variable


//this keyword resolves ambiguity between current class instance variable andparameters

public class Student2 {
	
	int rollno;
	String name;
	float fee;
	
	Student2(int rollno , String name ,float fee){
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	
	void display() {
		System.out.println(rollno+ " " +name + " " + fee);
	}
	
	public static void main(String[] args) {
		Student2 s1 = new Student2(111, "musheik", 50000f);
		Student2 s2 = new Student2(112, "safwan", 65000f);
		
		s1.display();
		s2.display();
		
	}

}
