package com.zoho.marupadi;

import java.util.Scanner;

class CheckTheCharacter {
	public String findTheCharacterIsAVowelOrConsonant(char characterValue) {
		String result = " ";

		if ((characterValue >= 'a' && characterValue <= 'z') || (characterValue >= 'A' && characterValue <= 'Z')) {

			if (characterValue == 'a' || characterValue == 'e' || characterValue == 'i' || characterValue == 'o'
					|| characterValue == 'u' || characterValue == 'A' || characterValue == 'E' || characterValue == 'I'
					|| characterValue == 'O' || characterValue == 'U') {
				result = " is vowel";
			}

			else {
				result = " is consonant";
			}
		}

		else {
			result = " character is not a alphabet";
		}
		return result;
	}
}

public class VowelOrConsonant {
	public static void main(String args[]) {

		// 29Program

		/* 29) Program to Check Whether a Character is a Vowel or Consonant */

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter the value :");
		char characterValue = reader.next().charAt(0);

		CheckTheCharacter checking = new CheckTheCharacter();

		String result = checking.findTheCharacterIsAVowelOrConsonant(characterValue);

		System.out.print(characterValue + " " + result);
	}
}
