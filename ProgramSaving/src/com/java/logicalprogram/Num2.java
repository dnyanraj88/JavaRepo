package com.java.logicalprogram;
//1
//12
//123    rows=5 num=5
//1234
//12345

public class Num2 
{
 public static void main(String[] args)
{
	int rows=5;
	int num=5;
	{
		for( int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			  System.out.println();
		}
		
	}
}
}
