package com.zoho.marupadi;

import java.util.Scanner;

class LargestElement {
	public int findLargestElementInArray(int array[]) {
		int largestElement = 0;

		largestElement = array[0];

		for (int index = 0; index < array.length; index++) {

			if (largestElement < array[index]) {
				int temp = array[index];
				array[index] = largestElement;
				largestElement = temp;

			}

		}
		return largestElement;

	}
}

public class LargestElementInAnArray {
	public static void main(String args[]) {

		// 38Program

		/* Java Program to print the Largest element in an array */

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the ArraySize :");

		int arraySize = reader.nextInt();

		int array[] = new int[arraySize];

		for (int index = 0; index < arraySize; index++) {

			array[index] = reader.nextInt();
		}

		LargestElement largeElement = new LargestElement();

		int largestElement = largeElement.findLargestElementInArray(array);

		System.out.println("LargestElement : " + largestElement);
	}
}
