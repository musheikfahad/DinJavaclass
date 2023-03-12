package com.Oops;

import com.Inheritance.Child_singleInheritance;

public class Simpleovrride_child extends Simple_ovrrideparent {


	@Override
	public void bike() {
		// TODO Auto-generated method stub
		super.bike( );
		System.out.println("honda");
	}

	@Override
	public void car() {
		// TODO Auto-generated method stub
		super.car();
	}

	public static void main(String[] args) {
		
	Simpleovrride_child objj = new Simpleovrride_child();
		
		objj.bike();
		objj.car();
		
		
		
		

	}
	


}
