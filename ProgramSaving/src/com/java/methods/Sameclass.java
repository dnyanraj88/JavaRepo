package com.java.methods;

import com.java.method2.Diffpackageclass;

public class Sameclass {
     public static void sameclassstaticmethod()
     {
    	 System.out.println("Diff method from same class");
     }
       public void SameClassNonStaticMethod()
       {
    	   System.out.println("Non static method from same class");
       }
       public static void main(String[] args)
     {
		System.out.println("program start");
		sameclassstaticmethod();
		 Diffclass.diffclassmethod();
		 Diffpackageclass.diffpackagemethod();
		 
		 Sameclass object=new Sameclass();
		 object.SameClassNonStaticMethod();
		 
		 Diffclass object2=new Diffclass();
		 object2.diffclassNonStaticmethod();
		 
		 Diffpackageclass object3=new Diffpackageclass();
		 object3.diffpackagenonstaticmethod();
		System.out.println("program end");
	}
}
