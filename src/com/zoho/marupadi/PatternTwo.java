package com.zoho.marupadi;

import java.util.Scanner;

public class PatternTwo
{
	public static void main(String args[])
	{
		//48Program

		//PatternTwo

		
		Scanner reader = new Scanner(System.in);
		System.out.print(" Enter the rows : ");
		int rows = reader.nextInt();
		
		for(int index = rows;index >= 1;index--)
		{
			int rightSide = rows-1;
			for(int leftSideValues = 1;leftSideValues <= rows;leftSideValues++)
			{
				if(index <= leftSideValues)
				{
					System.out.print(leftSideValues);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			for(int rightSideValues = index;rightSideValues < rows;rightSideValues++)
			{
				System.out.print(rightSide);
				rightSide--;
			}
			System.out.println(" ");
		}
	}
	
}

