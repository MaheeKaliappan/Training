package com.zoho.studentmanagement;

public class Student {

	private String studentName;
	private Integer studentRegisterNumber;
	private Integer age;
	private StudentMarkDetails studentMarkDetails;
	private StudentPersonalDetails studentPersonalDetails;
	private StudentDepartment studentDepartment;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Integer getStudentRegisterNumber() {
		return studentRegisterNumber;
	}
	public void setStudentRegisterNumber(Integer studentRegisterNumber) {
		this.studentRegisterNumber = studentRegisterNumber;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public StudentMarkDetails getStudentMarkDetails() {
		return studentMarkDetails;
	}
	public void setStudentMarkDetails(StudentMarkDetails studentMarkDetails) {
		this.studentMarkDetails = studentMarkDetails;
	}
	public StudentPersonalDetails getStudentPersonalDetails() {
		return studentPersonalDetails;
	}
	public void setStudentPersonalDetails(StudentPersonalDetails studentPersonalDetails) {
		this.studentPersonalDetails = studentPersonalDetails;
	}
	public StudentDepartment getStudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(StudentDepartment studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	
	
	

}
