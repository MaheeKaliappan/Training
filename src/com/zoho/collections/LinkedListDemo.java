package com.zoho.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How Many student added now?");
		int studentCount = reader.nextInt();
		List<Student> studentDetails = new LinkedList<Student>();
		
		for(int count = 0;count<studentCount;count++)
		{
			Student student  =  new Student();
			System.out.println((count+1)+" Student ");
			System.out.println("Student Name");
			student.setName(reader.next());
			System.out.println("Student RollNumber");
			student.setRollNumber(reader.next());
			System.out.println("Student Age");
			student.setAge(reader.nextInt());
			System.out.println("Mobile Number");
			student.setMblNumber(reader.nextLong());
			studentDetails.add(student);
		}
		System.out.println("Student details");
		for(int count = 0;count<studentCount;count++)
		{
			System.out.println("Student : "+(count+1));
			System.out.println("Name          : "+studentDetails.get(count).getName());
			System.out.println("RollNumber    : "+studentDetails.get(count).getRollNumber());
			System.out.println("Age           : "+studentDetails.get(count).getAge());
			System.out.println("Mobile Number : "+studentDetails.get(count).getMblNumber());
			
		}

	}

}
