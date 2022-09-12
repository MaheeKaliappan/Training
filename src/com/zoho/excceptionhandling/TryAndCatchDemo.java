package com.zoho.excceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatchDemo {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("enter arraySize");
		int arraySize = reader.nextInt();
		int array[] = new int[arraySize];

		try {
			System.out.println("Enter the Array values");
			for (int index = 0; index < arraySize; index++) {
				array[index] = reader.nextInt();
			}
		} catch (InputMismatchException inputMismatchException) {
			System.out.println(inputMismatchException);
		} catch (ArithmeticException arithException) {
			System.out.println(arithException);
		} catch(Exception exception)
		{
			System.out.println(exception);
		}
		finally {
			System.out.println("task completed");
		}

	}

}
