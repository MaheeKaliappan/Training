package com.zoho.marupadi;

import java.util.Scanner;

public class PyramidWithNumbers {
	public void makeAPyramid(int rows) {

		int value = 0;

		for (int rowsCount = 1; rowsCount <= rows; rowsCount++) {

			if (value >= rows) {
				break;
			}

			for (int spaceCreate = rows; spaceCreate > rowsCount; spaceCreate--) {
				System.out.print(" ");
			}

			for (int values = 1; values <= rowsCount; values++) {
				value++;
				System.out.print(" " + value + " ");

			}
			System.out.println(" ");
		}

	}

	public static void main(String args[]) {
		// 56 Program

		/*
		 * Write a program to make such a pattern like a pyramid with numbers increased
		 * by 1
		 */

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the limit : ");

		int rows = reader.nextInt();

		PyramidWithNumbers pyramid = new PyramidWithNumbers();
		pyramid.makeAPyramid(rows);
	}
}
