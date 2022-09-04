package com.zoho.marupadi;


import java.util.Scanner;

public class PrintTheNumberOfElements
{
	public static void main(String args[])
	{
		//40Program

		/* Java Program to print the number of elements present in an array */
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize : ");
		int arraySize = reader.nextInt();
		int array [] = new int[arraySize];
		int numberOfElementsCount = 0;
		for(int i = 0;i<arraySize;i++)
		{
			array[i] = reader.nextInt();
		}
		System.out.println("array values : ");
		for(int i = 0;i<arraySize;i++)
		{
			System.out.print(" "+array[i]);
		}
		
		
	}
}
