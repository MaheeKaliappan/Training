package com.zoho.marupadi;

import java.util.Scanner;
class Operators
{
	public void bitwiseAND()
	{
		int x = 9, y = 8;   
		   
		// 9 binary value 1001 &8 binary value 1000 = 1000 = 8  
		System.out.println("x = 9 & y = 8  :" + (x & y));   
	}  
	public void bitwiseExclusiveOR()
	{
		int x = 9, y = 8;    
		// 1001 ^ 1000 = 0001 = 1  
		System.out.println("x = 9 ^ y = 8  :" + (x ^ y));   
	}
	public void bitwiseInclusiveOR()
	{
		int x = 9, y = 8;   
		 
		// 1001 | 1000 = 1001 = 9  
		System.out.println("x  =9 | y = 8 : " + (x | y));   
	}
	public void bitwiseComplement()
	{
		int x = 2;   
	
		// ~0010= 1101 = -3  
		System.out.println("~x = 2 :" + (~x));  
	}
	public void signedRightShiftOperatorExample()   
	{   
		int x = 50;   
		System.out.println("x = 50");   
		System.out.println("x>>2 = " + (x >>2));   
	}  
	public void signedLeftShiftOperatorExample()   
	{   
		int x = 12;   
		System.out.println("x =12");   
		System.out.println("x<<1 = " + (x << 1));   
	}  
	public void unsignedRightShiftOperatorExample()   
	{     
		int x = 20;   
		System.out.println("x = 20");   
		System.out.println("x>>>2 = " + (x >>>2));   
	} 
}  



public class BitwiseOperator
{
	public static void main(String args[])
	{
		Operators operators = new Operators();
		int choice = 0;
		Scanner reader  = new Scanner(System.in);
		do
		{
			System.out.println("1.bitwiseAND\n2.bitwiseExclusiveOR\n3.bitwiseInclusiveOR\n4.bitwiseComplement\n5.signedRightShiftOperatorExample\n6.SignedLeftShiftOperatorExample\n7.UnsignedRightShiftOperatorExample");
			choice = reader.nextInt();
			if(choice == 1)
			{
				operators.bitwiseAND();
			}
			else if(choice == 2)
			{
				operators.bitwiseExclusiveOR();
			}
			else if(choice == 3)
			{
				operators.bitwiseInclusiveOR();
			}
			else if(choice == 4)
			{
				operators.bitwiseComplement();
			}
			else if(choice == 5)
			{
				operators.signedRightShiftOperatorExample();
			}
			else if(choice == 6)
			{
				operators.signedLeftShiftOperatorExample();
			}
			else if(choice == 7)
			{
				operators.unsignedRightShiftOperatorExample();
			}
			else
			{
				System.out.println("invalid key");
			}
			System.out.print("Do you want continue press 1 ");
			choice = reader.nextInt();
		}while(choice == 1);
	}
}

