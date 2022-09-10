package com.zoho.marupadi;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the month");
		String month = reader.next();

		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")) {
			System.out.println("Season : Winter");
		} else if (month.equalsIgnoreCase("Feburary") || month.equalsIgnoreCase("March")) {
			System.out.println("Season : Spring");
		} else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("Season : Summer");
		} else if (month.equalsIgnoreCase("July") || month.equalsIgnoreCase("June")) {
			System.out.println("Season : Autumn");
		} else if (month.equalsIgnoreCase("Augest") || month.equalsIgnoreCase("September")) {
			System.out.println("Season : Monsoon");
		} else if (month.equalsIgnoreCase("October") || month.equalsIgnoreCase("Novemeber")) {
			System.out.println("Season : Autumn");
		} else {
			System.out.println("Invalid Input");
		}

	}
}
