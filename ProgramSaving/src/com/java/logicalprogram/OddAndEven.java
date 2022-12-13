package com.java.logicalprogram;
// 1-100  
public class OddAndEven
{
	public static void evenNum(int a,int b)
	
	{ 
		System.out.println("Even Number");
		for( int i=a;i<=b;i++)
		{
		  if(i%2==0)
		  {
			  System.out.println(i);
		  }
		}

	}
	 public static void OddNum(int a,int b)
	 {
		 System.out.println("Odd Number");
		 for(int i=a;i<=b;i++)
		 {
			 if(i%2!=0)
			 {
				 System.out.println(i);
			 }
		 }
		 
	 }
   public static void main(String[] args)
 {
	int a=1;  //-----scanner class----object creat--call next int()
	int b=100;
	evenNum(a,b);
	OddNum(a,b);
}
}
