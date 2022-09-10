package com.zoho.arrays;

import java.util.Scanner;

public class ScalarMatrix {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("enter arrayRow");
		int arrayRow = reader.nextInt();
		System.out.println("enter arrayCol");
		int arrayCol = reader.nextInt();
		System.out.println("Scaller value");
		int scalerValue = reader.nextInt();
		int array[][] = new int[arrayRow][arrayCol];
		int scalerArray[][] = new int[arrayRow][arrayCol];
		System.out.println("Enter the ArrayValues");
		for (int i = 0; i < arrayRow; i++) {
			for (int j = 0; j < arrayCol; j++) {
				array[i][j] = reader.nextInt();
				scalerArray[i][j] = array[i][j] * scalerValue;

			}
		}
		System.out.println("Scaler array");
		for (int i = 0; i < scalerArray.length; i++) {
			for (int j = 0; j < scalerArray.length; j++) {

				System.out.print(scalerArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
