package com.thiskeyinvokecurrentclassConstructorchain;

public class Student1 {

	int rollno;
	String name,course;
	float fee;
	
	 Student1(int rollno,String name,String course) {
		this.rollno=rollno;
		
		this.name=name;
		this.course=course;
		
	}
	 
  Student1(int rollno , String name , String course ,float fee) {
	
	  this(rollno ,name,course);
	  this.fee=fee;
	}
  
  void display() {
	  System.out.println(rollno+" "+name+ " "+ course +" "+fee);
  }
	public static void main(String[] args) {
		Student1 obj = new Student1(121, "mushk", "eee");
		Student1 obj2 = new Student1(145, "fahath", "ece", 6520);
		
		obj.display();
		obj2.display();
	}

}
