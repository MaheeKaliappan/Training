package com.zoho.marupadi;

import java.util.Scanner;

class Reverse {

	long reverse = 0;

	public long reverseTheNumber(long value) {

		while (value > 0) {

			long temp = value % 10;

			reverse = reverse * 10 + temp;

			value = value / 10;

		}
		return reverse;
	}

}

public class DifferenceBetweenTheGivenNumberAndItsReverese {
	public static void main(String[] args) {

		// 3rd Program

		/*
		 * write a program to find the difference between the given number and it's
		 * reverse number.
		 */

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter the Value : ");

		long value = reader.nextLong();

		Reverse reverse = new Reverse();

		long reverseValue = reverse.reverseTheNumber(value);

		System.out.println("The Result Is : " + value + " - " + reverseValue + " = " + (value - reverseValue));
	}

}