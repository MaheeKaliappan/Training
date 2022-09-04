package com.zoho.marupadi;



import java.util.Scanner;
class FindAsciiValue
{
	public void findAsciiValueOfACharacter(char character)
	{
		//convert char to int
		 int convertAscii = (int) character;

      System.out.println("The ASCII value of " + character + " is: " + convertAscii);
	}
}
public class ASCIIValue
{
	public static void main(String args[])
	{
		//24program

		/* 24) Program to Find ASCII Value of a Character*/
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char character = reader.next().charAt(0);
		
		FindAsciiValue find = new FindAsciiValue();
		
		find.findAsciiValueOfACharacter(character);
	}
}
