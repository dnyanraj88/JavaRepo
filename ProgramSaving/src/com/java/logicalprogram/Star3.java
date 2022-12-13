package com.java.logicalprogram;

public class Star3
{
  public static void main(String[] args)
  {
	int rows=5;
   int star=5;
   {
	   int i=1;
	   while(i<=rows)
	   {
		   int j=1;
		   while(j<=star)
		   {
			   System.out.print("*");
			    j++;
		   }
		   System.out.println();
		   i++;
	   }
  }
}
}
