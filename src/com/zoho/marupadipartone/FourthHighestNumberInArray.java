package com.zoho.marupadipartone;

import java.util.Scanner;

public class FourthHighestNumberInArray {

	public static void main(String[] args) {
		/* 13. Find the fourth highest number in given array? You are given an array
consisting of 'N' integers. You have to find the fourth largest element present
in the array.  */
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize");
		int arraySize = reader.nextInt();
		int array [] = new int[arraySize];
		if(arraySize>3)
		{
			System.out.println("enter the array values");
			for(int index = 0;index<arraySize;index++)
			{
				array[index] = reader.nextInt();
			}
			for(int index = 0;index<arraySize;index++)
			{
				for(int innerIndex = index+1;innerIndex<arraySize;innerIndex++)
				{
					if(array[index]>array[innerIndex])
					{
						int temp = array[index];
						array[index] = array[innerIndex];
						array[innerIndex] = temp;
					}
				}
			}
			
			System.out.println("Fourth value is : "+array[3]);
			
			
		}
		else
		{
			System.out.println("Array size is "+arraySize+" cannot find fourth value");
		}

	}

}
