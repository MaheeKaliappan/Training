package com.zoho.marupadi;

import java.util.Scanner;

class CheckTheNumberr {
	public String findTheNumberIsPositiveOrNegative(int number) {
		String result = " ";

		if (number > 0) {
			result = "The number is positive.";
		}

		else if (number < 0) {
			result = "The number is negative.";
		}

		else {
			result = "The number is zero.";
		}
		return result;
	}
}

public class NumberIsPositiveOrNegative {
	public static void main(String args[]) {

		// 32 program

		/* 32) Program to Check Whether a Number is Positive or Negative */

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = reader.nextInt();

		CheckTheNumberr checking = new CheckTheNumberr();

		String result = checking.findTheNumberIsPositiveOrNegative(number);

		System.out.print(result);

	}

}