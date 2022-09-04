package com.zoho.marupadipartone;

import java.util.Scanner;

public class NumberPalindromeOrNot {

	public static void main(String[] args) {
		/*
		 * 11. Check if a given number is palindrome or not. A simple method for this
		 * problem is to first reverse the input, then compare the reverse with
		 * original. If both are same, then return true, else false.
		 */

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = reader.nextInt();
		int temp = number;
		int remainder, sum = 0;
		
		
		while (temp > 0) {
			remainder = temp % 10;
			sum =+ remainder+(sum * 10) ;
			temp = temp / 10;
		}
		if (number == sum) {
			System.out.println("palindrome number ");
		}

		else {
			System.out.println("not palindrome");
		}

	}

}
