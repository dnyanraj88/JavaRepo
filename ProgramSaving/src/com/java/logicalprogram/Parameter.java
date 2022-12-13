package com.java.logicalprogram;

public class Parameter
{
   public static void addition(int a,int b)
 {
	   
	int sum=a+b;
	System.out.println(sum);
 }
   public static void multiplication(int x,int y)
 {
	 int multi=x*y; 
	 System.out.println(multi);
 }
   public static void main(String[] args)
 {
	 multiplication(15, 3) ;
	addition(25, 10 );
	multiplication(25, 30);
	
}
}

