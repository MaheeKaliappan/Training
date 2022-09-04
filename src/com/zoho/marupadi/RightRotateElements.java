package com.zoho.marupadi;

import java.util.Scanner;

public class RightRotateElements {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize :");
		int arraySize = reader.nextInt();
		int array[] = new int[arraySize];

		System.out.println("Enter the values :");
		for (int index = 0; index < arraySize; index++) {
			array[index] = reader.nextInt();
		}

		System.out.println("How many times array should be rotated : ");
		int rotatedValue = reader.nextInt();

		for (int index = 0; index < rotatedValue; index++) {
			int rotatedArray, getLastIndex;

			getLastIndex = array[arraySize - 1];

			for (rotatedArray = array.length - 1; rotatedArray > 0; rotatedArray--) {

				array[rotatedArray] = array[rotatedArray - 1];
			}

			array[rotatedArray] = getLastIndex;
		}

		System.out.println("Array after Right rotation: ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}
}