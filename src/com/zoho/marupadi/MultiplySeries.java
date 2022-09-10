package com.zoho.marupadi;

import java.util.Scanner;

public class MultiplySeries {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the value");
		long value = reader.nextInt();
		System.out.println("Enter the possition");
		int position = reader.nextInt();

		long seriesValue = value;
		for (int index = 2; index <= position; index++) {
			seriesValue = (seriesValue * 2);

		}
		System.out.println(seriesValue);
	}

}
