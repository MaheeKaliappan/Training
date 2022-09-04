package com.zoho.marupadi;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String args[]) {
		// 14 program

		/* 14) Write a program to find the area of the rectangle */

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the width : ");
		int width = reader.nextInt();
		System.out.println("Enter the height : ");
		int height = reader.nextInt();
		int areaOfRectangle = width * height;
		System.out.println("Area of rectangle : " + areaOfRectangle);
	}
}
