package com.zoho.excceptionhandling;

import java.util.Scanner;

public class ThrowAndRethrow {

	public static void divide()  {  
		Scanner reader= new Scanner(System.in);
    	System.out.println("First number");
    	int firstNumber = reader.nextInt();
    	System.out.println("second number");
    	int secondNumber = reader.nextInt();
    	System.out.println("Result is : "+divideValues(firstNumber,secondNumber));
         
    }  
    
    private static int divideValues (int firstNumber, int secondNumber)  {
    	return firstNumber/secondNumber;
    	}

	public static void main(String[] args) {  
    	try {
    		divide();
    	}
    	catch(Exception e)
    	{
    		System.out.println("error");
    	}
    	
       
    }

}
