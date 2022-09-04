package com.zoho.marupadipartone;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// 3. Write a program to print the following structure 
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = reader.nextInt();
		
		for(int index = -2;index<=number;index++)
		{
			index+=1;
			for(int innerIndex = 1;innerIndex<=index;innerIndex++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int index=number;index >= 1;index--)
		{
			index-=1;
			for(int innerIndex = 1;innerIndex<index;innerIndex++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
