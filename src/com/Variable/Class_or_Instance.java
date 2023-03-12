package com.Variable;
/*
 * outside the method but inside the class 
 * life cycle through the class
 * no need to initialize the variable only declaration part is enough
 * if we not not initialize the variable it only print the default value of the corresponding data type\
 * if we give same reference name to the class and local variable then priority goes to local variable
 */

public class Class_or_Instance {
	
	int c =78;
	int i ;
	int d = 12;
	float f ;
	float h= 34.65f;
	double v ;
	long l;
	boolean b ;
	char k;
	String s;
	String name = "Musheik fahath M";
	
	public void number() {
		
		int c =98;
		System.out.println("int c =" +c);

	}
	public void varrr() {
		
		 
		System.out.println("integer =" +d);
		System.out.println("float=" + f);
		System.out.println("float_h = "+h);
		
		

		System.out.println("double v = "+v);

		System.out.println("long l = "+l);
		System.out.println(" boolean b= "+b);

		
		System.out.println("Char = "+k);
		
		System.out.println(" string s= "+s);
		System.out.println(" int i= "+i);


	}
	
	public static void main(String[] args) {
		Class_or_Instance obj = new Class_or_Instance();
		obj.number();
		obj.varrr();
		System.out.println(obj.name);  
		System.out.println(obj.v);  
		
	}

}
