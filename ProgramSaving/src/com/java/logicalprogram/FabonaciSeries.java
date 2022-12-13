package com.java.logicalprogram;

//0,1,1,2,3,5,8,13,21,34,55
//1. print first 10 numbers in series 
//2.print series upto 100

public class FabonaciSeries 
{
  public static void FirstTenNumbers(int count)
  {
	  int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1;i<=count-2;i++)
		{
			int sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		} 
  }
   
	
		
   public static void main(String[] args) 
 {
	   int count=5;
	   FirstTenNumbers(count);
	    int num=100;
	    
}
}
