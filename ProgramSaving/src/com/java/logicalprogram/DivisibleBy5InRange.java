package com.java.logicalprogram;

import java.util.Scanner;

public class DivisibleBy5InRange 
{
	public static void divisibleNum(int min,int max) {
	 for(int i=min;i<=max;i++)
	 {
		      if(i%5==0)
		 {
		    	   
		       System.out.println(i);
		 }
	 }
}
	
   public static void main(String[] args) {
	//	int min=100;
   //  	int max=300;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		 int min=scan.nextInt();
		int max=scan.nextInt();
		divisibleNum(min, max);
}
}
