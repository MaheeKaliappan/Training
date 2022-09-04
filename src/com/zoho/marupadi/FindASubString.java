package com.zoho.marupadi;
import java.util.Scanner;

public class FindASubString
{
	public static void main(String args[])
	{
		//59th Program

		/* 59) Find if a String2 is substring of String1. If it is, return the index of the first
		occurrence. else return -1.*/


		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str1 = reader.nextLine();
		System.out.println("Enter the substring : ");
		String str2 = reader.next();
		System.out.println(Substr(str2, str1));

  }

  static int Substr(String str2, String str1) 
	{
      int charCount = 0;
      int i = 0;
      for (; i < str1.length(); i++) 
		{
          if (charCount == str2.length())
			{
              break;
			}
          if (str2.charAt(charCount) == str1.charAt(i)) 
			{
              charCount++;
          } 
			else 
			{
				charCount = 0;
          }
      }
      return charCount < str2.length() ? -1 : i - charCount;
  }

}
	
