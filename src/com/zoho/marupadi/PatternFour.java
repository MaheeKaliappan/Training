package com.zoho.marupadi;

import java.util.Scanner;

class Patternn {
	public void printingPattern(int rows) {

		for (int rowsCount = rows; rowsCount >= 1; rowsCount--) {

			for (int space = rows; space > rowsCount; space--) {
				System.out.print(" ");
			}

			for (int printingStars = 1; printingStars <= rowsCount; printingStars++) {
				System.out.print(" " + rowsCount + " ");
			}
			System.out.println(" ");
		}

	}
}

public class PatternFour {
	public static void main(String args[]) {
		// 50 Program

		/*
		 * Pattern 4
		 */
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Number of rows");

		int rows = reader.nextInt();

		Patternn pattern = new Patternn();

		pattern.printingPattern(rows);
	}
}
