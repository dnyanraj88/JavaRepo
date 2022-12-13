package com.java.veriable;

public class VariableType
{
	
	                 //inside class & outside method
	                 // Global veriables  
	int a=10;        // global veriable=use anywhere in the class
	 static int c=50;
	public void addition()
	{
		int b=20;             // local veriable = use in this (addition)method only
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	  public void multiplication()
	  {
		  System.out.println(a);
		  System.out.println(c);
		//  System.out.println(b);  // b is local variable in addition method
	  }
	                
	   
	
    public static void main(String[] args) 
 {
    	VariableType object=new VariableType();
    	   System.out.println(object.c);                                  // inside method---inside class
		    System.out.println(object.a);                                 // local veriables
 }
}
