package com.zoho.bitwiseoperator;

import java.util.Scanner;

public class RemoveDuplicateElementsUsingBitwiseOperator {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the ArraySize : ");
		int arraySize = reader.nextInt();
		Integer array[] = new Integer[arraySize];
		System.out.println("Enter the values");
		for (int index = 0; index < arraySize; index++) {
			array[index] = reader.nextInt();
		}

		int findDuplicateValues = 0;
		boolean duplicatesOccured = false;
		// System.out.println("duplicate values");
		for (int index = 0; index < arraySize; index++) {
			for (int innerIndex = index + 1; innerIndex < arraySize; innerIndex++) {
				if (array[index] != null) {
					if (array[innerIndex] != null) {
						int value = array[innerIndex] ^ array[index];
						// System.out.println(value);
						if (value == 0) {
							findDuplicateValues = array[innerIndex];
							array[innerIndex] = null;
						}
					}

				}

			}

			if (findDuplicateValues != 0) {
				duplicatesOccured = true;
				System.out.print(findDuplicateValues + " ");
				findDuplicateValues = 0;
			}
		}
		if (!duplicatesOccured) {
			System.out.println("No Duplicates");
		}
	}

}
