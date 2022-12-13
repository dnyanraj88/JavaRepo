package com.java.logicalprogram;

public class Divisibleby5and3Range 
{
	
	public static void divisibleNum(int min,int max)
	{
		for(int i=min;i<=max;i++)
		{
			if(i%5==0 && i%3==0)
			{
				System.out.println(i);
			}
		}
	}
  public static void main(String[] args) {
	   
	  int a=15;
	  int b=100;
	  divisibleNum(a,b);
}
}
