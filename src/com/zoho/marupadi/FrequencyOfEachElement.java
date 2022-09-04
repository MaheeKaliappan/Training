package com.zoho.marupadi;
import java.util.Scanner;

class FrequencyCheck
{
	public void frequencyChecking(Integer array[])
	{
	
		for(int index = 0; index < array.length; index++)
		{  
			int frequencyCount = 1;  
			for(int checkingIndex = index+1; checkingIndex < array.length; checkingIndex++)
			{  
				if(array[index] == array[checkingIndex])
				{  
					frequencyCount++; 
					array[checkingIndex] = null;  
				}  
			}
			
			if(array[index] != null)
				System.out.println("Value : "+array[index] +" frequencyCount : "+frequencyCount);
		}
	}
}

public class FrequencyOfEachElement
{
	public static void main(String args[])
	{
		//42 Program

		/* Java Program to find the frequency of each element in the array */
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize :");
		int arraySize = reader.nextInt();
		
		
		Integer array[] = new Integer[arraySize];
		System.out.println("Enter the arrayValues :");
		
		
		for(int i = 0;i<arraySize;i++)
		{
			array[i] = reader.nextInt();
		}
		
		
		FrequencyCheck checking = new FrequencyCheck();
		
		
		checking.frequencyChecking(array);
	}
}