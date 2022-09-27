package com.zoho.calculator;

public class CalculatingValues implements CalculatorOperation {

	@Override
	public int addtion(int result, String tempString) {
		return result += (Integer.parseInt(tempString));
	}

	@Override
	public int subtraction(int result, String tempString) {
		return result -= (Integer.parseInt(tempString));
	}

	@Override
	public int multiplication(int result, String tempString) {
		return result *= (Integer.parseInt(tempString));
	}

	@Override
	public int division(int result, String tempString) {
		return result /= (Integer.parseInt(tempString));
	}

	public static int operationPerformedBy(int calculateNumberValue, char currentChar, String tempString) {
		CalculatingValues calculatingValues = new CalculatingValues();
		switch (currentChar) {
		case '+':
			return calculatingValues.addtion(calculateNumberValue, tempString);
		case '-':
			return calculatingValues.subtraction(calculateNumberValue, tempString);
		case '*':
			return calculatingValues.multiplication(calculateNumberValue, tempString);
		case '/':
			return calculatingValues.division(calculateNumberValue, tempString);
		}
		return 0;
	}

}
