package com.java.OopsAccessSpecifier;

public class DiffclassSamePackage 
{
  public static void main(String[] args)
 {
	System.out.println("diff class same package without inheritence");
	  Sameclass.method2();
	  Sameclass.method3();
	  Sameclass.method4();
	//  Sameclass.method1();// private method can not read from otherclass
	  Sameclass object=new Sameclass();
	  object.method6();
	  object.method7();
	  object.method8();
   // object.method5();  ----private--no access
}
  
}
