package com.zoho.marupadi;


import java.util.Scanner; 


public class MergeArrayWithoutDuplication
{
	public static void main(String args[])
	{
		//9th Program

		/*9)Given two sorted arrays, merge them such that the elements are not repeated */

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the firstArraySize : ");
		int firstArraySize = reader.nextInt();
		int firstArray[] = new int[firstArraySize];
		
		System.out.print("Enter the secondArraySize : ");
		int secondArraySize = reader.nextInt();
		int secondArray[] = new int[secondArraySize];
		
		Integer mergedArray[] = new Integer[firstArraySize + secondArraySize];
		int mergedArrayIndex = 0;
		
		//store first array values
		System.out.println("Enter the firstArray values : ");
		for(int index = 0;index < firstArraySize ;index++)
		{
			firstArray[index] = reader.nextInt();
			
			//store firstArray values in mergedArray
			mergedArray[mergedArrayIndex] = firstArray[index];
			
			//mergedArray index count increased by 1
			mergedArrayIndex++;
			
		}
		System.out.println("Enter the secondArray values : ");
		
		//store second array values
		for(int index = 0;index < secondArraySize ;index++)
		{
			secondArray[index] = reader.nextInt();
			
			//store second array values in mergedArray
			mergedArray[mergedArrayIndex] = secondArray[index];
			
			//mergedArray index count increased by 1
			mergedArrayIndex++;
			
		}
		
		//ascending order in mergedArray
		for(int index = 0;index < mergedArray.length;index++)
		{
			for(int innerIndex = index+1;innerIndex<mergedArray.length;innerIndex++)
			{
				if(mergedArray[index] > mergedArray[innerIndex])
				{
					int temp = mergedArray[index];
					mergedArray[index] = mergedArray[innerIndex];
					mergedArray[innerIndex] = temp;
				}
			}
			
		}
		
		//remove duplicate elements
		for(int index = 0;index < mergedArray.length;index++)
		{
			for(int checking =index+1;checking < mergedArray.length;checking++)
			{
				if(mergedArray[index] == mergedArray[checking])
				{
					mergedArray[checking] = null;
				}
			}
		}
		
		//printing elements
		for(int index = 0;index < mergedArray.length;index++)
		{
			if(mergedArray[index] != null)
			{
				System.out.print(mergedArray[index] +" ");
			}
		}
	}
}
