package com.zoho.marupadi;

import java.util.Scanner;

class CheckTheNumber {
	public String findTheNumber(int number) {
		String result = " ";
		if (number % 2 == 0) {
			result = " is even";
		}

		else {
			result = " is odd";
		}

		return result;
	}

}

public class OddOrEven {
	public static void main(String args[]) {
		// 28Program

		/* 28) Program to Check Whether a Number is Even or Odd */

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = reader.nextInt();

		
		CheckTheNumber checking = new CheckTheNumber();

		
		String result = checking.findTheNumber(number);

		System.out.print("Number " + number + " " + result);
	}
}
