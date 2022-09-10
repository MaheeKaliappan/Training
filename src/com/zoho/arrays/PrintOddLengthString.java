package com.zoho.arrays;

import java.util.Scanner;

public class PrintOddLengthString {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("enter the string");
		String stringValue  =  reader.next();
		int rowCount = 0;
		if(stringValue.length() %2 == 1)
		{
			for (int i = 0; i < stringValue.length(); i++)
		    {
		        int j = stringValue.length() -1 - i;
		        for (int k = 0; k < stringValue.length(); k++)
		        {
		            if (k == i || k == j)
		                System.out.print(stringValue.charAt(k));
		                  
		            else
		                System.out.print(" ");
		        }
		        System.out.println("");     
		    }
		}
		
		else
		{
			System.out.println(0);
		}

	}

}
