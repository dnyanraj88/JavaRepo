package com.java.logicalprogram;
//1
//11
//111     rows=5 num=5
//1111
//11111   

public class Num1 
{
  public static void main(String[] args)
{
	int rows=5;
	int num=5;
	{
		for(int i=1;i<=rows;i++)
		{
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print("1");
		  }
		    System.out.println();
		}
	}
}
}
