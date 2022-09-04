package com.zoho.marupadipartone;

import java.util.Scanner;

public class SplitTheString {

	public static void main(String[] args) {
		/*
		 * 16. Write a program for Split a String into a Number of Substrings. Get a
		 * string as a input and then split as a substring Ex : input:- Graduate study
		 * Output :- Graduate Study
		 */
		
		Scanner reader = new Scanner(System.in);
		System.out.println("enter the string");
		String stringValue = reader.nextLine();
		String stringArray[] = stringValue.split(" ");
		
		for(int index = 0;index<stringArray.length;index++)
		{
			System.out.println(stringArray[index]+" ");
		}

	}

}
