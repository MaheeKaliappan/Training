package com.zoho.marupadi;

import java.util.Scanner;

public class RearrangeTheArray
{
	public static void main(String args[])
	{
		//10Program

		/* 10) Alternate sorting: Given an array of integers, rearrange the array in such a way that
		the first element is first maximum and second element is first minimum. */

		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the arraySize :");
		int arraySize = reader.nextInt();
		
		int array[] = new int[arraySize];
		
		//values added in array
		System.out.println("Enter the values : ");
		for(int index = 0;index<arraySize;index++)
		{
			array[index] = reader.nextInt();
		}
		
		//ascending order
		
		for(int ascending = 0;ascending<arraySize;ascending++)
		{
			for(int checking = ascending+1;checking<arraySize;checking++)
			{
				if(array[ascending]>array[checking])
				{
					int temp = array[checking];
					array[checking] = array[ascending];
					array[ascending] = temp;
				}
			}
		}
		int rearrageArray[] = new int[arraySize];
		int ascending = 0;
		int decending = arraySize-1;
		
		for(int index = 0;index<arraySize;index++)
		{
			if(index %2 ==0)
			{
				rearrageArray[index] = array[decending];
				decending--;
			}
			else
			{
				rearrageArray[index] = array[ascending];
				ascending++;
			}
		}
		for(int index = 0;index<arraySize;index++)
		{
			System.out.print(rearrageArray[index]+" ");
		}
	}
}