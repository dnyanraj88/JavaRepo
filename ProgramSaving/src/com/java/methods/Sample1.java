package com.java.methods;

import com.java.method2.Sample3;

public class Sample1 
{
    public static void addition()
    {
    	int a=10;
    	int b=20;
    	int sum=a+b;
    	System.out.println(sum);
    }
       public static void main(String[] args)
    {
		 addition();              //same class--method name
		 Sample2.subtraction();   // diff class and same package--class name.method name
		 Sample3.multiplication(); //diff package---import package name then class name and method name
	}
    }

