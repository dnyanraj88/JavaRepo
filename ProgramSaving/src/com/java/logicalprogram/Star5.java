package com.java.logicalprogram;
//*****
//****
//***
//**
//*
//  rows=5   star=5

public class Star5
{
   public static void main(String[] args) 
 {
	   int rows=5;
	   int star=5;
	   
	for(int i=1;i<=rows;i++)
	{
	   for( int j=star; j>=i;j--)
	   {
		  System.out.print("*"); 
	   }
	     System.out.println();
	}
}
}
