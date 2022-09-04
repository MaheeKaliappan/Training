package com.zoho.marupadi;


import java.util.Scanner;

class FindTheFactorialAndSum
{
	public void findTheFactorial(int number)
	{
		long factorial = 1;
		
		//looping 1st index to last index
      for(int index = 1; index <= number; index++)
      {
          //factorial = factorial * i;
          factorial *= index;
      }
		System.out.println("The factorial is : "+factorial);
		
	
		findTheSum(factorial);
		
	}
	public void findTheSum(long factorial)
	{
		int sum = 0;
		while(factorial > 0)
		{
			sum += (int)factorial % 10;
			factorial = factorial / 10;
		}
		System.out.println("The Sum is : "+sum);
	}
}

public class FactorialNumberAndItsSum
{
	public static void main(String args[])
	{
		//35 Program

		/* 35) Program to Find Factorial of a Number and the factorial number's sum of digits. */
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int number = reader.nextInt();
		
		//create a object for class
		FindTheFactorialAndSum find = new FindTheFactorialAndSum();
		
		//method  calling using object 
		find.findTheFactorial(number);
		
		
	}
}
