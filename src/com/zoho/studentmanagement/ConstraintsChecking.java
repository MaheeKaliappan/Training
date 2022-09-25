package com.zoho.studentmanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConstraintsChecking {

	Scanner reader = new Scanner(System.in);
	Validation validation = new Validation();
	 boolean validUgPercentage(StudentMarkDetails studentMarkDetails) {
		Scanner reader = new Scanner(System.in);
		try {
			System.out.println("UG Percentage");
			studentMarkDetails.setUgPercentage(reader.nextInt());
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("Invalid Input");
			validUgPercentage(studentMarkDetails);

		}

		return validation.studentUgPercentageValidation(studentMarkDetails.getUgPercentage());

	}

	 boolean validHscMark(StudentMarkDetails studentMarkDetails) {
		Scanner reader = new Scanner(System.in);
		try {
			System.out.println("HSC Mark");
			studentMarkDetails.setHscMark(reader.nextInt());
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("Invalid Input");
			validHscMark(studentMarkDetails);

		}

		return validation.studentHscMarkValidation(studentMarkDetails.getHscMark());

	}

	boolean validSslcMark(StudentMarkDetails studentMarkDetails) {
		Scanner reader = new Scanner(System.in);
		try {
			System.out.println("SSLC mark");
			studentMarkDetails.setSslcMark(reader.nextInt());
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("Invalid Input");
			validSslcMark(studentMarkDetails);

		}

		return validation.studentSslcMarkValidation(studentMarkDetails.getSslcMark());
	}

	boolean validAge(Student student) {
		Scanner reader = new Scanner(System.in);
		System.out.println("\nEnter Valid Age 2004 before 1983 after");
		try {
			student.setAge(reader.nextInt());
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("Invalid Input");
			validAge(student);

		}

		return validation.studentAgeValidataion(student.getAge());
	}

	boolean ugCollegeNameValidation(StudentMarkDetails studentMarkDetails) {
		System.out.println("Ug College Name");
		studentMarkDetails.setUgCollegeName(reader.next());
		return validation.studentNameValidation(studentMarkDetails.getUgCollegeName());
	}

	boolean hscSchoolNameValidation(StudentMarkDetails studentMarkDetails) {
		System.out.println("HSC School Name");
		studentMarkDetails.setHscSchoolName(reader.next());
		return validation.studentNameValidation(studentMarkDetails.getHscSchoolName());
	}
	boolean sslcSchoolNameValidation(StudentMarkDetails studentMarkDetails) {
		System.out.println("SSLC School Name");
		studentMarkDetails.setSslcSchoolName(reader.next());
		return validation.studentNameValidation(studentMarkDetails.getSslcSchoolName());
	}

	boolean pincodeValidation(StudentAddress studentAddress) {
		System.out.println("Pincode");
		studentAddress.setPincode(reader.next());
		return validation.pincodeValidation(studentAddress.getPincode());
	}

	 boolean districtNameValidation(StudentAddress studentAddress) {
		System.out.println("District");
		studentAddress.setDistrict(reader.next());
		return validation.studentNameValidation(studentAddress.getDistrict());
	}

	 boolean streetNameValidation(StudentAddress studentAddress) {
		System.out.println("Street Name");
		studentAddress.setStreetName(reader.next());
		return validation.studentNameValidation(studentAddress.getStreetName());
	}

	boolean validDoorNo(StudentAddress studentAddress) {
		System.out.println("Door Number");
		studentAddress.setDoornumber(reader.next());
		return validation.doorNumberValidation(studentAddress.getDoornumber());
	}

	boolean fatherNameValidation(StudentPersonalDetails studentPersonalDetails) {
		System.out.println("Father Name");
		studentPersonalDetails.setStudentFatherName(reader.next());
		return validation.studentNameValidation(studentPersonalDetails.getStudentFatherName());
	}

	boolean motherNameValidation(StudentPersonalDetails studentPersonalDetails) {
		System.out.println("Mother Name");
		studentPersonalDetails.setMotherName(reader.next());
		return validation.studentNameValidation(studentPersonalDetails.getMotherName());

	}

	 boolean departmentValidation(StudentDepartment studentDepartment) {
		System.out.println("\nUg Or Pg");
		studentDepartment.setStudentDepartmentName(reader.next());
		return validation.studentDepartmentValidation(studentDepartment.getStudentDepartmentName());

	}

	boolean nameValidation(Student student) {
		System.out.println("Enter Valid Name");
		student.setStudentName(reader.next());
		return validation.studentNameValidation(student.getStudentName());
	}
}
