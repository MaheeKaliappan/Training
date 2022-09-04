package com.zoho.marupadi;
import java.util.Scanner;

public class SumOfNaturalNumbers
{
	public static void main(String args[])
	{
		//34Program

		/* 34) Program to Calculate the Sum of Natural Numbers and find the largest digit of the
		sum.*/

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = reader.nextInt();
		int sum =0;
		for(int start = 1;start <= number;start++)
		{
			
			sum += start;
		}
		System.out.println("sum :"+sum);
	
		int largestDigit = 0;
		
		while(sum > 0)
		{
			int temp = sum % 10;
			
			
			if(largestDigit < temp)
			{
				largestDigit = temp;
			}
			sum = sum / 10;
		}
		System.out.println("largestDigit :"+largestDigit);
	}
}