package com.zoho.marupadi;
import java.util.Scanner;

public class PrintTheEvenPositionValues
{
	public static void main(String args[])
	{
		//36Program

		/* Java Program to print the elements of an array present on even position */

		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize : ");
		int arraySize = reader.nextInt();
		int array [] = new int[arraySize];
		
		for(int i = 0;i<arraySize;i++)
		{
			array[i] = reader.nextInt();
		}
		System.out.println("Even position values : ");
		for(int i = 1;i<arraySize;i+=2)
		{
			System.out.print(array[i]+" ");
		}
		
		
	}
}
