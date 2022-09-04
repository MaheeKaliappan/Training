package com.zoho.marupadi;

import java.util.Scanner;

class CopyArrayValues {
	public void copyTheValuesOneArrayToAnotherArray(int array[], int anotherArray[]) {
		
		System.out.println("Before Copy FirstArray Values & AnotherArray Values");
		for (int index = 0; index < array.length; index++) {
			System.out.println("FirstArray   : " + array[index]);
			System.out.println("AnotherArray : " + anotherArray[index]);
		}

		
		for (int index = 0; index < array.length; index++) {
			anotherArray[index] = array[index];
		}

		
		System.out.println("After Copy FirstArray Values & AnotherArray Values");
		for (int index = 0; index < array.length; index++) {
			System.out.println("FirstArray   : " + array[index]);
			System.out.println("AnotherArray : " + anotherArray[index]);
		}

	}
}

public class CopyAllElementsOneArrayToAnotherArray {
	public static void main(String args[]) {

		// 41 Program

		/* Java Program to copy all elements of one array into another array */
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize :");

		int arraySize = reader.nextInt();

		int array[] = new int[arraySize];

		int anotherArray[] = new int[arraySize];

		System.out.println("Enter the arrayValues :");
		for (int index = 0; index < arraySize; index++) {

			array[index] = reader.nextInt();
		}

		CopyArrayValues copyValues = new CopyArrayValues();

		copyValues.copyTheValuesOneArrayToAnotherArray(array, anotherArray);

	}
}
