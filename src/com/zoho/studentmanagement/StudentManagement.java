package com.zoho.studentmanagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.naming.InvalidNameException;

public class StudentManagement {

	Scanner reader = new Scanner(System.in);
	private List<Student> ugStudents = new ArrayList<Student>();
	private List<Student> pgStudents = new ArrayList<Student>();
	private Integer ugStudentRegisterId = 1;
	private Integer pgStudentRegisterId = 1;
	private Integer updateId;
	int userChoice = 0;

	int selectOption() {
		Scanner reader = new Scanner(System.in);
		try {
			System.out.println(
					"1.Insert Student\n2.Update Student\n3.Delete Student\n4.View All Student\n5.View Particular Student");
			userChoice = reader.nextInt();
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("\nInvalid Input..Please Enter the valid input\n");
			selectOption();

		}
		return userChoice;
	}

	ConstraintsChecking constraintsChecking = new ConstraintsChecking();

	public void insertStudentData(String dataValue) {
		Boolean ugStudent = false;
		Boolean pgStudent = false;
		Student student = new Student();
		StudentAddress studentAddress = new StudentAddress();
		StudentDepartment studentDepartment = new StudentDepartment();
		StudentMarkDetails studentMarkDetails = new StudentMarkDetails();
		StudentPersonalDetails studentPersonalDetails = new StudentPersonalDetails();

		System.out.println("\nEnter the Student Name");
		boolean validName = true;
		while (validName) {
			validName = constraintsChecking.nameValidation(student);
			if (validName) {
				validName = false;
			} else {
				validName = true;
			}
		}
		boolean validAge = true;
		while (validAge) {
			validAge = constraintsChecking.validAge(student);
			if (validAge) {
				validAge = false;
			} else {
				validAge = true;
			}
		}

		System.out.println("\nStudent Course Details");
		System.out.println("Major");
		studentDepartment.setStudentCourseName(reader.next());
		boolean validDepartment = true;
		while (validDepartment) {
			validDepartment = constraintsChecking.departmentValidation(studentDepartment);
			if (validDepartment) {
				validDepartment = false;
			} else {
				validDepartment = true;
			}
		}

		if (studentDepartment.getStudentDepartmentName().equalsIgnoreCase("pg")) {
			pgStudent = true;
		} else {
			ugStudent = true;
		}
		student.setStudentDepartment(studentDepartment);
		System.out.println("\nStudent Personal Details");
		boolean validMotherName = true;
		while (validMotherName) {
			validMotherName = constraintsChecking.motherNameValidation(studentPersonalDetails);
			if (validMotherName) {
				validMotherName = false;
			} else {
				validMotherName = true;
			}
		}
		boolean validFatherName = true;
		while (validFatherName) {
			validFatherName = constraintsChecking.fatherNameValidation(studentPersonalDetails);
			if (validFatherName) {
				validFatherName = false;
			} else {
				validFatherName = true;
			}
		}
		System.out.println("\nAddress");
		boolean validDoorNo = true;
		while (validDoorNo) {
			validDoorNo = constraintsChecking.validDoorNo(studentAddress);
			if (validDoorNo) {
				validDoorNo = false;
			} else {
				validDoorNo = true;
			}
		}
		boolean streetNameValidation = true;
		while (streetNameValidation) {
			streetNameValidation = constraintsChecking.streetNameValidation(studentAddress);
			if (streetNameValidation) {
				streetNameValidation = false;
			} else {
				streetNameValidation = true;
			}
		}

		boolean districtNameValidation = true;
		while (districtNameValidation) {
			districtNameValidation = constraintsChecking.districtNameValidation(studentAddress);
			if (districtNameValidation) {
				districtNameValidation = false;
			} else {
				districtNameValidation = true;
			}
		}
		boolean pincodeValidation = true;
		while (pincodeValidation) {
			pincodeValidation = constraintsChecking.pincodeValidation(studentAddress);
			if (pincodeValidation) {
				pincodeValidation = false;
			} else {
				pincodeValidation = true;
			}
		}

		studentPersonalDetails.setStudentAddress(studentAddress);
		student.setStudentPersonalDetails(studentPersonalDetails);
		System.out.println("\nEducational Details");
		boolean sslcSchoolNameValidation = true;
		while (sslcSchoolNameValidation) {
			sslcSchoolNameValidation = constraintsChecking.sslcSchoolNameValidation(studentMarkDetails);
			if (sslcSchoolNameValidation) {
				sslcSchoolNameValidation = false;
			} else {
				sslcSchoolNameValidation = true;
			}
		}

		boolean validSslcMark = true;
		while (validSslcMark) {
			validSslcMark = constraintsChecking.validSslcMark(studentMarkDetails);
			if (validSslcMark) {
				validSslcMark = false;
			} else {
				validSslcMark = true;
			}
		}

		boolean hscSchoolNameValidation = true;
		while (hscSchoolNameValidation) {
			hscSchoolNameValidation = constraintsChecking.hscSchoolNameValidation(studentMarkDetails);
			if (hscSchoolNameValidation) {
				hscSchoolNameValidation = false;
			} else {
				hscSchoolNameValidation = true;
			}
		}

		boolean validHscMark = true;
		while (validHscMark) {
			validHscMark = constraintsChecking.validHscMark(studentMarkDetails);
			if (validHscMark) {
				validHscMark = false;
			} else {
				validHscMark = true;
			}
		}

		if (pgStudent) {
			boolean ugCollegeNameValidation = true;
			while (ugCollegeNameValidation) {
				ugCollegeNameValidation = constraintsChecking.ugCollegeNameValidation(studentMarkDetails);
				if (ugCollegeNameValidation) {
					ugCollegeNameValidation = false;
				} else {
					ugCollegeNameValidation = true;
				}
			}

			boolean validUgPercentage = true;
			while (validUgPercentage) {
				validUgPercentage = constraintsChecking.validUgPercentage(studentMarkDetails);
				if (validUgPercentage) {
					validUgPercentage = false;
				} else {
					validUgPercentage = true;
				}
			}

			
			student.setStudentMarkDetails(studentMarkDetails);
			if (dataValue.equals("update")) {
				pgStudents.set(updateId - 1, student);
			} else {
				student.setStudentRegisterNumber(pgStudentRegisterId);
				pgStudents.add(student);
				pgStudentRegisterId++;
			}

		} else {

			if (dataValue.equals("update")) {
				ugStudents.set(updateId - 1, student);
			} else {
				student.setStudentMarkDetails(studentMarkDetails);
				student.setStudentRegisterNumber(ugStudentRegisterId);
				ugStudents.add(student);
				ugStudentRegisterId++;

			}

		}

	}

	public void updateStudentData() {
		System.out.println("Update Student Register Id");
		int studentRegisterId = reader.nextInt();
		System.out.println("Update Student Department");
		String studentDepartment = reader.next();
		updateId = studentRegisterId;
		boolean studentFind = false;
		String dataValue = "update";
		if (studentDepartment.equalsIgnoreCase("pg")) {
			if (pgStudents.size() > studentRegisterId - 1) {
				if (pgStudents.contains(pgStudents.get(studentRegisterId - 1))) {
					studentFind = true;
					insertStudentData(dataValue);
				}
			}

		} else {
			if (ugStudents.size() > studentRegisterId - 1) {
				if (ugStudents.contains(ugStudents.get(studentRegisterId - 1))) {
					insertStudentData(dataValue);
					studentFind = true;
				}
			}

		}
		if (studentFind) {
			System.out.println("Record Updated Successfully");
		} else {
			System.out.println("Record Not Found");
		}

	}

	public void deleteStudentData() {
		System.out.println("Student Register Id");
		int studentRegisterId = reader.nextInt();
		System.out.println("Student Department");
		String studentDepartment = reader.next();
		boolean studentFind = false;
		if (studentDepartment.equalsIgnoreCase("pg")) {
			if (pgStudents.size() > studentRegisterId - 1) {
				if (pgStudents.contains(pgStudents.get(studentRegisterId - 1))) {
					pgStudents.remove(studentRegisterId - 1);
					studentFind = true;
				}
			}

		} else {
			if (ugStudents.size() > studentRegisterId - 1) {
				if (ugStudents.contains(ugStudents.get(studentRegisterId - 1))) {
					ugStudents.remove(studentRegisterId - 1);
					studentFind = true;
				}
			}

		}
		if (studentFind) {
			System.out.println("Record Deleted Successfully");
		} else {
			System.out.println("Record Not Found");
		}

	}

	public void viewAllStudentData() {

		if (ugStudents.size() == 0) {
			System.out.println("UG StudentList Empty");
		} else {
			System.out.println("\nUG student Details");
			for (int index = 0; index < ugStudents.size(); index++) {
				showUgStudentDetails(index);
			}
		}

		if (pgStudents.size() == 0) {
			System.out.println("PG StudentList Empty");
		} else {
			System.out.println("\nPG Student Details");
			for (int index = 0; index < pgStudents.size(); index++) {
				showPgStudentDetails(index);
			}
		}

	}

	public void viewParticularStudentData() {
		System.out.println("Student Register Id");
		int studentRegisterId = reader.nextInt();
		System.out.println("Student Department");
		String studentDepartment = reader.next();
		boolean studentFind = false;

		if (studentDepartment.equalsIgnoreCase("pg")) {
			if (pgStudents.size() > studentRegisterId - 1) {
				if (pgStudents.contains(pgStudents.get(studentRegisterId - 1))) {
					showPgStudentDetails(studentRegisterId - 1);

				}
			}

			else {
				System.out.println("Invalid Student Register Id");
			}

		} else {
			if (ugStudents.size() > studentRegisterId - 1) {
				if (ugStudents.contains(ugStudents.get(studentRegisterId - 1))) {
					showUgStudentDetails(studentRegisterId - 1);
				}
			}

			else {
				System.out.println("Invalid Student Register Id");
			}

		}

	}

	private void showUgStudentDetails(int studentRegisterId) {

		System.out.println("Name            : " + ugStudents.get(studentRegisterId).getStudentName());
		System.out.println("Register Number : " + ugStudents.get(studentRegisterId).getStudentRegisterNumber());
		System.out.println(
				"Course          : " + ugStudents.get(studentRegisterId).getStudentDepartment().getStudentCourseName());
		System.out.println("Department      : "
				+ ugStudents.get(studentRegisterId).getStudentDepartment().getStudentDepartmentName());
		System.out.println("\nPersonal Details\n");
		System.out.println(
				"Mother Name     : " + ugStudents.get(studentRegisterId).getStudentPersonalDetails().getMotherName());
		System.out.println("Father Name     : "
				+ ugStudents.get(studentRegisterId).getStudentPersonalDetails().getStudentFatherName());
		System.out.println("\nAddress\n");
		System.out.println("Door Number     : "
				+ ugStudents.get(studentRegisterId).getStudentPersonalDetails().getStudentAddress().getDoornumber());
		System.out.println("Street Name     : "
				+ ugStudents.get(studentRegisterId).getStudentPersonalDetails().getStudentAddress().getStreetName());
		System.out.println("District        : "
				+ ugStudents.get(studentRegisterId).getStudentPersonalDetails().getStudentAddress().getDistrict());
		System.out.println("Pincode         : "
				+ ugStudents.get(studentRegisterId).getStudentPersonalDetails().getStudentAddress().getPincode());
		System.out.println("\nEducationational Qualification\n");
		System.out.println(
				"SSLC Schooling  : " + ugStudents.get(studentRegisterId).getStudentMarkDetails().getSslcSchoolName());
		System.out.println(
				"SSLC Mark       : " + ugStudents.get(studentRegisterId).getStudentMarkDetails().getSslcMark());
		System.out.println(
				"HSC Schooling   : " + ugStudents.get(studentRegisterId).getStudentMarkDetails().getHscSchoolName());
		System.out
				.println("HSC Mark        : " + ugStudents.get(studentRegisterId).getStudentMarkDetails().getHscMark());
		System.out.println(" ");

	}

	private void showPgStudentDetails(int studentRegisterId) {

		System.out.println("Name           : " + pgStudents.get(studentRegisterId).getStudentName());
		System.out.println("Register Number: " + pgStudents.get(studentRegisterId).getStudentRegisterNumber());
		System.out.println(
				"Course         : " + pgStudents.get(studentRegisterId).getStudentDepartment().getStudentCourseName());
		System.out.println("Department     : "
				+ pgStudents.get(studentRegisterId).getStudentDepartment().getStudentDepartmentName());
		System.out.println("\nPersonal Details\n");
		System.out.println(
				"Mother Name    : " + pgStudents.get(studentRegisterId).getStudentPersonalDetails().getMotherName());
		System.out.println("Father Name    : "
				+ pgStudents.get(studentRegisterId).getStudentPersonalDetails().getStudentFatherName());
		System.out.println("\nAddress\n");
		System.out.println("Door Number    : "
				+ pgStudents.get(studentRegisterId).getStudentPersonalDetails().getStudentAddress().getDoornumber());
		System.out.println("Street Name    : "
				+ pgStudents.get(studentRegisterId).getStudentPersonalDetails().getStudentAddress().getStreetName());
		System.out.println("District       : "
				+ pgStudents.get(studentRegisterId).getStudentPersonalDetails().getStudentAddress().getDistrict());
		System.out.println("Pincode        : "
				+ pgStudents.get(studentRegisterId).getStudentPersonalDetails().getStudentAddress().getPincode());
		System.out.println("\nEducationational Qualification \n");
		System.out.println(
				"SSLC Schooling : " + pgStudents.get(studentRegisterId).getStudentMarkDetails().getSslcSchoolName());
		System.out
				.println("SSLC Mark      : " + pgStudents.get(studentRegisterId).getStudentMarkDetails().getSslcMark());
		System.out.println(
				"HSC Schooling  : " + pgStudents.get(studentRegisterId).getStudentMarkDetails().getHscSchoolName());
		System.out
				.println("HSC Mark       : " + pgStudents.get(studentRegisterId).getStudentMarkDetails().getHscMark());
		System.out.println(
				"UG College     : " + pgStudents.get(studentRegisterId).getStudentMarkDetails().getUgCollegeName());
		System.out.println(
				"UG Percentage  : " + pgStudents.get(studentRegisterId).getStudentMarkDetails().getUgPercentage());
		System.out.println(" ");
	}

}
