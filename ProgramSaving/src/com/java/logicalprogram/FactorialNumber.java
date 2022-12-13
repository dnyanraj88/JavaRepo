package com.java.logicalprogram;

import java.util.Scanner;

//6!=6*5*4*3*2*1=720

public class FactorialNumber {
    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
    	System.out.println("Enter a number");
    	 int num =scan.nextInt();
		 
		 int fact=1;
		 {
			 for( int i=num;i>=1;i--)
			 {
				 fact=fact*i;
			 }
			 System.out.println(fact);  //6*5,30*4,120*3,360*2,720*1
		 }
	}
}
