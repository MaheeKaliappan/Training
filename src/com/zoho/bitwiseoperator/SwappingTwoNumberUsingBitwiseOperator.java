package com.zoho.bitwiseoperator;

import java.util.Scanner;

public class SwappingTwoNumberUsingBitwiseOperator {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the firstNumber");
		int firstNumber = reader.nextInt(); //firstNumber = 3
		System.out.println("Enter the secondNumber");
		int secondNumber = reader.nextInt(); //secondNumber = 2
		
		System.out.println("Before swapping:");  
		
		System.out.println("firstNumber: " +firstNumber +" secondNumber: " +secondNumber);  
		firstNumber = firstNumber ^ secondNumber;   //firstNumber =  011 ^ 010 = 001;
		secondNumber = firstNumber ^ secondNumber;  //secondNumber = 001 ^ 010 = 011;
		firstNumber = firstNumber ^ secondNumber;  //firstNumber = 001 ^ 011 = 010;
		System.out.println("After swapping:"); 
		
		System.out.print("firstNumber: " +firstNumber +" secondNumber: " +secondNumber);  


	}

}
