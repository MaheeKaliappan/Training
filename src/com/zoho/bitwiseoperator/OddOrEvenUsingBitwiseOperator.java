package com.zoho.bitwiseoperator;

import java.util.Scanner;

public class OddOrEvenUsingBitwiseOperator {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = reader.nextInt();
		System.out.println((number & 1) == 1 ? "odd" : "even");
		
	}

}
