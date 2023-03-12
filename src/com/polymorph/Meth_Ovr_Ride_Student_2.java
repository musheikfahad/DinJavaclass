package com.polymorph;

public class Meth_Ovr_Ride_Student_2 extends Meth_Ovr_Ride_college {

	
	
	@Override
	public void studentName(String name) {
		// TODO Auto-generated method stub
		super.studentName(name);
	}

	@Override
	public void studentDetails(int age, float height, int rollno) {
		// TODO Auto-generated method stub
		super.studentDetails(age, height, rollno);
	}

	@Override
	public void studentMarks(int xth, int xiith) {
		// TODO Auto-generated method stub
		super.studentMarks(xth, xiith);
	}

	public static void main(String[] args) {
		
		Meth_Ovr_Ride_Student_2 obj_2 = new Meth_Ovr_Ride_Student_2();
		
		obj_2.studentName("safwan ali");
		
		obj_2.studentDetails(8, 4.5f, 4567);
		
		obj_2.studentMarks(498, 598);

	}

}
