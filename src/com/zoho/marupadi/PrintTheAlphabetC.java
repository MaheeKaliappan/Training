package com.zoho.marupadi;
import java.util.Scanner;
class PrintingC
{
	public void printingAlphabet(int number)
	{
		for(int outerLoop = 1;outerLoop <= number; outerLoop++)
		{
			for(int innerLoop = 1;innerLoop <= number;innerLoop++)
			{
				if(outerLoop == 1 || outerLoop == number)
				{
					System.out.print(" * ");
					
				}
				else
				{
					System.out.print(" * ");
					break;
				}
				
			}
			System.out.println(" ");
		}
	}
}
public class PrintTheAlphabetC
{
	public static void main(String args[])
	{
		//55 Program

		/*55) Write a program to print the alphabet 'C' with the stars based on the given number*/
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = reader.nextInt();
		
		PrintingC printing = new PrintingC();
		printing.printingAlphabet(number);
	}
}

