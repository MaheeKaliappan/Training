package com.zoho.marupadi;

import java.util.Scanner;

public class StarPattern
{
	public static void main(String args[])
	{

		//58 Program

		/*Pattern*/

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int rows = reader.nextInt();
		
		
		
		for(int rowsStartWith = 1;rowsStartWith <= rows;rowsStartWith++)
		{
			for(int firstHalf = rows;firstHalf >= 1;firstHalf--)
			{
				if(rowsStartWith <= firstHalf)
					System.out.print("*");
				else
					System.out.print("-");
			}
			for(int secondHalf =1;secondHalf <= rows;secondHalf++)
			{
				if(rowsStartWith > secondHalf)
					System.out.print("-");
				else
					System.out.print("*");
			}
			
			
			System.out.println(" ");
		}
		
		//row-1 initialized by looping with 3 rows only
		for(int rowsStartWith = rows-1;rowsStartWith >= 1;rowsStartWith--)
		{
			for(int firstHalf = rows;firstHalf >= 1;firstHalf--)
			{
				if(rowsStartWith <= firstHalf)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			for(int secondHalf =1;secondHalf <= rows;secondHalf++)
			{
				
				if(rowsStartWith > secondHalf)
				{
					System.out.print("-");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			
			
			System.out.println(" ");
		}
		
	}
}
