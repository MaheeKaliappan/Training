package com.zoho.controlstatements;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = reader.nextInt();
		for(int outerLoop = 1;outerLoop<=number;outerLoop++)
		{
			System.out.println("\nOuter Loop : "+outerLoop+"\n");
			for(int innerLoop = 1;innerLoop<=number;innerLoop++)
			{
				System.out.println("Inner Loop : "+innerLoop);
				
			}
		}
		

	}

}
