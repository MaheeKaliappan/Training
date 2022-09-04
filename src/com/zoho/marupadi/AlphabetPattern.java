package com.zoho.marupadi;

import java.util.Scanner;

class Pattern {
	public void printThePattern(int ascciValue) {

		if (ascciValue >= 65 && ascciValue <= 90) {

			for (int outerIndex = ascciValue; outerIndex >= 65; outerIndex--) {

				for (int innerIndex = 65; innerIndex <= outerIndex; innerIndex++) {
					System.out.print((char) outerIndex);
				}
				System.out.println("");
			}
		}

		else if (ascciValue >= 97 && ascciValue <= 122) {

			for (int outerIndex = ascciValue; outerIndex >= 97; outerIndex--) {

				for (int innerIndex = 97; innerIndex <= outerIndex; innerIndex++) {
					System.out.print((char) outerIndex);
				}
				System.out.println("");
			}
		}

		else {
			System.out.print("Invalid Key");
		}
	}
}

public class AlphabetPattern {
	public static void main(String args[]) {

		// 5th program

		/* Write a program to print the following pattern based on the alphabet */

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the Character : ");

		char charValue = reader.next().charAt(0);

		int ascciValue = (char) charValue;

		Pattern pattern = new Pattern();

		pattern.printThePattern(ascciValue);

	}
}
