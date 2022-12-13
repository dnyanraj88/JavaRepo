package com.java.logicalLooops;
 
  // Number from 100 to 200
  // also divisible by 3 
   import java. util. Iterator;
public class Forloop1 {
	 public static void main(String[] args) {
		int count=0;
		for(int i=100;i<=200;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
				count++;
			}
		}
		
		System.out.println("count of number divisible by 3="+count);
	}
}
 

  
