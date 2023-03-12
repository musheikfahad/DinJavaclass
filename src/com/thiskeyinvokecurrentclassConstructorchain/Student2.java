package com.thiskeyinvokecurrentclassConstructorchain;

public class Student2 {

	int rollno;
	String name,course;
	float fee;
	
	 Student2(int rollno,String name,String course) {
		this.rollno=rollno;
		
		this.name=name;
		this.course=course;
		
	}
	 
  Student2(int rollno , String name , String course ,float fee) {
	
	  this.fee=fee; // compile time error
	//  this(rollno ,name,course);
	 
	}
  
  void display() {
	  System.out.println(rollno+" "+name+ " "+ course +" "+fee);
  }
	public static void main(String[] args) {
		Student2 obj = new Student2(121, "mushk", "eee");
		Student2 obj2 = new Student2(145, "fahath", "ece", 6520);
		
		obj.display();
		obj2.display();
	}

}
