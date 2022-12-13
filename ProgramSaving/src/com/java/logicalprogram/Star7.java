package com.java.logicalprogram;
//    *
//   **
//  ***    rows=5 star=5 space=4
// ****
//*****

// ****
//  ***   rows=4 star=4 space=4
//   **
//    *
public class Star7
{ 
	public static void main(String[] args) {
		int space=4,rows=5,star=5;
	 for(int i=1;i<=rows;i++)   //rows
	 {
		 for(int j=1;j>=space;j--)  //space
		 {
			 System.out.print(" ");
		 }
		   for(int k=1;k<=i;k++)   //star
		   {
			   System.out.print("*");
		  }
		   System.out.println();
	 }
	  //second part
		 int space2=4,rows2=4,star2=4;
		 for(int i=1;i<=rows2;i++)
   { 
			for( int j=1;j<=i;j++) 
	{
				System.out.print(" ");
	
	}
   
		 for(int k=star2;k>=i;k--)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
   }
	}
}
			 
		 
   
		 					
	
				
						
					
	
				
				
		 
		 
		
		 
	 
	

	  
  
