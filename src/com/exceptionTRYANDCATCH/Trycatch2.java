package com.exceptionTRYANDCATCH;

public class Trycatch2 {
	
	   public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/0; //may throw exception   
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	        
	        int a =12;
	        int b= 56;
	        System.out.println(a+b);
	    }  

}
