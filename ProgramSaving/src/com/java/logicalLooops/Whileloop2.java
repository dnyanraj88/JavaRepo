package com.java.logicalLooops;
 
   // print even number from 100 to1000

public class Whileloop2 {
  
    public static void main(String[] args) {
     int a=0;
      int i=100;
      while(i<=200)
      {
    	  if(i%3==0 && i%7==0)
    	  {
    		  System.out.println(i);
    		  a++;
    	  }
    	    i++;
      }
      System.out.print("print the number divisible by 3&7="+a);
    }
}
 	   
    	
 	