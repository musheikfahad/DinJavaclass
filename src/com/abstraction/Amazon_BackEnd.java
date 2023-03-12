package com.abstraction;
 //abstract
public  class Amazon_BackEnd  extends Amazon {
	
	
	

	@Override
	public void username(String username) {
		
		super.username(username);
	}

	@Override
	public void password( ) {
		
		System.out.println("12345678");
	}

	public static void main(String[] args) {
		
		Amazon_BackEnd obj = new Amazon_BackEnd();
		
		obj.username("musheik fahath");
		
		obj.password();
	

	}

}
