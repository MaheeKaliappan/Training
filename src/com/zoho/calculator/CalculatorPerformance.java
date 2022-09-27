package com.zoho.calculator;

import java.util.Scanner;

public class CalculatorPerformance {

	static int calculateNumberValue;
	static boolean validResult = true;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		CalculatorPerformance calculatorPerformance = new CalculatorPerformance();

		System.out.println("enter a value");
		String numberString = reader.next();
		calculatorPerformance.validateTheNumber(numberString);

		if (validResult) {
			System.out.println(calculateNumberValue);
		}

	}

	private void validateTheNumber(String numberString) {

		String tempString = "";
		char currentChar = ' ';
		char tempChar = ' ';
		int result = 0;
		for (int position = 0; position < numberString.length(); position++) {
			if (numberString.charAt(position) == '+' || numberString.charAt(position) == '-'
					|| numberString.charAt(position) == '*' || numberString.charAt(position) == '/'
					|| numberString.charAt(position) == '=') {
				if (numberString.charAt(position) != '=') {
					tempChar = numberString.charAt(position);
				}
				if (CalculatorPerformance.calculateNumberValue == 0) {
					result = Integer.parseInt(tempString);
					CalculatorPerformance.calculateNumberValue = result;
					currentChar = numberString.charAt(position);
					tempString = "";
				} else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
					CalculatorPerformance.calculateNumberValue = CalculatingValues
							.operationPerformedBy(CalculatorPerformance.calculateNumberValue, currentChar, tempString);
					currentChar = tempChar;
					tempString = "";
				}
			} else if (numberString.charAt(position) >= 48 && numberString.charAt(position) <= 57) {
				tempString += numberString.charAt(position);
			} else {
				System.out.println("Invalid Input");
				CalculatorPerformance.validResult = false;
				break;
			}

		}

	}

}
