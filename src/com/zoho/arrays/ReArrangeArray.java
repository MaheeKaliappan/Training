package com.zoho.arrays;

import java.util.Scanner;

public class ReArrangeArray {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize");
		int arraySize = reader.nextInt();
		int array[] = new int[arraySize];
		int midValue;
		System.out.println("enter values");
		for (int index = 0; index < arraySize; index++) {
			array[index] = reader.nextInt();
		}

		if ((array.length) % 2 == 0) {
			midValue = (array[0] + array[array.length - 1]) / 2;
			System.out.println(midValue);
		} else {
			midValue = ((array[0] + array[array.length - 1]) / 2) - 1;

		}
		int i = midValue, j = midValue + 1;
		while (midValue >= 0) {
			System.out.print(array[midValue] + " ");
			midValue--;
			if (j < array.length)
				System.out.print(array[j++] + " ");
		}

	}

}
