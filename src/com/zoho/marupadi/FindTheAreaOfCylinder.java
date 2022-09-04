package com.zoho.marupadi;

import java.util.Scanner;

public class FindTheAreaOfCylinder {

	public static void main(String args[]) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the radius:");
		double radius = reader.nextDouble();
		System.out.println("Enter the height:");
		double height = reader.nextDouble();

		double volume = (((2 * 22 * radius * height) / 7) + ((2 * 22 * radius * radius) / 7));
		System.out.println("volume of Cylinder is: " + volume);
	}
}