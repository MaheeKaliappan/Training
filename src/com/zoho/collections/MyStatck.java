package com.zoho.collections;

public class MyStatck {

	private int index = 0;
	private int myStackSize = 0;
	private Object myStack[] = new Object[myStackSize];

	public MyStatck(int myStackSize) {
		this.myStackSize = myStackSize;
		myStack = new Object[myStackSize];
		System.out.println(myStack.length);
	}

	public MyStatck() {
		// TODO Auto-generated constructor stub
	}

	public boolean empty() {
		if (index == 0) {
			return true;
		}
		return false;
	}

	public Object pop() {
		if (myStackSize != -1) {
			Object temp = myStack[index - 1];
			myStack[index - 1] = null;
			myStackSize--;
			index--;
			return temp;

		}
		return "Stack Is Empty";
	}

	public void push(Object object) {
		if (index == myStackSize) {
			System.out.println("Stack is full");

		} else {
			myStack[index] = object;
			index++;

		}

	}

	public void peek() {
		if (index != 0) {
			System.out.println("Element on stack top: " + myStack[index - 1]);
		} else {
			System.out.println("Stack Is Empty");
		}

	}

	public void view() {
		for (int index = myStack.length - 1; index >= 0; index--) {
			if (myStack[index] != null) {
				System.out.println("|---|");
				System.out.println(" " + myStack[index]);

			}

		}
		System.out.println("|---|");
	}

}
