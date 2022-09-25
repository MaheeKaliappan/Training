package com.zoho.studentmanagement;

public class Validation {

	public Boolean studentNameValidation(String studentName) {
		for (int index = 0; index < studentName.length(); index++) {
			if (!((studentName.charAt(index) >= 65 && studentName.charAt(index) <= 90)
					|| (studentName.charAt(index) >= 97 && studentName.charAt(index) <= 122))) {
				return false;
			}
		}
		return true;

	}

	public boolean studentDepartmentValidation(String studentDepartmentName) {
		if (studentDepartmentName.equalsIgnoreCase("pg") || studentDepartmentName.equalsIgnoreCase("ug")) {
			return true;
		}
		return false;
	}

	public boolean doorNumberValidation(String doorNumber) {
		for (int index = 0; index < doorNumber.length(); index++) {
			if (!((doorNumber.charAt(index) >= 48 && doorNumber.charAt(index) <= 57))) {
				return false;
			}
		}
		return true;
	}

	public boolean pincodeValidation(String pincode) {
		if (pincode.length() != 6) {
			return false;
		}
			for (int index = 0; index < pincode.length(); index++) {
				if (!((pincode.charAt(index) >= 48 && pincode.charAt(index) <= 57))) {
					return false;
				}
			}
		
		return true;
	}

	public boolean studentAgeValidataion(Integer age) {
		if ((age <= 2004) && (age >= 1983)) {
			return true;
		}
		return false;

	}

	public boolean studentSslcMarkValidation(Integer sslcMark) {
		if ((sslcMark >= 300) && (sslcMark <= 495)) {
			return true;
		}
		return false;
	}

	public boolean studentHscMarkValidation(Integer hscMark) {
		if ((hscMark >= 600) && (hscMark <= 1195)) {
			return true;
		}
		return false;
	}

	public boolean studentUgPercentageValidation(Integer ugPercentage) {
		if ((ugPercentage >= 60) && (ugPercentage <= 95)) {
			return true;
		}

		return false;
	}
}
