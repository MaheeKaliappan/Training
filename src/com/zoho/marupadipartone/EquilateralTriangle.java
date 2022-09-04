package com.zoho.marupadipartone;

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		/*
		 * 4. Write a program to print equilateral triangle (an equilateral triangle is
		 * a triangle in which all three sides are equal.)
		 */
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit = reader.nextInt();
		
		for(int index = limit;index>=1;index--)
		{
			for(int innerIndex = 1;innerIndex<=limit;innerIndex++)
			{
				if(index<=innerIndex)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
