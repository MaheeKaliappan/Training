package com.zoho.marupadi;

import java.util.Scanner;

public class ReverseTheString 
{
  public static void main(String args[]) 
	{

	//52 Program


	/*Using Recursion reverse the string such as */
	  
      Scanner reader  = new Scanner(System.in);
		System.out.println("Enter the String : ");
      String input    = reader.nextLine();
     
      String reversed = reverse(input);
      System.out.print(reversed);
  }

  public static String reverse(String str) {
      int index = str.indexOf(" ");

      if (index == -1)
		{
          return str;
		}

      return reverse(str.substring(index + 1)) + " " + str.substring(0, index);
  }

}