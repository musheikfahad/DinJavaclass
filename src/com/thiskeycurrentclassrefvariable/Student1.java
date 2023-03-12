package com.thiskeycurrentclassrefvariable;
// this: to refer current class instance variable


// this keyword resolves ambiguity between current class instance variable andparameters

// without thiss keyword
public class Student1 {

	int rollno;
	String name;
	float fee;
	
	Student1(int rollno , String name ,float fee){
		rollno = rollno;
		name = name;
		fee = fee;
	}
	
	void display() {
		System.out.println(rollno+ " " +name + " " + fee);
	}
	
	public static void main(String[] args) {
		Student1 s1 = new Student1(111, "musheik", 50000f);
		Student1 s2 = new Student1(112, "safwan", 65000f);
		
		s1.display();
		s2.display();
		
	}

}
