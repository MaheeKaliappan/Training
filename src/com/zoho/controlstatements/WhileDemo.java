package com.zoho.controlstatements;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = reader.nextInt();
		int outerWhile = 0;
		int innerWhile = 0;
		while(number > outerWhile)
		{
			System.out.println("Outer While : "+number);
			number--;
			while(number > innerWhile)
			{
				System.out.println("Inner While : "+number);
				number--;
			}
		}
		
	}

}
