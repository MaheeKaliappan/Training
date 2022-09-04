package com.zoho.marupadi;

import java.util.Scanner;

class Tables
{
	public void tableForSubtraction(int table,int limit)
	{
		System.out.println("Subtraction Table");
		for(int index = table;index <= limit;index++)
		{
			System.out.println(index+ " - " +table +" = "+ (index - table));
		}
	}
	public void tableForMultiplication(int table,int limit)
	{
		System.out.println("Multiplication Table");
		for(int index = 1;index <= limit;index++)
		{
			System.out.println(index+ " x " +table +" = "+ (index*table));
		}
	}
}

public class TableForSubtractionAndMultipLication
{
	public static void main(String args[])
	{
		
		//1Program

		/* 1) Write a single program to generate a multiplicaiton and subtraction table for a given
		number. */
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the table value : ");
		
		
		int table = reader.nextInt();
		System.out.println("Enter the table limit : ");
		
		
		int limit = reader.nextInt();
		
		
		char continueOption =' ';
		
		
		Tables tables = new Tables();
		
		
		do{
			System.out.println("Which table you want ? \n 1.Subtraction \n 2.Multiplication");
			
			
			int choice = reader.nextInt();
			
			
			if(choice == 1)
			{
				
				tables.tableForSubtraction(table,limit);
			}
			
			
			else if(choice == 2)
			{
				
				tables.tableForMultiplication(table,limit);
			}
			
			
			else
			{
				System.out.println("Please choose valid key");
			}
			System.out.println("do you want continue press y or Y");
			continueOption = reader.next().charAt(0);
			
		}while(continueOption == 'y' || continueOption =='Y');
	}
}