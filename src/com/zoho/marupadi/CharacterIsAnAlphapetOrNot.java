package com.zoho.marupadi;

import java.util.Scanner;

class CheckAlphabet {
	public String checkCharacterAlphabetOrNot(char charcter) {
		String result = " ";

		if ((charcter >= 'a' && charcter <= 'z') || (charcter >= 'A' && charcter <= 'Z')) {
			result = " is an alphabet.";
		} else {
			result = " is not an alphabet.";
		}

		return result;
	}

}

public class CharacterIsAnAlphapetOrNot {
	public static void main(String args[]) {
		// 33 Program

		/* 33) Program to Check Whether a Character is an Alphabet or not */

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char charcter = reader.next().charAt(0);

		CheckAlphabet checking = new CheckAlphabet();

		String result = checking.checkCharacterAlphabetOrNot(charcter);

		System.out.print(charcter + " " + result);
	}
}
