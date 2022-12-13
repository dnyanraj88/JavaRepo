package com.java.OopsAccessSpecifierDiffPackage;

import com.java.OopsAccessSpecifier.Sameclass;

public class ChildclassDiffPackage extends Sameclass

{
 public static void main(String[] args) 
 {
	Sameclass.method3();
	Sameclass.method4();
	ChildclassDiffPackage child=new ChildclassDiffPackage();
	child.method7();
	child.method8();
	
	Sameclass parent=new Sameclass();
	parent.method8();
	
	
}
}
