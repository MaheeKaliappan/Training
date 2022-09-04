package com.zoho.marupadi;
public class FindTheValuee
{
	public static void main(String args[])
	{
		//23program

		/* 22&23) What is the value of x1 if x=5  */

		
		int x = 5;
		
		int x1 = ++x - x++ + -x;
		
		System.out.println("X1 value is : "+x1);
		
		
		//21 Program
		
		int y = 10; 
		
		int z = (++y * (y++ + 5));
		System.out.println("z value is : "+z);
		
		//19Program
		
		int a = 28;
		a += a++ + ++a + --a + a--; 
	 
		System.out.println("a value is : "+a);
	}
}
