package com.java.OopsAccessSpecifier;

public class ChildclassSamePackage extends Sameclass
{
  public static void main(String[] args) 
 {
	Sameclass.method2();
	Sameclass.method3();
	Sameclass.method4();
	ChildclassSamePackage child=new ChildclassSamePackage();
	 child.method6();
	 child.method7();
	 child.method8();
	 
	Sameclass parent=new Sameclass();
	parent.method6();
	parent.method7();
	parent.method8();
	
	
}
}

