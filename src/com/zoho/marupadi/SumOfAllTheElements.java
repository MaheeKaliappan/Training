package com.zoho.marupadi;
import java.util.Scanner;
class SumOfElements
{
	 public int findTheSumOfElements(int arraySize)
	 {
		 Scanner reader = new Scanner(System.in);
		 int array [] = new int[arraySize];
		 int sumOfArrayValues = 0;
		 
		 System.out.println("Enter the arrayValues :");
		 for(int index = 0;index < arraySize;index++)
		 {
			 array[index] = reader.nextInt();
			 sumOfArrayValues += array[index];
		 }
		 return sumOfArrayValues;
	 }
}
public class SumOfAllTheElements
{
	 public static void main(String args[])
	 {
		//45 Program

		 /*
		 Java Program to print the sum of all the items of the array
		 */
		 
		 Scanner reader = new Scanner(System.in);
		 System.out.println("Enter the arraySize :");
		 
		
		 int arraySize = reader.nextInt();
		 
		 
		 SumOfElements sum = new SumOfElements();
		 
		
		 int sumOfValues = sum.findTheSumOfElements(arraySize);
		 
		
		 System.out.print("sumOfArrayValues : "+sumOfValues);
	 }
}
