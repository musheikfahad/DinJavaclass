package com.collectionsMAP;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		// MAP
		// HASHMAP

		Map<Integer, String> s1 = new java.util.HashMap<Integer, String>();

		// 1) Put();

		s1.put(100, "/Musheik");
		s1.put(101, "venki");
		s1.put(102, "fredy");

		s1.put(103, "sumn");

		System.out.println(s1);

		// 2) size ();

		int sizeofmap = s1.size();

		System.out.println(sizeofmap);

		// 3) get ()

		String gerrrt = s1.get(101);
		System.out.println(gerrrt);
// 4) CONVRERT MAP INTO SET
		// entryset();
		
		Set<Entry<Integer, String>> ENTRYSET = s1.entrySet();
		System.out.println(ENTRYSET);
		System.out.println(s1);
		
		//5) keyset();
		// extract keys from paticular maps
		Set<Integer> keySetofs1map = s1.keySet();
		System.out.println(keySetofs1map);
		
		//6) values ();
		// extract the values from particular maps
		
		Collection<String> valuesofparticularmap = s1.values();
		System.out.println(valuesofparticularmap);
		
		
		// 8)containsvalue();
		// zeo sensitive
		// to find wheather tht map conbtains particular key
		
		boolean DoescontainsKeyatmap = s1.containsKey(100);
		System.out.println(DoescontainsKeyatmap);
		
		// 8)containsvalue();
		// case sensitive
		// to find wheather tht map conbtains particular value
		
		boolean DoescontainsValueatmap = s1.containsValue("Fredy");
		System.out.println(DoescontainsValueatmap);
		
		
		
		
	}

}
