package com.zoho.marupadipartone;

import java.util.Scanner;

public class ReplaceMultipleCharacter {

	public static void main(String[] args) {
		/*17. Write a Program to Replace Multiple Characters in a String.
Get a string as a input and replace multiple characters from the original string,
Ex: Input:- Graduate study (replace 'a' with 'b')*/
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String stringValue = reader.nextLine();
		
		System.out.println("enter oldCharacterValue");
		char oldCharacterValue = reader.next().charAt(0);
		
		System.out.println("enter newCharacterValue");
		char newCharacterValue = reader.next().charAt(0);
		
		System.out.println("Replace Value is : " +stringValue.replace(oldCharacterValue, newCharacterValue));
		

	}

}
