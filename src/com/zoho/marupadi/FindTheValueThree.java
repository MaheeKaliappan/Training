package com.zoho.marupadi;



import java.util.Scanner;

public class FindTheValueThree
{
	public static void main(String args[])
	{
		//20Program

		/* 20) Evaluate the following expression on paper and on program and understand the
		difference
		x = x++ * 2 + 3 * –x; */
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int xx = reader.nextInt();
		int yy = xx++ * 2 + 3 * --xx;
		System.out.println("yy :"+yy);
		
		//example
		int x = 5;
		int y = x++ * 2 + 3 * --x;
		System.out.println( "y : "+y);
	}
}
