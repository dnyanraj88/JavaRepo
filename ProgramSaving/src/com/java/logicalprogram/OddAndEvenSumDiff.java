package com.java.logicalprogram;

public class OddAndEvenSumDiff 
{
	public static int EvenNum(int a, int b)
	{
		int evensum=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2!=0)
			{
				evensum=evensum+i;
			}
		}
		return evensum;
	}
	  public static int OddNum(int a,int b)
	  {
		 int oddsum=0;
		 for( int i=a;i<=b;i++)
		 {
			 if(i%2==0)
			 {
				 oddsum=oddsum+i;
			 }
		 }
		  return oddsum;
	  }
  public static void main(String[] args)
{
	int a=3;
	int b=9;
	int result=OddNum(a,b)-EvenNum(a,b);
	System.out.println(result);
}
}
