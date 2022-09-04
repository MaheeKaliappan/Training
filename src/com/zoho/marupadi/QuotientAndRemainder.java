package com.zoho.marupadi;
import java.util.Scanner;

public class QuotientAndRemainder 
{
	public static void main(String args[]) 
	{

		//25 program

		/*25) Program to Compute Quotient and Remainder */

		
		Scanner reader = new Scanner(System.in);
		System.out.print("enter the dividend :");
		int dividend = reader.nextInt();
		System.out.print("enter the divisor :");
		int divisor = reader.nextInt();
		
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient  : " + quotient);
		System.out.println("Remainder : " + remainder);
}
}