package com.polymorph;

public class Meth_Ovr_Ride_Student_1 extends Meth_Ovr_Ride_college {
	
	@Override
	public void studentName(String name) {
		
		super.studentName(name);
	}

	@Override
	public void studentDetails(int age, float height, int rollno) {
		
		super.studentDetails(age, height, rollno);
	}

	@Override
	public void studentMarks(int xth, int xiith) {
		
		super.studentMarks(xth, xiith);
	}

	public static void main(String[] args) {
		
		
		Meth_Ovr_Ride_Student_1 obj_1 = new Meth_Ovr_Ride_Student_1();
		
		obj_1.studentName("musheik");
		
		obj_1.studentDetails(24, 5.6f, 1234);
		
		obj_1.studentMarks(424, 954);
		
		
		

	}

}
