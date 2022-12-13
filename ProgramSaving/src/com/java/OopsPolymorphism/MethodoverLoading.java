package com.java.OopsPolymorphism;
// compileTime/early/static polymorphism //

public class MethodoverLoading extends Parent
{
 public  void addition()
 {
	 System.out.println("method overloading without parameter");
 }
   public  void addition (int a)
 {
	 System.out.println(a);  
 }
   public  void addition(int a,int b)
 {
  	 System.out.println(a+b);
 }
   public  void addition(int a,String b)
 {
  	System.out.println(a+b); 
 }
   public static void main(String[] args) {
	
	   MethodoverLoading object= new MethodoverLoading();
	   object.addition();
	   object.addition(10);
	   object.addition(30);
	   object.addition(90, "rathod");
	   object.addition(100, 200, 300);
	   
	   
	   
	   
}
}
