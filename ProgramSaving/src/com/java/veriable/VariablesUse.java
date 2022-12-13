package com.java.veriable;

public class VariablesUse
{
    int a=10;       //=global-instance
    int b=20;       // globale instance
 static int c=30;           // global static 
 static int d=40;           // global static
  public void addition()
 {
	 int e=50;               // local instance
	 int sum=a+b+c+d+e;
	 System.out.println(sum);
 }
   public static void multiplication()
   {
	   VariablesUse object=new VariablesUse();
	    int f=60;
	    int multiplication= object.a* object.b*c*d*f;
	    System.out.println(multiplication);
   }
    public static void main(String[] args)
    {
    	VariablesUse object=new VariablesUse();
    	object.addition();
    	object.multiplication();
    	
	}
}	   
   