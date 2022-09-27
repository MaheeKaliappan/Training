package com.zoho.gamedeveloping;

import java.util.Scanner;

public class MathGame {

	public static void main(String[] args) {
		getAInput();
	}

	private static void getAInput() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Output");
		Byte outputValue = reader.nextByte();
		System.out.println("possibleValues");
		int possibleValues[] = new int[4];

		for (int index = 0; index < possibleValues.length; index++) {
			possibleValues[index] = reader.nextByte();
		}

		boolean additionResult = false;
		boolean subtractionResult = false;
		boolean multiplicationResult = false;
		boolean divisionResult = false;
		boolean additionWithMuldiplication = false;

		additionResult = addition(possibleValues, outputValue);
		if (additionResult == false) {
			subtractionResult = subtraction(possibleValues, outputValue);
		} else if (subtractionResult == false) {
			multiplicationResult = multiplicationResult(possibleValues, outputValue);
		} else if (multiplicationResult == false) {
			divisionResult = division(possibleValues, outputValue);
		} else if (divisionResult == false) {
			additionWithMuldiplication = additionWithMuldiplication(possibleValues, outputValue);
		}

	}

	private static boolean additionWithMuldiplication(int[] possibleValues, Byte outputValue) {
		if (outputValue == ((possibleValues[0] * possibleValues[1]) * possibleValues[2]) + possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "*" + possibleValues[1] + "*" + possibleValues[2] + "+" + possibleValues[3]);
			return true;
		} else if (outputValue == (((possibleValues[0] * possibleValues[1]) + possibleValues[2]) * possibleValues[3])) {
			System.out.println(
					possibleValues[0] + "*" + possibleValues[1] + "+" + possibleValues[2] + "*" + possibleValues[3]);
			return true;
		} else if (outputValue == (((possibleValues[0] + possibleValues[1]) * possibleValues[2]) * possibleValues[3])) {
			System.out.println(
					possibleValues[0] + "+" + possibleValues[1] + "*" + possibleValues[2] + "*" + possibleValues[3]);
			return true;
		} else if (outputValue == (((possibleValues[0] + possibleValues[1]) + possibleValues[2]) * possibleValues[3])) {
			System.out.println(
					possibleValues[0] + "+" + possibleValues[1] + "+" + possibleValues[2] + "*" + possibleValues[3]);
			return true;
		} else if (outputValue == (((possibleValues[0] + possibleValues[1]) * (possibleValues[2])) + possibleValues[3])) {
			System.out.println(
					possibleValues[0] + "+" + possibleValues[1] + "*" + possibleValues[2] + "+" + possibleValues[3]);
			return true;
		} else if (outputValue == (((possibleValues[0] * possibleValues[1]) + possibleValues[2] )+ possibleValues[3])) {
			System.out.println(
					possibleValues[0] + "*" + possibleValues[1] + "+" + possibleValues[2] + "+" + possibleValues[3]);
			return true;
		}

		return false;
	}

	private static boolean division(int[] possibleValues, Byte outputValue) {
		if (outputValue == possibleValues[0] / possibleValues[1] / possibleValues[2] / possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "/" + possibleValues[1] + "/" + possibleValues[2] + "/" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] / possibleValues[1] / possibleValues[2] * possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "/" + possibleValues[1] + "/" + possibleValues[2] + "*" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] / possibleValues[1] * possibleValues[2] / possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "/" + possibleValues[1] + "*" + possibleValues[2] + "/" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] * possibleValues[1] / possibleValues[2] / possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "*" + possibleValues[1] + "/" + possibleValues[2] + "/" + possibleValues[3]);
			return true;
		}
		return false;
	}

	private static boolean multiplicationResult(int[] possibleValues, Byte outputValue) {
		if (outputValue == possibleValues[0] * possibleValues[1] * possibleValues[2] * possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "*" + possibleValues[1] + "*" + possibleValues[2] + "*" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] * possibleValues[1] * possibleValues[2] / possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "*" + possibleValues[1] + "*" + possibleValues[2] + "/" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] * possibleValues[1] / possibleValues[2] * possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "*" + possibleValues[1] + "/" + possibleValues[2] + "*" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] / possibleValues[1] * possibleValues[2] * possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "/" + possibleValues[1] + "*" + possibleValues[2] + "*" + possibleValues[3]);
			return true;
		}

		return false;
	}

	private static boolean subtraction(int[] possibleValues, Byte outputValue) {
		if (outputValue == possibleValues[0] - possibleValues[1] - possibleValues[2] - possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "-" + possibleValues[1] + "-" + possibleValues[2] + "-" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] - possibleValues[1] - possibleValues[2] + possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "-" + possibleValues[1] + "-" + possibleValues[2] + "+" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] - possibleValues[1] + possibleValues[2] - possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "-" + possibleValues[1] + "+" + possibleValues[2] + "-" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] + possibleValues[1] - possibleValues[2] - possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "+" + possibleValues[1] + "-" + possibleValues[2] + "-" + possibleValues[3]);
			return true;
		}
		return false;
	}

	private static boolean addition(int[] possibleValues, Byte outputValue) {
		if (outputValue == possibleValues[0] + possibleValues[1] + possibleValues[2] + possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "+" + possibleValues[1] + "+" + possibleValues[2] + "+" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] + possibleValues[1] - possibleValues[2] + possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "+" + possibleValues[1] + "-" + possibleValues[2] + "+" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] - possibleValues[1] + possibleValues[2] + possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "-" + possibleValues[1] + "+" + possibleValues[2] + "+" + possibleValues[3]);
			return true;
		} else if (outputValue == possibleValues[0] + possibleValues[1] + possibleValues[2] - possibleValues[3]) {
			System.out.println(
					possibleValues[0] + "+" + possibleValues[1] + "+" + possibleValues[2] + "-" + possibleValues[3]);
			return true;
		}
		return false;
	}

}
