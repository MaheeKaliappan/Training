package com.zoho.marupadi;

import java.util.Scanner;

class StaticKeyword
{  
	public void staticVariable(int rollno,String name,String college)
	{
		// display the values  
		
		System.out.println(rollno+" "+name+" "+college);
		
	}
	
	
}  
public class StaticFunctionlities
{
	static String college ="ANJAC";//static variable 

	static void change()
	{  
   college = "Rajus College";  
  } 
	//static block is executed first	
	static
	{
		System.out.println("static block is invoked");
	}  
	
	public static void main(String args[])
	{  
		//8program
		/*8) Write a program to demonstrate the functionalities of static keyword.*/
		
	     Scanner reader = new Scanner(System.in);
		 StaticKeyword  staticKeyword = new StaticKeyword();
		 System.out.println("Enter the rollno : ");
		 int rollno = reader.nextInt();//instance variable  
		 System.out.println("Enter the name :");
		 String name = reader.next();
		 
		 System.out.println("Static variable value change before");
		 staticKeyword.staticVariable(rollno,name,college);
		 
		 //static method called by class name 
		 StaticFunctionlities.change();
		 
		 System.out.println("Static variable value change After");
		 staticKeyword.staticVariable(rollno,name,college);
		 
	 
	}
}