package com.java.OopsPolymorphism;

public class TestMethodOverRiding 
{
  public static void main(String[] args)
 {
	  ChildMethodOverRiding c= new ChildMethodOverRiding();
	  c.bunglow();
	  c.farm();
	  c.addition(10, 20);
	  c.money();
	  ParentMethodOverRiding p=new ParentMethodOverRiding();
	  p.addition(50,40);
	  p.bunglow();
	  p.farm();
}
}
