package com.keywords;

public class Final_methodlevel_child extends Final_methodlevel_parent {
	

	

	@Override
	public void hayyan() {
		// TODO Auto-generated method stub
		super.hayyan();
		
		System.out.println("can override hayyan");
	}

	// here bcoz of final key word in the method of poarent class we cant use over
	// ride in child class
	public static void main(String[] args) {

		Final_methodlevel_child obiwan = new Final_methodlevel_child();

		obiwan.hayyan();
		obiwan.musheikfahath();
		

	}

}
