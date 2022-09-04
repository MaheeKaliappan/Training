package com.zoho.marupadi;

import java.util.Scanner;

public class OddPositionDescendingEvenPositionAscending {
	public static void main(String args[]) {
		// 54 Program

		/*
		 * 54) Write a program to sort the elements in odd positions in descending order
		 * and elements in ascending order.
		 */

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter the arraySize : ");
		int arraySize = reader.nextInt();
		int array[] = new int[arraySize];

		int ascendingCount = 0;
		int decendingCount = 0;

		System.out.println("Enter the Array values : ");
		for (int index = 0; index < arraySize; index++) {
			array[index] = reader.nextInt();

			if (index % 2 == 0) {
				decendingCount++;
			} else {
				ascendingCount++;
			}
		}

		int ascendingArray[] = new int[ascendingCount];
		int decendingArray[] = new int[decendingCount];

		ascendingCount = 0;
		decendingCount = 0;

		for (int index = 0; index < arraySize; index++) {
			if (index % 2 == 0) {
				decendingArray[decendingCount] = array[index];
				decendingCount++;
			} else {
				ascendingArray[ascendingCount] = array[index];
				ascendingCount++;
			}
		}

		for (int index = 0; index < ascendingArray.length; index++) {
			for (int checkingIndex = index + 1; checkingIndex < ascendingArray.length; checkingIndex++) {
				if (ascendingArray[index] > ascendingArray[checkingIndex]) {
					int temp = ascendingArray[index];
					ascendingArray[index] = ascendingArray[checkingIndex];
					ascendingArray[checkingIndex] = temp;
				}
			}
		}

		for (int index = 0; index < decendingArray.length; index++) {
			for (int checkingIndex = index + 1; checkingIndex < decendingArray.length; checkingIndex++) {
				if (decendingArray[index] < decendingArray[checkingIndex]) {
					int temp = decendingArray[index];
					decendingArray[index] = decendingArray[checkingIndex];
					decendingArray[checkingIndex] = temp;
				}
			}
		}

		int aCount = 0;
		int dCount = 0;

		for (int index = 0; index < arraySize; index++) {
			if (index % 2 == 0) {
				array[index] = decendingArray[dCount];
				System.out.print(" " + array[index]);
				dCount++;
			} else {
				array[index] = ascendingArray[aCount];
				System.out.print(" " + array[index]);
				aCount++;
			}
		}

	}
}