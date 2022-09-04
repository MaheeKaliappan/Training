package com.zoho.marupadi;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String args[]) {
		// 13program

		/* 13) Write a program to find the area of the square */

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the square value : ");
		int square = reader.nextInt();
		int areaSquare = square * square;
		System.out.println("Area of the square : " + areaSquare);
	}
}