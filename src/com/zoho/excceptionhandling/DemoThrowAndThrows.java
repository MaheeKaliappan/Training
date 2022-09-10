package com.zoho.excceptionhandling;

import java.util.Scanner;

public class DemoThrowAndThrows {

	  public static int divideNum(int firstNumber, int secondNumber) throws ArithmeticException {  
	        
	        return firstNumber / secondNumber;  
	    }  
	    
	    public static void main(String[] args) {  
	    	Scanner reader= new Scanner(System.in);
	    	System.out.println("First number");
	    	int firstNumber = reader.nextInt();
	    	System.out.println("second number");
	    	int secondNumber = reader.nextInt();
	       
	        try {  
	            System.out.println(divideNum(firstNumber,secondNumber));  
	        }  
	        catch (ArithmeticException e){  
	            System.out.println("Number cannot be divided by 0");  
	        }  
	          
	         
	    }  
}
