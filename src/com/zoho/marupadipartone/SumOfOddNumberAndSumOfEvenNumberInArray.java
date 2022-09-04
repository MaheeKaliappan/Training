package com.zoho.marupadipartone;

import java.util.Scanner;

public class SumOfOddNumberAndSumOfEvenNumberInArray {

	public static void main(String[] args) {
		/*
		 * 14. Write a program to get the sum of even numbers and odd number in an
		 * array. get the n element as a input, then find the ODD and EVEN numbers kept
		 * in array and find the sum of the array elements
		 */
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize ");
		int arraySize = reader.nextInt();
		int array [] = new int[arraySize];
		int oddSum = 0;
		int evenSum = 0;
		System.out.println("Enter the values");
		for(int index = 0;index<arraySize;index++)
		{
			array[index] = reader.nextInt();
			if(array[index] %2 == 0 )
			{
				evenSum+=array[index];
			}
			else
			{
				oddSum+=array[index];
			}
		}
		System.out.println("Odd Sum Is : "+oddSum);
		System.out.println("Even Sum Is: "+evenSum);

	}

}
