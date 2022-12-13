package com.java.conditionalstatement;

public class IfElseif 
{
   public static void main(String[] args) {
	   int obtainedMark=100;
	    if (obtainedMark>105  || obtainedMark<0)
	    { 
	    	System.out.println("Invalid Mark");
	    }
	    else if (obtainedMark>75)
	    {
	    	System.out.println("disctinction");
	    }
	    else if (obtainedMark>=60)
	    {
	    	System.out.println("First class");
	    }
	    else if(obtainedMark>=40)
	    {
	    	System.out.println("pass");
	    }
	    else if(obtainedMark>=50)
	    {
	    	System.out.println("fail");
	    }
   }
}
