package com.thiskeycurrentclassrefvariable;
//this: to refer current class instance variable


//this keyword resolves ambiguity between current class instance variable andparameters

//where this key word not req
public class Student3 {
	
	
	int rollno;
	String name;
	float fee;
	
	Student3(int r , String n ,float f){
		rollno = r;
		name = n;
		fee = f;
	}
	
	void display() {
		System.out.println(rollno+ " " +name + " " + fee);
	}
	
	public static void main(String[] args) {
		Student3 s1 = new Student3(111, "musheik", 50000f);
		Student3 s2 = new Student3(112, "safwan", 65000f);
		
		s1.display();
		s2.display();
		
	}

}
