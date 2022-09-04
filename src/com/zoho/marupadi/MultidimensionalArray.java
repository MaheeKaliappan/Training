package com.zoho.marupadi;

import java.util.Scanner;

public class MultidimensionalArray 
{  

static void leftRotate(int matrix[][])  
{  
	//swapping elements of rows by columns that gives the transpose matrix  
	for(int i=0;i<matrix.length;i++)  
	{  
		for(int j=i;j<matrix.length;j++)  
		{  
			int temp = matrix[i][j];  
			matrix[i][j] = matrix[j][i];  
			matrix[j][i] = temp;  
		}  
	}  

	System.out.println();  
	for(int i=0;i<matrix.length;i++)  
	{  
		//logic to swap columns  
		int low = 0;  
		int high = matrix.length-1;  
		while(low < high)  
		{  
			int temp = matrix[low][i];  
			matrix[low][i] = matrix[high][i];  
			matrix[high][i] = temp;  
			low++;  
			high--;  
		}  
	}  
	//prints the matrix elements after left rotation  
	System.out.println("Matrix After Left Rotation: ");  
	for(int i=0;i<matrix.length;i++)  
	{  
		for(int j=0;j<matrix.length;j++)  
		{  
			System.out.print(matrix[i][j]+" ");  
		}  
	System.out.println();  
	}  
}  
//driver code  
	public static void main(String args[])  
	{  

		//11Program
		/*11) Java Program to left rotate the elements of a multidimensional array*/

		Scanner reader = new Scanner(System.in);
		
		//initialize number of rows and columns  
		System.out.println("Enter the rows :");
		int rows = reader.nextInt();
		
		System.out.println("Enter the columns : ");
		int columns = reader.nextInt();  
		
		//creating a  matrix
		int matrix[][] =new int[rows][columns];
		
		System.out.println("Enter the array values :");
		for(int row = 0;row < matrix.length;row++)
		{
			for(int column = 0;column < matrix.length;column++)
			{
				matrix[row][column] = reader.nextInt();  
			}
			
		}
			
		//prints the matrix  
		System.out.println("The Original Matrix is: ");  
		
		//loop for rows  
		for(int rowIndex=0;rowIndex < rows;rowIndex++)  
		{  
		//loop for column      
		for(int columnIndex=0;columnIndex < columns;columnIndex++)  
		{  
		//prints elements of the matrix       
		System.out.print(matrix[rowIndex][columnIndex]+" ");  
		}  
		System.out.println();  
		}  
		//function calling   
		leftRotate(matrix);  
		}  
	}
