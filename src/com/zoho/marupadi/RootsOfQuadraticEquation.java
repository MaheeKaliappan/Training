package com.zoho.marupadi;

import java.util.Scanner;

public class RootsOfQuadraticEquation {
	public static void main(String args[]) {
		// 31program

		/* 31) Program to Find the Roots of a Quadratic Equation */

		double firstRoot = 0;
		double secondRoot = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a :");
		double a = sc.nextDouble();

		System.out.println("Enter the value of b :");
		double b = sc.nextDouble();

		System.out.println("Enter the value of c :");
		double c = sc.nextDouble();

		double determinant = (b * b) - (4 * a * c);
		double sqrt = Math.sqrt(determinant);

		if (determinant > 0) {
			firstRoot = (-b + sqrt) / (2 * a);
			secondRoot = (-b - sqrt) / (2 * a);
			System.out.println("Roots are :: " + firstRoot + " and " + secondRoot);
		} else if (determinant == 0) {
			System.out.println("Root is :: " + (-b + sqrt) / (2 * a));
		} else {

			// roots are complex number and distinct
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-determinant) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi", real, imaginary);
			System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
	}
}
