package com.java.OopsAccessSpecifier;

public class Sameclass     // parent class//
{
  private static void method1()
  {
	  System.out.println("Method1:private");
  }
   static void method2()
  {
	  System.out.println("method2:default");
  }
  protected static void method3()
  {
	  System.out.println("Method3:protected");
  }
  public static void method4()
  {
	  System.out.println("Method4:public");
  }
  private  void method5()
  {
	  System.out.println("Method5:non static private");
  }
    void method6()
  {
	  System.out.println("method6:non static default");
  }
  protected  void method7()
  {
	  System.out.println("Method7:non static protected");
  }
  public  void method8()
  {
	  System.out.println("Method8:non static public");
  }
     public static void main(String[] args) {
		
    	 System.out.println("Method calling in same class");
    	 method1();
    	 method2();
    	 method3();
    	 method4();
    	 Sameclass object=new Sameclass();
    	 object.method5();
    	 object.method6();
    	 object.method7();
    	 object.method8();
    	 
	}
}
