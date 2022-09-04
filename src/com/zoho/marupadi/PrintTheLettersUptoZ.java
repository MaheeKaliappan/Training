package com.zoho.marupadi;
import java.util.Scanner;
class PrintTheLetters
{
	public void printingLetters(int valueForCharacter)
	{
		
		if(valueForCharacter >= 65 && valueForCharacter <= 90)
		{
			for(int index = valueForCharacter;index <= 90; index++)
			{
				System.out.print((char)index+" ");
			}
		}
		
		
		else if(valueForCharacter >= 97 && valueForCharacter <= 122)
		{
			for(int index = valueForCharacter;index <= 122; index++)
			{
				System.out.print((char)index+" ");
			}
		}
		
		
		else
		{
			System.out.print("invalid keyy");
		}
		
	}
}

public class PrintTheLettersUptoZ
{
	public static void main(String args[])
	{
		//2nd Program

		/* 2) Write a program to print a letters from the user input character to 'Z' without using
		strings.*/
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the character : ");
		
		char character = reader.next().charAt(0);
		
		
		int valueForCharacter = (int)character;
		
		
		PrintTheLetters letters = new PrintTheLetters();
		
		
		letters.printingLetters(valueForCharacter);
		
		
	}
}
