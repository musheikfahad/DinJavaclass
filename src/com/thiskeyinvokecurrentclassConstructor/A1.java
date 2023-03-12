     package com.thiskeyinvokecurrentclassConstructor;
     
     //calling parametrzed costructor from default constructor
     
   public class A1 {
     	
   public A1() {
     		
	   
	   		this(5);
     		System.out.println("hello a1");
  
   
   }
     	
     	public A1(int x){
     		
     		
     		System.out.println(x);
     	
     	
     	}
     
     	public static void main(String[] args) {
			
     		A1 obj = new A1();
		}
     }
     