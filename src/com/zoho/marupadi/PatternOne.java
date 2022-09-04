package com.zoho.marupadi;
import java.util.Scanner;

public class PatternOne
{
	public static void main(String args[])
	{
		//47Program

		//PatternOne

		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int rows = reader.nextInt();
		
		for(int index = 1;index <= rows;index++)
		{
			int rightSide = rows-1;
			int leftSide = 1;
			for(int leftSideValues = rows;leftSideValues >= 1;leftSideValues--)
			{
				if(index >= leftSideValues)
				{
					System.out.print(leftSide);
					leftSide++;
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			for(int rightSideValues = index-1;rightSideValues >=1;rightSideValues--)
				{
					System.out.print(rightSideValues);
					rightSide--;
				}
			System.out.println(" ");
		}
	}
	
}
