package com.zoho.collections;

import java.util.Scanner;

public class MyStackImplementation {

	public static void main(String[] args) {
		
		System.out.println("Stack Size");
		Scanner reader = new Scanner(System.in);
		int myStackSize = reader.nextInt();
		MyStatck myStatck = new MyStatck(myStackSize);
		int choice = 0;
		
		do {
			System.out.println("1.Push\n2.Pop\n3.Peek\n4.EmptyOrNot\n5.ViewStack");
			choice =reader.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the stack value");
				myStatck.push(reader.next());
				break;
			case 2:
				myStatck.pop();
				break;
			case 3:
				myStatck.peek();
				break;
			case 4:
				System.out.println(myStatck.empty());
				
				break;
			case 5:
				myStatck.view();
				break;
			default:
				System.out.println("InValid Input");
				break;
					
			}
			System.out.println("Do yu want continue press 1");
			choice =reader.nextInt();
		}while(choice == 1);
		System.out.println("Thank You");
		
//		System.out.println(myStatck.empty());
//		myStatck.push(3);
//		System.out.println(myStatck.pop()); 
//		//System.out.println();
//		
//		myStatck.peek();
//		
//		myStatck.push(3);
//		System.out.println(myStatck.empty());
		

	}

}
