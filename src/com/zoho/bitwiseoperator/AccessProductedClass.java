package com.zoho.bitwiseoperator;

import com.zoho.arrays.ProductedClassDemo;

class Parent extends ProductedClassDemo {
	Parent() {
		System.out.println("parent");
	}

}

class Child extends Parent {
	Child() {
		System.out.println("child");
	}

}

class GrantChild extends Child {
	GrantChild() {
		System.out.println("GrantChild");
	}

}

public class AccessProductedClass {

	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.productedClassMethod();
		Child child = new Child();
		child.productedClassMethod();
		GrantChild grantChild = new GrantChild();
		grantChild.productedClassMethod();
	}

}
