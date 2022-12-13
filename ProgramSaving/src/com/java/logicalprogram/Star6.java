package com.java.logicalprogram;
//    *
//   * *
//  * * *    star=5 rows=5 space=4
// * * * *
//* * * * *

public class Star6 
{
 public static void main(String[] args){
	 int rows=5;
	 int space=4;
	 int star=5;
	 for(int i=1;i<=rows;i++)
	 {
			 for(int j=space;j>=i;j--)
		 {
			System.out.print(" ");	
		 }
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	     }
			 
		}

