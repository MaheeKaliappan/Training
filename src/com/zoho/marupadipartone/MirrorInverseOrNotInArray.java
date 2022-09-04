package com.zoho.marupadipartone;

import java.util.Scanner;

public class MirrorInverseOrNotInArray {

	public static void main(String[] args) {
		/*
		 * 10. Write a Program to check whether the given array is Mirror Inverse or
		 * not. If the inverse of an array is equals to the original array then it is
		 * known a mirror inverse.
		 */

		Scanner reader = new Scanner(System.in);
		System.out.println("enter the arraySize");
		int arraySize = reader.nextInt();

		int array[] = new int[arraySize];
		System.out.println("enter the value");
		for (int index = 0; index < arraySize; index++) {
			array[index] = reader.nextInt();
		}
		boolean result = true;
		for (int index = 0; index < arraySize; index++) {

			if (array[array[index]] != index) {
				result = false;
				break;
			}
		}
		if (result) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
