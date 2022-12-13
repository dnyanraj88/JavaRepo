package com.java.logicalprogram;

public class SumofNuminRange 
{
	public static int addition(int min,int max)
	{
		int sum=0;
		for(int i=min;i<=max;i++)
		{
			sum=sum+i;  //o+1,1+2,3+3,6+4,10+5,15  (value added sum & i)up to max(5)
		}
		  return sum;
		}
  public static void main(String[] args)
 {
	int a=1;
	int b=5;
    int result=addition(a,b);
    System.out.println(result);
	
}
}
