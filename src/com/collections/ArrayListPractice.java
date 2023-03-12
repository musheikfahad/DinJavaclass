package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {

		// collection

		// List

		// Array list

		List<Object> s1 = new ArrayList<Object>();

	// 1) add(); --> to add data into array list
		s1.add("CAT");

		s1.add("dog");

		s1.add(12);
		s1.add(3.76f);

		s1.add('r');

		s1.add(10000);
	//	System.out.println(s1);
		
		List<Object> s2 = new ArrayList<Object>();
		
		s2.add(1);

		s2.add(2);

		s2.add(3);
		s2.add("dog");

		s2.add(5);

		s2.add(10000);
		
	//	System.out.println(s2);
		

	/*	// 2)size(); --> to find the size of arraylist result is in number so int

		int sizeofarraylist = s1.size();
		System.out.println(sizeofarraylist);

		// 3) get();to get a particular data from list using index value

		Object ob = s1.get(3);
		System.out.println(ob);

		// 4) set(); used to replace particular item on list

		s1.set(0, "TIGER");

		System.out.println(s1);

		// 5) remove(); to remove particular data from array list

		s1.remove(5);
		System.out.println(s1);

		// 6) indexOf (); --> to find the particular data's index value

		int indexOfPaticulardata = s1.indexOf(10);

		System.out.println(indexOfPaticulardata);
		int indexOfPaticulardata2 = s1.indexOf('r');

		System.out.println(indexOfPaticulardata2);

		// 7) contains(); --> to find does the array list contain given data or not
		// CONTAINS IS A CASE SENSITIVE

		boolean containsgivedataornot = s1.contains("tiger");

		System.out.println(containsgivedataornot);

		boolean containsgivedataornot2 = s1.contains("TIGER");

		System.out.println(containsgivedataornot2);
		
		
		
		//8) clear(); --> to delete the entire list
		
		
		s1.clear();
		System.out.println(s1);  */
		
		//9)addAll(); its add to list
		
		//s2.addAll(s1);
	//	System.out.println(s2);
		
	//	s1.addAll(s2);
		//System.out.println(s1);
		
		
		//10) retainAll (); // it will return the common values
//		s1.retainAll(s2);
//		System.out.println(s1);
//		
//		s2.retainAll(s1);
//		System.out.println(s2);
//		
		
		// 11) remove All();// remove the common values
		
	//	s1.removeAll(s2);
		//System.out.println(s1);
		s2.removeAll(s1);
		System.out.println(s2);

	}

}
