package com.zoho.excceptionhandling;

import java.util.Scanner;

class CustomException extends Exception {

	public CustomException(String string) {
		super(string);

	}

}

public class CustomExceptionDemo {

	public static void main(String[] args) throws CustomException {
		Scanner reader = new Scanner(System.in);
		System.out.println("enter the number");
		int number = reader.nextInt();
		System.out.println("Enter the divide");
		int divide = reader.nextInt();
		try {
			System.out.println("Result : " + divideTheNumber(number, divide));
		} catch (CustomException customException) {
			System.out.println(customException);
		}

	}

	private static int divideTheNumber(int number, int divide) throws CustomException {
		if (divide == 0) {
			throw new CustomException("number cannot divided ");

		} else {
			return number / divide;
		}

	}

}
