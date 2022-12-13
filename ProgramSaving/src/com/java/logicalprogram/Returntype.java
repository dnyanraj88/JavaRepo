package com.java.logicalprogram;

public class Returntype {
	public static int addition(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
	public static void subtraction(int x,int y)
	{
	   int sub=x-y;
	   System.out.println(sub);
	}
	 public static void multiplication(int i,int j)
	 {
		 int multi=i*j;
		 System.out.println(multi);
	 }
   public static void main(String[] args) {
	     int c = addition(10, 20);
	             System.out.println("value of c="+c);
                  subtraction(10, 20);
	              multiplication(10, 20);
}
}
