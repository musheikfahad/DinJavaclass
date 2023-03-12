package com.collectionsSET;

// follow ascending order
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// 1) add(); helps to enter data into list
				Set<Float> s1 = new TreeSet <Float>();
				
				s1.add(0.3f);
				s1.add(0.2f);
				s1.add(0.088f);
				s1.add(0.76f);
				
				System.out.println(s1);
				Set<Integer> s2 = new TreeSet<Integer>();
				
				s2.add(656);
				s2.add(9577); // not even allow single null value
				s2.add(88);
				s2.add(76);
				s2.add(45435);
				System.out.println(s2);
				
				Set<Integer> s3 = new TreeSet<Integer>();
				
				s3.add(234);
				s3.add(878);
				s3.add(88878);
				s3.add(9);
				s3.add(873);
				System.out.println(s3);
				/*
				
				// 2)size(); --> to find the size of arraylist result is in number so int

						int sizeofarraylist = s1.size();
						System.out.println(sizeofarraylist);
						int sizeoflinkedlist2 = s2.size();
						System.out.println(sizeoflinkedlist2);
						
				// 3)		CONTAINS IS A CASE SENSITIVE

						boolean containsgivedataornot = s1.contains(0.2f);

						System.out.println(containsgivedataornot);

						boolean containsgivedataornot2 = s2.contains(88);

						System.out.println(containsgivedataornot2);
						boolean containsgivedataornot3 = s2.contains(0.5f);

						System.out.println(containsgivedataornot3);
						

		/*		4)addAll(); its add to list
						
							s2.addAll(s3);
							System.out.println(s2);
								//if shows error bcoz we can't add integer wrapperclass into float wrapperclass
							s3.addAll(s2);
							System.out.println(s3);
							
							//5) clear(); --> to delete the entire list

								s1.clear();
								System.out.println(s1);
								*/
								
								

					/*			//6) retainAll (); // it will return the common values
						//		s1.retainAll(s2);
							//System.out.println(s3);
							
						//	s2.retainAll(s1);
							//	System.out.println(s2);
								

								// 11) remove All();// remove the common values
								
							//	s1.removeAll(s2);
								//System.out.println(s1);
							//	s2.removeAll(s1);
							//	System.out.println(s2);
*/
	}

}
