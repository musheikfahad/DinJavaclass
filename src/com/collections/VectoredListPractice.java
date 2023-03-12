package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectoredListPractice {

	public static void main(String[] args) {
		List<Integer> s1 = new Vector<Integer>();
		// collection

		// List

		// linked list

		// 1) add(); --> to add data into array list
		s1.add(12);

		s1.add(11);

		s1.add(12);
		s1.add(45);

		s1.add(23);

		s1.add(100);
		System.out.println(s1);

		List<Object> s2 = new ArrayList<Object>();

		s2.add(768546);

		s2.add(2);

		s2.add(3);
		s2.add("doggy");

		s2.add("kitty");
		s2.add(12);
		s2.add(23);

		System.out.println(s2);

	/*	// 2)size(); --> to find the size of linkedlist result is in number so int
		int sizeoflinkedlist = s1.size();
		System.out.println(sizeoflinkedlist);

		int sizeoflinkedlist2 = s2.size();
		System.out.println(sizeoflinkedlist2);

		// 3) get();to get a particular data from list using index value

		Integer ind = s1.get(4);
		System.out.println(ind);

		Object obje = s2.get(0);
		System.out.println(obje);

		// 4) set(); used to replace particular item on list

		s1.set(0, 9087);

		System.out.println(s1);

		s2.set(4, "cub");
		System.out.println(s2);

		// 5) remove(); to remove particular data from array list

		s1.remove(0);
		System.out.println(s1);
		s2.remove(3);
		System.out.println(s2);

		// 6) indexOf (); --> to find the particular data's index value

		int indexOf100 = s1.indexOf(100);
		System.out.println(indexOf100);

		int indexOfcub = s2.indexOf("cub");
		System.out.println(indexOfcub);

// 7) contains(); --> to find does the array list contain given data or not
// CONTAINS IS A CASE SENSITIVE

		boolean containsgivedataornot = s1.contains(100);

		System.out.println(containsgivedataornot);

		boolean containsgivedataornot2 = s2.contains("cub");

		System.out.println(containsgivedataornot2);
		boolean containsgivedataornot3 = s2.contains("Cub");

		System.out.println(containsgivedataornot3);

//8) clear(); --> to delete the entire list

	//	s1.clear();
	//	System.out.println(s1); */
		
		
		//9)addAll(); its add to list
		
		//		s2.addAll(s1);
			//System.out.println(s2);
				// below shows error bcoz we can't add object wrapperclass into integer wrapperclass
				//s1.addAll(s2);
			//System.out.println(s1);
		
		
			//10) retainAll (); // it will return the common values
//			s1.retainAll(s2);
//		System.out.println(s1);
//			
//		s2.retainAll(s1);
//			System.out.println(s2);
//			

			// 11) remove All();// remove the common values
			
		//	s1.removeAll(s2);
			//System.out.println(s1);
//			s2.removeAll(s1);
//			System.out.println(s2);
//			

	}

}
