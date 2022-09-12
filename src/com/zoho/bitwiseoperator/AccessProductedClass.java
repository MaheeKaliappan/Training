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
	public static void main(String [] a) {
		Child obj1 = new Child();
		obj1.productedClassMethod();
	}

}

class GrantChild extends Child {
	GrantChild() {
		System.out.println("GrantChild");
		
	}
	public static void main(String [] a) {
		GrantChild obj = new GrantChild();
		obj.productedClassMethod();
	}

}

/*public class AccessProductedClass extend {

	public static void main(String[] args) {

		GrantChild grantChild = new GrantChild();
		Child obj3 = new Child();
		obj3.
		
		
	}

}*/
