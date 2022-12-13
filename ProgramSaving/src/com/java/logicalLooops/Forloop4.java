package com.java.logicalLooops;

   // print number from 1oo to 200 which are divisible by 3
    // also count of number 
public class Forloop4
{
  public static void main(String[] args)
  
{
	 int count=0;
    for(int i=100;i<=200;i++)
    {
    	if(i%3==0 && i%7==0)
    	{
    		System.out.println(i);
    		count++;
    	}
    }
        System.out.println("count of number divisible by 3="+count);
}
  
}

	
