package com.zoho.marupadi;

import java.util.Scanner;

class Reversee {

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

public class ReverseTheNumber {
	public static void main(String[] args) {
		// 51 Program

		/*
		 * 51) Write a program to display the number in reverse order without use of
		 * String functions.
		 */

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter the Value : ");

		long value = reader.nextLong();

		Reversee reverse = new Reversee();

		long reverseValue = reverse.reverseTheNumber(value);

		System.out.println("The number in reverse order is :" + reverseValue);
	}

}
