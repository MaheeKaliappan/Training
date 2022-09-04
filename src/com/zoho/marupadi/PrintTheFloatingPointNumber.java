package com.zoho.marupadi;


public class PrintTheFloatingPointNumber
{
	public static void main(String args[])
	{

		//12Program

		/*12) Write a program to print the number 7.50 without using String.*/
		
		double doubleValue = 7.50d;
		float  floatValue  = 7.50f;
		
		System.out.printf("%.2f", doubleValue);
		System.out.println();
		System.out.printf("%.2f", floatValue);
	}
}

