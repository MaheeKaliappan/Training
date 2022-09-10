package com.zoho.arrays;

import java.util.Scanner;

public class MatrixSubtraction {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("enter firstArrayRow");
		int firstArrayRow = reader.nextInt();
		System.out.println("enter firstArrayCol");
		int firstArrayCol = reader.nextInt();

		System.out.println("enter secondArrayRow");
		int secondArrayRow = reader.nextInt();
		System.out.println("enter secondArrayCol");
		int secondArrayCol = reader.nextInt();

		int firstArray[][] = new int[firstArrayRow][firstArrayCol];
		int secondArray[][] = new int[secondArrayRow][secondArrayCol];
		int subtractionArray[][] = new int[firstArrayRow][secondArrayCol];
		System.out.println("Enter the firstArrayValues");
		for (int i = 0; i < firstArrayRow; i++) {
			for (int j = 0; j < firstArrayCol; j++) {
				firstArray[i][j] = reader.nextInt();
			}
		}
		System.out.println("Enter the secondArrayValues");
		for (int i = 0; i < secondArrayRow; i++) {
			for (int j = 0; j < secondArrayCol; j++) {
				secondArray[i][j] = reader.nextInt();
			}
		}
		
		System.out.println("Subtraction array");
		for (int i = 0; i < firstArrayRow; i++) {
			for (int j = 0; j < secondArrayCol; j++) {
				subtractionArray[i][j] = firstArray[i][j] - secondArray[i][j];

				System.out.print(subtractionArray[i][j] + " ");
			}
			System.out.println();
		}


	}

}
