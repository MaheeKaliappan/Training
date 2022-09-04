package com.zoho.marupadi;
import java.util.Scanner;
class SmallestElement
{
	public int findSmallestElementInArray(int array[])
	{
		int smallestElement = 0;
		
		
		smallestElement = array[0];
		
		
		for(int index = 0;index<array.length;index++)
		{
		
			if(smallestElement > array[index])
				{
					int temp = array[index];
					array[index] = smallestElement;
					smallestElement = temp;
					
				}
			
		}
		return smallestElement;
		
	}
}

public class SmallestElementInAnArray
{
	public static void main(String args[])
	{
		//39Program

		/* Java Program to print the Smallest element in an array */

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the ArraySize :");
		
		
		int arraySize = reader.nextInt();
		
		
		int array [] = new int[arraySize];
		
		
		for(int index =0;index<arraySize;index++)
		{
		
			array[index] = reader.nextInt();
		}
		
		
		SmallestElement smallElement = new SmallestElement();
		
		
		int smallestElement = smallElement.findSmallestElementInArray(array);
		
		
		System.out.println("SmallestElement : "+smallestElement);
	}
}
