package com.zoho.marupadi;
import java.util.Scanner;

public class LeftRotateElements 
{  
  public static void main(String args[]) 
	{  
	//43Program

	  /*43) Java Program to left rotate the elements of an array*/
	  
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the arraySize :");
		int arraySize = reader.nextInt();
		int array[] = new int [arraySize]; 

		System.out.println("Enter the values :");
		for(int index = 0;index < arraySize;index++)
		{
			array[index] = reader.nextInt();
		}
		
		System.out.println("How many times array should be rotated : ");
		int rotatedValue = reader.nextInt();
      
     
		
      for(int index = 0; index < rotatedValue; index++)
		{  
          int rotatedArray, getFirstIndex;  
          
	  
          getFirstIndex = array[0];  
          for(rotatedArray = 0; rotatedArray < array.length-1; rotatedArray++)
			{  
              
				  
              array[rotatedArray] = array[rotatedArray+1];  
          }  
          
			  
          array[rotatedArray] = getFirstIndex;  
      }  
      
        
      System.out.println("Array after left rotation: ");  
      for(int index = 0; index< array.length; index++)
		{  
          System.out.print(array[index] + " ");  
      }  
  }  
}  
