package com.zoho.collections;

import java.util.Scanner;

public class MyArrayListImplementation {

	public static void main(String[] args) {

		MyArrayList myArrayList = new MyArrayList();

		Scanner reader = new Scanner(System.in);

		// Add Values To MyArrayList
		System.out.println("Enter your name");
		myArrayList.add(reader.next());
		System.out.println("Your Initial");
		myArrayList.add(reader.next().charAt(0));
		System.out.println("your age");
		myArrayList.add(reader.nextInt());
		System.out.println("Mobile Number");
		myArrayList.add(reader.nextLong());

		// Get values

		System.out.println("My List Values");
		for (int index = 0; index < myArrayList.size(); index++) {
			System.out.println(myArrayList.get(index));
		}

		// Default Capacity
		System.out.println("Default Capacity Of My ArrayList : " + myArrayList.defaultCapacity());

		// MyArrayList Empty Or Not
		System.out.println("MyArrayList Empty Or Not         : " + myArrayList.isEmpty());

		// MyArrayListSize
		System.out.println("MyArrayList Size                 : " + myArrayList.size());

		// Values Present Or not
		System.out.println("Check value Present Or Not       : " + myArrayList.contains(reader.next()));
		System.out.println("Clear the ArrayList              : ");

		// Empty MyArraylist
		myArrayList.clear();
		System.out.println("MyArrayList Size                 : " + myArrayList.size());

		// Find Last Index Of MyArrayList
		System.out.println("LastIndexOf                      : " + myArrayList.lastIndexOf("mahee"));

		// Find FirstIndexOf MyArrayLiist
		System.out.println("IndexOf                          : " + myArrayList.indexOf("Mahee"));
		System.out.println("Set                              : ");

		// Set the value in particular positon
		myArrayList.set(0, "MAhee");

		System.out.println("My List Values");
		for (int index = 0; index < myArrayList.size(); index++) {
			System.out.println(myArrayList.get(index));
		}
		myArrayList.add(1, "mahee");

		for (int index = 0; index < myArrayList.size(); index++) {
			System.out.println(myArrayList.get(index));
		}

	}

}
