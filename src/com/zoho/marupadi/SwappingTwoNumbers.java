package com.zoho.marupadi;
import java.util.Scanner;
class Swapping
{
	public void usingTempValueToSwapping(int firstNumber, int secondNumber)
	{
		System.out.println("Before Swapping :");
		System.out.println("firstNumber     : "+firstNumber);
		System.out.println("secondNumber    : "+secondNumber);
		
		//using 3rd one variable for swapping;
		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("After Swapping :");
		System.out.println("firstNumber     : "+firstNumber);
		System.out.println("secondNumber    : "+secondNumber);
	}
	
	public void withoutUsingTempValueToSwapping(int firstNumber, int secondNumber)
	{
		System.out.println("Before Swapping :");
		System.out.println("firstNumber     : "+firstNumber);
		System.out.println("secondNumber    : "+secondNumber);
		
		//without using extra variable ex: firstNumber = 5; secondNumber = 10;
		firstNumber  = firstNumber + secondNumber; // 5  + 10 = (15 firstNumber);
		secondNumber = firstNumber - secondNumber; // 15 - 10 = (5 secondNumber);
		firstNumber  = firstNumber - secondNumber;  // 15 - 5  = (10 firstNumber);
		
		System.out.println("After Swapping :");
		System.out.println("firstNumber     : "+firstNumber);
		System.out.println("secondNumber    : "+secondNumber);
	}
}
public class SwappingTwoNumbers
{
	public static void main(String args[])
	{
		//27Program

		/* 27) Program to Swap Two Numbers*/
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter firstNumber :");
		
		//get a firstNumber
		int firstNumber = reader.nextInt();
		System.out.print("Enter secondNumber :");
		
		//get a secondNumber
		int secondNumber = reader.nextInt();
		
		//create a object for class Swapping
		Swapping swap = new Swapping();
		char option =' ';
		do
		{	//2ways of swapping
			System.out.println("Swapping \n1.usingTempValueToSwapping \n2.withoutUsingTempValueToSwapping");
			int choice = reader.nextInt();
			if(choice == 1)
			{
				//choice 1 for using temp variable 
				swap.usingTempValueToSwapping(firstNumber,secondNumber);
			}
			else if(choice == 2)
			{
				//choice 2 for without using temp variable
				swap.withoutUsingTempValueToSwapping(firstNumber,secondNumber);
			}
			else
			{
				//other key press its return invalid message
				System.out.print("invalid key");
			}
			System.out.println("Do you want continue press y or Y");
			option = reader.next().charAt(0);
			
		}while(option =='y' || option == 'Y');
		
		
	}

}
