package com.zoho.controlstatements;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char choice =' ';
		do {
			System.out.println("Enter the name :");
			String studentName = reader.next();
			System.out.println("Enter the rollNumber");
			String studentRollNumber =reader.next();
			System.out.println("Enter the gender : ");
			String studentGender = reader.next();
			
			System.out.println("Student details");
			System.out.println("Student Name        : "+studentName);
			System.out.println("Student Roll Number : "+studentRollNumber);
			System.out.println("Student Gender      : "+studentGender+"\n");
			System.out.println("Do you want add another student details press y");
			 choice = reader.next().charAt(0);
		}while(choice =='y');
		

	}

}
