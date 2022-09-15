package com.zoho.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneDirectoryUsingTreeMap {

	TreeMap<String, Long> contactDetails = new TreeMap<String, Long>();

	public static void main(String[] args) {
		int exit = 1;
		Scanner reader = new Scanner(System.in);
		PhoneDirectoryUsingTreeMap phoneDirectoryUsingTreeMap = new PhoneDirectoryUsingTreeMap();
		do {

			System.out
					.println("1.AddContact\n2.UpdateContact\n3.ViewContactList\n4.DeleteContact\n5.DeleteAllContacts");
			int choice = reader.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Contact Name");
				String contactName = reader.next();
				System.out.println("Enter number");
				Long contactNumber = reader.nextLong();
				phoneDirectoryUsingTreeMap.addContact(contactName, contactNumber);
				break;
			case 2:
				System.out.println("Update Contact Name");
				contactName = reader.next();
				System.out.println("Update Contact Number");
				contactNumber = reader.nextLong();
				phoneDirectoryUsingTreeMap.updateContact(contactName, contactNumber);
				break;
			case 3:
				phoneDirectoryUsingTreeMap.viewContactList();
				break;
			case 4:
				System.out.println("Delete Contact Name");
				contactName = reader.next();
				phoneDirectoryUsingTreeMap.deleteContact(contactName);
				break;
			case 5:
				phoneDirectoryUsingTreeMap.deleteAllContacts();
				break;

			default:
				System.out.println("Invalid Input");
			}
			System.out.println("Do yu want  continue press 0");
			exit = reader.nextInt();

		} while (exit == 0);

	}

	private void deleteAllContacts() {
		if (contactDetails.size() == 0) {
			System.out.println("Contact List Already Empty");
		} else {
			contactDetails.clear();
			System.out.println("Contact Fully Cleared");
		}
	}

	private void deleteContact(String contactName) {
		if (contactDetails.containsKey(contactName)) {
			contactDetails.remove(contactName);
			System.out.println("Deleted Suceessfully");
		} else {
			System.out.println(contactName + " Contact not Found");
		}
	}

	private void viewContactList() {
		System.out.println("Contact List");
		if (contactDetails.size() == 0) {
			System.out.println("Contact List is Empty");
		} else {
			for (Entry<String, Long> e : contactDetails.entrySet())
				System.out.println("Name : " + e.getKey() + " Contact Number : " + e.getValue());

		}

	}

	private void updateContact(String contactName, Long contactNumber) {
		if (contactDetails.containsKey(contactName)) {
			contactDetails.replace(contactName, contactNumber);
			System.out.println("Updated Successfully");
		} else {
			System.out.println(contactName + " Contact Not Found");
		}

	}

	private void addContact(String contactName, Long contactNumber) {
		contactDetails.put(contactName, contactNumber);
		System.out.println("Contact Added Successfuly");

	}

}
