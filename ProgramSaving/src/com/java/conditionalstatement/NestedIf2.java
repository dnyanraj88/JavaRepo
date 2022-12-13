package com.java.conditionalstatement;

public class NestedIf2 
{
public static void main(String[] args) 
{
	 String enteredUsername="dnyanesh";
	 String enteredPassword="dnyanesh@123";
	  if(enteredUsername=="dnyanesh")
	  {
		 System.out.println("Username correct"); 
		 
	  }
	  else
     	 {
			 System.out.println("Invalid username");
		 }
		
		 
		 
		 if(enteredPassword=="dnyanesh@123")
		 {
			System.out.println("Password correct");
			System.out.println("entered login");
		 }
		 else
		 {
			 System.out.println("Invalid Password");
	  }
			 
}
}
