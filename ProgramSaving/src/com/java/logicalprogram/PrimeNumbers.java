package com.java.logicalprogram;
//given numbers check for prime 
// prime number in a range (100-200)
// first ten prime numbers 

public class PrimeNumbers 
{
  public void IsPrimeNumber(int num)
  {
	  int flag=0;
	  for(int i=2;i<num;i++)
	  {
		  if(num%i==0)
		  {
			  System.out.println("Given number is not prime");
			  flag++;
			  break;
		  }
	  }
	   if (flag==0)
	   {
		   System.out.println("Given number is prime ");
	   }
	   else
	   {
		   System.out.println("Given number is not prime ");
	   }
  }
    public void PrimeNumbersInRange(int min, int max)
   {
	   for(int k=min;k<=max;k++)
	   {
		   int flag=0;
			  for(int i=2;i<k;i++)
			  {
				  if(k%i==0)
				  {
					  System.out.println("Given number is not prime");
					  flag++;
					  break;
				  }
			  }
			  if(flag==0)
			  {
				 System.out.println(k); 
			  }
	   }
   }
    public void FirstTenPrimeNumbers(int count)
    {
    	  int flag=0;
    	  int num=3;
    	  for(int i=0;i<=count;i++)
    	  {
    		  for(int j=2;j<num;j++)
    		  {
    			  
    		     if(num%j==0)
    		  {
    			  System.out.println("Given number is not prime");
    			  flag++;
    			  break;
    		  }
    		     if (flag==0)
    	    	   {
    	    		   System.out.println("Given number is prime ");
    	    	   }
    		   num++;   
          }
    	  
    	   if (flag==0)
    	   {
    		   System.out.println("Given number is prime ");
    	   }
    	   else
    	   {
    		   System.out.println("Given number is not prime ");
    	   }
    		  
    	  }
    }
    	  
   public static void main(String[] args)
{
	int min=100;
	int max=200;
	int num=23;  // scanner
 int count=10;
	PrimeNumbers object=new PrimeNumbers ();
//	object.IsPrimeNumber(num);
//	object.PrimeNumbersInRange(min,max);
	object.FirstTenPrimeNumbers(count);
	
}

}
