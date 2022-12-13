package com.java.logicalLooops;

  //print number from 100 to 100 which are divisible by 3 &7

public class Whileloop3 {

	  public static void main(String[] args) {
		   int count=0;
		  int i=100;
		  while(i<=1000)
			  
		  {
			 if(i%100==0 &&i%200==0)
			 {
				System.out.println(i);
				count++;
			 }
			   i++;
		  }
		  
//		     System.out.println("count of number divisible 3 &7="+count);
		
	}
}
