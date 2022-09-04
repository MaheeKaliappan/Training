package com.zoho.marupadi;

import java.util.Scanner;


public class NumberOfSequenceInAlphabet
{
	public static void main(String args[])
	{

		//53Program

		/* 53) Write a program to give the following output for the given input:
		Eg 1:  Input: a1b10
		Output: abbbbbbbbbb
		Eg: 2:  Input: b3c6d15
		         Output: bbbccccccddddddddddddddd
		The number varies from 1 to 99 */

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the String : " );
		String str = reader.next();
		
		char printChar = ' ';
		int loopSize = 0;
		for(int index = 0; index < str.length(); index++) 
		{
			char currentChar = str.charAt(index);
			
			
			if((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z')) 
			{
				 printChar = currentChar;
			} 
			else if(isNumber(currentChar))
			{
				int number =  Character.getNumericValue(currentChar);
				if(loopSize == 0) 
				{
					loopSize = number ;
				} 
				else 
				{
					loopSize  = (loopSize * 10) + number;
				}
				
				//check the next character is alphabet or numeric if numeric go with getting number or print the alphabet
				int nextIndex = index + 1;
				if(( str.length() == nextIndex) || (str.length() >= nextIndex && !isNumber(str.charAt(nextIndex)) )) 
				{
					
					printCharacter(printChar, loopSize);
					
					loopSize = 0;
					printChar = ' ';
				}
			}
		}
		
	}
	
	private static void printCharacter(char val, int length) 
	{
		for(int i =0; i <length; i++)
		{
			System.out.print(val);
		}
		
	}
	
	private static boolean isNumber(char value)
	{
		if(value >= '0' && value <= '9') 
		{
			return true;
		}
		return false;
	}
}
