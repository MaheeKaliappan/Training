package com.zoho.studentmanagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class College {
	public static void main(String[] args) {

		List<Student> studentDetails = new ArrayList<Student>();
		Scanner reader = new Scanner(System.in);
		StudentManagement studentManagement = new StudentManagement();
		
		char choice = ' ';

		do {
			int userChoice = studentManagement.selectOption();

			switch (userChoice) {
			case 1:
				
				String dataValue = "add";
				studentManagement.insertStudentData(dataValue);
				break;
			case 2:
				studentManagement.updateStudentData();
				break;
			case 3:
				studentManagement.deleteStudentData();
				break;
			case 4:
				studentManagement.viewAllStudentData();
				break;
			case 5:
				studentManagement.viewParticularStudentData();
				break;
			default:
				System.out.println("Invalid Input");
			}
			System.out.println("Want to continue press y or Y");
			choice = reader.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');
		System.out.println("Thanks");

	}

}
