package com.zoho.marupadipartone;

import java.util.Scanner;

public class ArmStrongOrNot {

	public static void main(String[] args) {
		/*
		 * 1. Write a program to check if a number is Armstrong's number or not? A)
		 * Input - 153 Output - It is an Armstrong Number B) Input - 123 Output - It is
		 * not an Armstrong Number
		 */

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = reader.nextInt();

		int originalNumber = number;
		int digitCount = 0;
		int result = 0;

		while (originalNumber > 0) {
			originalNumber /= 10;
			digitCount++;
		}
		
		originalNumber = number;
		
		while (originalNumber != 0) {
			int remainder = originalNumber % 10;
			result += Math.pow(remainder, digitCount);
			originalNumber /= 10;
		}

		if (result == number)
		{
			System.out.println(number + " is an Armstrong number.");
		}
			
		else
		{
			System.out.println(number + " is not an Armstrong number.");
		}
			

	}

}
