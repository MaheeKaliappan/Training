package com.zoho.marupadipartone;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// 5. Write a program to print the below pattern
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = reader.nextInt();
		
		for(int index = 1;index<=number;index++)
		{
			for(int innerIndex = 1;innerIndex<=number;innerIndex++)
			{
				if(innerIndex<=index)
				{
					System.out.print(innerIndex);
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int innerIndex = number;innerIndex>=1;innerIndex--)
			{
				if(innerIndex<=index)
				{
					System.out.print(innerIndex);
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
