package com.zoho.arrays;

//Topic : Array
//Date  : 08/09/2022
import java.util.Arrays;
import java.util.Scanner;

public class DecendingOrderBasedOnWeight {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize");
		int arraySize = reader.nextInt();
		int array[] = new int[arraySize];
		System.out.println("Enter the values");
		for (int index = 0; index < arraySize; index++) {
			array[index] = reader.nextInt();
		}
		int mark = 0;
		int weightageArray[][] = new int[arraySize][2];
		for (int index = 0; index < arraySize; index++) {
			if (array[index] % 2 == 0) {
				mark += 3;
			}
			if (array[index] % 4 == 0 && array[index] % 6 == 0) {
				mark += 4;
			}

			for (int checkingIndex = 1; checkingIndex < array[index] / 2; checkingIndex++) {
				if ((checkingIndex * checkingIndex == array[index])) {
					mark += 5;
				}
			}

			weightageArray[index][0] = array[index];
			weightageArray[index][1] = mark;
			mark = 0;

		}

		for (int index = 0; index < weightageArray.length; index++) {
			for (int j = 0; j < weightageArray.length; j++) {

				if (weightageArray[index][1] < weightageArray[j][1]) {
					int tempMark = weightageArray[j][1];
					int tempWeitage = weightageArray[j][0];
					weightageArray[j][1] = weightageArray[index][1];
					weightageArray[j][0] = weightageArray[index][0];
					weightageArray[index][1] = tempMark;
					weightageArray[index][0] = tempWeitage;
					
				}
			}
		}
		for (int index = weightageArray.length - 1; index >= 0; index--) {
			System.out.print("<" + weightageArray[index][0] + ",");
			System.out.print(weightageArray[index][1] + "> ");
		}
		

	}

}
