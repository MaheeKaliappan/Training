package com.zoho.marupadi;

//30Program

/* 30) Program to Find the Largest Number Among Three Numbers*/

import java.util.Scanner;

class LargestNumber {
	public int findTheLargestNumber(int firstNumber, int secondNumber, int thirdNumber) {
		int result = 0;

		if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
			result = firstNumber;
		}

		else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
			result = secondNumber;
		}

		else {
			result = thirdNumber;
		}
		return result;
	}
}

public class LargestNumberAmongThreeNumbers {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the firstNumber");
		int firstNumber = reader.nextInt();
		System.out.println("Enter the secondNumber");
		int secondNumber = reader.nextInt();
		System.out.println("Enter the thirdNumber");
		int thirdNumber = reader.nextInt();

		LargestNumber largeNum = new LargestNumber();

		int result = largeNum.findTheLargestNumber(firstNumber, secondNumber, thirdNumber);

		System.out.println(result + " is the largest Number");

	}
}