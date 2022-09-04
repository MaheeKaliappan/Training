package com.zoho.marupadi;

import java.util.Scanner;

public class StringIsOddLengthTwo {
	public static void main(String args[]) {
		// 57 program

		/*
		 * 57) Write a program to print the following output for the given input. You
		 * can assume the string is of odd length
		 */
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int row = reader.nextInt();
		int indexCount = row;

		for (int outerIndex = 1; outerIndex <= row; outerIndex++) {

			for (int innerIndex = row; innerIndex >= 1; innerIndex--) {

				if (innerIndex == outerIndex) {
					System.out.print(indexCount);
				}

				else if (indexCount == innerIndex) {
					System.out.print(outerIndex);
				}

				else {
					System.out.print(" ");
				}
			}

			indexCount--;
			System.out.println(" ");
		}

	}
}
