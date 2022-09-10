package com.zoho.arrays;
public class MatrixMultiplication {

	public static void main(String[] args) {

		int firstArray[][] = { { 1, 2 }, { 3, 4 } };
		int secondArray[][] = { { 5, 6, 7 }, { 8, 9, 10 } };

		int multiplicationArray[][] = new int[2][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 2; k++) {
					multiplicationArray[i][j] += firstArray[i][k] * secondArray[k][j];
				}
				System.out.print(multiplicationArray[i][j] + " ");
			}
			System.out.println();

		}

	}

}
