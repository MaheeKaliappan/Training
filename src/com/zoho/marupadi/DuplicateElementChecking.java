package com.zoho.marupadi;

import java.util.Scanner;

class DuplicateCheck {
	public void duplicateElementsChecking(Integer array[]) {
		System.out.println("Duplicate values");

		
		boolean occurence = false;

		for (int index = 0; index < array.length; index++) {

			for (int checkingIndex = index + 1; checkingIndex < array.length; checkingIndex++) {
		
				if (array[index] == array[checkingIndex] && array[index] != null) {
					occurence = true;
					System.out.println(array[index]);
					array[checkingIndex] = null;
					array[index] = null;

				}
			}

		}
		if (!occurence) {
			System.out.println("No Duplicate values .");
		}
	}
}

public class DuplicateElementChecking {
	public static void main(String args[]) {
		// 44 Program

		/* 44)Java Program to print the duplicate elements of an array */

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize :");
		int arraySize = reader.nextInt();

		Integer array[] = new Integer[arraySize];
		System.out.println("Enter the arrayValues :");

		for (int i = 0; i < arraySize; i++) {
			array[i] = reader.nextInt();
		}

		DuplicateCheck checking = new DuplicateCheck();

		checking.duplicateElementsChecking(array);
	}
}
