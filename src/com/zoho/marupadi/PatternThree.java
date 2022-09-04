package com.zoho.marupadi;

import java.util.Scanner;

class Patterrn {
	public void printingPattern(int rows) {

		for (int rowsCount = rows; rowsCount >= 1; rowsCount--) {

			for (int space = rows; space > rowsCount; space--) {
				System.out.print(" ");
			}

			for (int printingStars = 1; printingStars <= rowsCount; printingStars++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}

	}
}

public class PatternThree {
	public static void main(String args[]) {
		// 49 Program

		/*
		 * Pattern 3
		 */
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Number of rows");

		int rows = reader.nextInt();

		Patterrn pattern = new Patterrn();

		pattern.printingPattern(rows);
	}
}
