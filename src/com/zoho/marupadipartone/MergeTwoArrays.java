package com.zoho.marupadipartone;

import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		/*
		 * 19. Write a Program to Merge Two Arrays. We have to merge two arrays such
		 * that the array elements maintain their original order in the newly merged
		 * array. The elements of the first array precede the elements of the second
		 * array in the newly merged array. For example: 1. int[] arr1={1, 2, 3, 4,
		 * 5,6}; //first array 2. int[] arr2={7, 8, 9, 0}; //second array 3. int[]
		 * arr3={1, 2, 3, 4, 5, 6, 7, 8, 9, 0} //resultant array
		 */
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter firstArraySize");
		int firstArraySize = reader.nextInt();
		System.out.println("Enter secondArraySize");
		int secondArraySize = reader.nextInt();
		
		int firstArray [] = new int[firstArraySize];
		int secondArray[] = new int[secondArraySize];
		int mergedArray[] = new int[firstArraySize+secondArraySize];
		
		int mergedArrayIndex = 0;
		
		System.out.println("enter firstArrayValues");
		for(int index = 0;index<firstArraySize;index++)
		{
			firstArray[index] = reader.nextInt();
			mergedArray[mergedArrayIndex] = firstArray[index];
			mergedArrayIndex++;
		}
		System.out.println("enter secondArrayValues");
		for(int index = 0;index<secondArraySize;index++)
		{
			secondArray[index] = reader.nextInt();
			mergedArray[mergedArrayIndex] = secondArray[index];
			mergedArrayIndex++;
		}
		System.out.println("Merged  Array values");
		for(int index = 0;index<mergedArray.length;index++)
		{
			System.out.print(mergedArray[index]+" ");
		}
	}

}
