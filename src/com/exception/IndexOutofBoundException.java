package com.exception;

import java.util.ArrayList;
import java.util.List;

public class IndexOutofBoundException {

	public static void main(String[] args) {
	//6) Index Out  Of Bound Exception
		
		
		List<Object> s1 = new ArrayList<Object>();
		 s1.add("love");
		 s1.add("12");
		 s1.add('g');
		 s1.add("123asjh@#!");
		 s1.add("cta");
		 
		 System.out.println(s1);
		 
		 Object obiwan = s1.get(3);
		 System.out.println(obiwan);
		 
		 Object obj=  s1.get(23);
		 System.out.println(obj);
		 
		 Object object = s1.get(-1);
		 System.out.println(object);

	}

}
