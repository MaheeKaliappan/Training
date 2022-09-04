package com.zoho.marupadi;

public class SplitTheStudentBasedOnTheirRollNumber {
	public static void main(String args[]) {
		// 6Program

		/*
		 * 6) Write a program for the following. Let consider 20 students in a class
		 * with the roll no 101-120. We are going to split them into four groups. Based
		 * on their roll number we are going to split them with the following logics.
		 */

		int studentCount = 20;

		for (int student = 1; student <= studentCount; student++) {
			System.out.println("group " + student);

			for (int splitRollNumber = 100 + student; splitRollNumber <= 120; splitRollNumber += 4) {
				System.out.println(splitRollNumber);

				studentCount--;
			}
		}
	}
}
