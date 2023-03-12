package com.polymorph;

public class Task_Area_ovrLoad {
	public void area(String name , int radius , String unit) {
		
		
	System.out.println(name + "  "+(Math.PI) * Math.pow(radius, 2)+" "+ unit);
		 
		 
		

	}

	public void area ( String name , int length , int breadth, String unit) {
		System.out.println(name + "  "+(length * breadth) +" "+ unit);

	}

public void area (String name , int longbase , int shortbase, int altitude , String unit) { 
System.out.println(name + "  " + (((longbase + shortbase)/2) * altitude) +" "+ unit);
	}
	
	public static void main(String[] args) {
		Task_Area_ovrLoad obj = new Task_Area_ovrLoad();
		
		obj.area("Area of circle = ", 7, "cm^2");
		
		obj.area("Area of Reactangle = ", 10, 7, "cm^2");
		
		obj.area("Area of Trapezoid = ", 13, 07, 5, "cm^2");
		
		
		
		
		
	}
}
