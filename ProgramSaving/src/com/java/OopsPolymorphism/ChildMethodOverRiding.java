package com.java.OopsPolymorphism;

public class ChildMethodOverRiding extends ParentMethodOverRiding
{
  public void bunlow()
  {
	  System.out.println("child bunglow=01");
  }
      public void addition(int x,int y)
      {
    	  int c=20;
          int sum=x=y+c;
          System.out.println("child sum="+sum);
      }
       
      public void money()
      {
    	  System.out.println("child money =1000");
      }
}
