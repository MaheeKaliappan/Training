package com.zoho.javaprograms;

import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args) {
		NumberInWords numberInWords = new NumberInWords();
		numberInWords.convertNumberToWords();

	}

	private void convertNumberToWords() {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the number");
			int number = reader.nextInt();

			String[] one = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
			String[] two = { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "eighteen",
					"nineteen" };
			String[] three = { "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

			String numLength = String.valueOf(number);
			if (number == 0) {
				System.out.println("Zero");
			} else if (number <= 10) {
				System.out.println(one[number - 1]);
			} else if (number <= 19 && number >= 11) {

				System.out.println(two[number % 10 - 1]);
			} else if (numLength.length() == 2) {
				int num = number % 10 - 1;
				System.out.print(three[number / 10 - 2]);
				if (num != -1) {
					System.out.print(" " + (one[number % 10 - 1]));
				}
				System.out.println();
			} else {

				System.out.print(one[number / 100 - 1] + " Hundred ");

				int num = number % 100;

				if ((num != -1) && (num != 0)) {
					System.out.print(" " + (three[(num / 10) - 2]));
				}
				num = num % 10;
				if (num != 0) {
					System.out.println(one[num - 1]);
				}

				System.out.println();

			}
		}
	}

}
