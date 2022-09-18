package com.zoho.collections;

public class MyArrayList {

	private static final int defaultCapacity = 10;
	private int capacity = defaultCapacity;
	private int myArrayIndex = 0;

	Object[] myArrayList = new Object[capacity];

	// add values
	public void add(Object myArrayValues) {
		if (myArrayIndex == myArrayList.length - 1) {
			growMyArray();
		}
		myArrayList[myArrayIndex] = myArrayValues;
		myArrayIndex++;

	}

	// grow array size
	private void growMyArray() {
		int currentCapacity = capacity + capacity / 2;
		Object[] temp = new Object[myArrayList.length];
		for (int index = 0; index < myArrayList.length; index++) {
			temp[index] = myArrayList[index];
		}
		myArrayList = new Object[currentCapacity];
		for (int index = 0; index < temp.length; index++) {
			myArrayList[index] = temp[index];
		}
		capacity = currentCapacity;

	}

	/* It is used to return the number of elements present in the list. */
	public int size() {
		return myArrayIndex;
	}

	/* It returns true if the list is empty, otherwise false. */
	public boolean isEmpty() {
		if (myArrayIndex == 0) {
			return true;
		}
		return false;

	}

	// Array Default Capcity
	public int defaultCapacity() {
		return defaultCapacity;
	}

	// It returns true if the list contains the specified element.
	public boolean contains(Object object) {

		for (int index = 0; index < myArrayIndex; index++) {

			if ((myArrayList[index].equals(object)) || (myArrayList[index] == object)) {

				return true;
			}
		}
		return false;
	}

	// It is used to fetch the element from the particular position of the list.
	public Object get(int indexValue) {

		if (indexValue <= myArrayIndex - 1) {
			return myArrayList[indexValue];
		}
		return null;
	}

	// remove all elements in list
	public void clear() {
		myArrayIndex = 0;
		myArrayList = new Object[capacity];

	}

	/*
	 * It is used to return the index in this list of the last occurrence of the
	 * specified element, or -1 if the list does not contain this element.
	 */
	public int lastIndexOf(Object searchValue) {

		for (int index = myArrayList.length - 1; index >= 0; index--) {
			if (myArrayList[index] != null) {
				if (myArrayList[index].equals(searchValue)) {

					return index;
				}
			}

		}

		return -1;
	}

	/*
	 * It is used to return the index in this list of the first occurrence of the
	 * specified element, or -1 if the List does not contain this element.
	 */
	public int indexOf(Object searchValue) {

		for (int index = 0; index < myArrayList.length; index++) {
			if (myArrayList[index] != null) {
				if (myArrayList[index].equals(searchValue) && myArrayList[index] != null) {
					return index;
				}
			}

		}

		return -1;
	}

	/*
	 * It is used to replace the specified element in the list, present at the
	 * specified position
	 */
	public void set(int index, Object value) {

		if (index <= myArrayIndex) {
			myArrayList[index] = value;
			if (myArrayIndex == 0) {
				myArrayIndex++;
			}
		} else {
			System.out.println("Index Greaterthan arraySize");
		}

	}

	/*
	 * It is used to insert the specified element at the specified position in a
	 * list.
	 */
	public void add(int index, Object value) {
		myArrayIndex++;
		if (myArrayIndex == myArrayList.length - 1) {
			growMyArray();
		}
		if (index <= myArrayIndex) {
			Object temp = value;
			for (int arrayIndex = index; arrayIndex <= myArrayIndex; arrayIndex++) {

				Object arrayValue = myArrayList[arrayIndex];
				myArrayList[arrayIndex] = temp;
				temp = arrayValue;

			}

		} else {
			System.out.println("Index Greaterthan arraySize");
		}
	}

}
