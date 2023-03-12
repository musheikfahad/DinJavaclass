package com.constructor;

public class Student {
 public Student( String name ) {
	 System.out.println(name);
	 
 }
	
 public Student() {// non para const
	 System.out.println(" default cponstructor");
	 
 }

 public Student ( float cgpa) { // para const
	 System.out.println(cgpa);
 }
 
 public static void main(String[] args) {
	Student obj1 = new Student("arun");
	 
	Student obj2 = new Student();///
	
	Student obj3 = new Student(5.5f);
	
}


}
