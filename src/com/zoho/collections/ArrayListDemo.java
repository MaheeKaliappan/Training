package com.zoho.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner reader  = new Scanner(System.in);
		List<Student> studentDetails = new ArrayList<Student>();
	
		
		Student student = new Student();
		System.out.println("Student Name");
		student.setName(reader.next());
		System.out.println("Student RollNumber");
		student.setRollNumber(reader.next());
		System.out.println("Student Age");
		student.setAge(reader.nextInt());
		System.out.println("Mobile Number");
		student.setMblNumber(reader.nextLong());
		
		studentDetails.add(student);
		
		System.out.println("Student Details");
		System.out.println("Name          : "+studentDetails.get(0).getName());
		System.out.println("RollNumber    : "+studentDetails.get(0).getRollNumber());
		System.out.println("Age           : "+studentDetails.get(0).getAge());
		System.out.println("Mobile Number : "+studentDetails.get(0).getMblNumber());
		
	}

}
