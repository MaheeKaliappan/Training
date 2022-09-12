package com.zoho.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductAndSellerManagement {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		List<Product> productDetails = new ArrayList<Product>();
		List<User> userDetails = new ArrayList<User>();
		int productCount = 1;
		int option = 0;
		boolean findUser = false;
		do {
			System.out.println("1.LogIn \n2.SignUp");
			option = reader.nextInt();

			if (option == 1) {
				User user = new User();
				System.out.println("LogIn");
				System.out.println("Enter ur name");
				user.setUserName(reader.next());
				System.out.println("Enter password");
				user.setUserPassword(reader.next());

				if (user.getUserName().equalsIgnoreCase("admin") && user.getUserPassword().equalsIgnoreCase("admin")) {
					System.out.println("Product Page");
					System.out.println("1.Add Product \n2.View Product \n3.Update Product \n4.Delete Product");
					option = reader.nextInt();

					if (option == 1) {
						do {
							Product product = new Product();
							product.setProductId(productCount);
							System.out.println("Product Name");
							product.setProductName(reader.next());
							System.out.println("Product Price");
							product.setProductPrice(reader.nextFloat());
							productCount++;
							productDetails.add(product);
							System.out.println("Do Yu Want Add Another Product Press 1");
							option = reader.nextInt();
						} while (option == 1);

					} else if (option == 2) {
						if (productDetails.size() == 0) {
							System.out.println("Product List Is Empty");
						} else {
							for (int index = 0; index < productDetails.size(); index++) {
								Product product = new Product();
								System.out.println("Product Id    : " + productDetails.get(index).getProductId());
								System.out.println("Product Name  : " + productDetails.get(index).getProductName());
								System.out.println("Product Price : " + productDetails.get(index).getProductPrice());
							}
						}

					} else if (option == 3) {
						if (productDetails.size() == 0) {
							System.out.println("Product List Is Empty");
						} else {
							Product product = new Product();
							System.out.println("Update Product Id");
							option = reader.nextInt();
							product.setProductId(option);
							System.out.println("Product Name");
							product.setProductName(reader.next());
							System.out.println("Product Price");
							product.setProductPrice(reader.nextFloat());

							productDetails.set((option - 1), product);
							System.out.println("Updated SuccessFully1");
						}

					} else if (option == 4) {
						if (productDetails.size() == 0) {
							System.out.println("Product List Is Empty");
						} else {
							System.out.println("Delete Product Id");
							option = reader.nextInt();
							productDetails.remove(option - 1);
							System.out.println("Deleted Successfully");
						}

					} else {
						System.out.println("Invalid input");
					}

				} else {
					for (int index = 0; index < userDetails.size(); index++) {
						if (userDetails.get(index).getUserName().equalsIgnoreCase(user.getUserName()) && (userDetails
								.get(index).getUserPassword().equalsIgnoreCase(user.getUserPassword()))) {
							findUser = true;
							break;
						}
					}
					if (findUser) {
						System.out.println("Product Details");

						Product product = new Product();
						for (int index = 0; index < productDetails.size(); index++) {
							System.out.println("Product Id    : " + productDetails.get(index).getProductId());
							System.out.println("Product Name  : " + productDetails.get(index).getProductName());
							System.out.println("Product Price : " + productDetails.get(index).getProductPrice());

						}

					} else {
						System.out.println("Mismatch User Name  & Password");
					}

				}

			} else if (option == 2) {
				User user = new User();
				System.out.println("Sign Up");
				System.out.println("Enter ur name");
				user.setUserName(reader.next());
				System.out.println("Enter password");
				user.setUserPassword(reader.next());
				userDetails.add(user);
				System.out.println("Product Details");
				if (productDetails.size() == 0) {
					System.out.println("Product List Is empty");
				} else {
					Product product = new Product();
					for (int index = 0; index < productDetails.size(); index++) {
						System.out.println("Product Id    : " + productDetails.get(index).getProductId());
						System.out.println("Product Name  : " + productDetails.get(index).getProductName());
						System.out.println("Product Price : " + productDetails.get(index).getProductPrice());

					}
				}

			} else {
				System.out.println("Invalid Input");
			}
			System.out.println("Do Yu Want Continue press 1");
			option = reader.nextInt();
		} while (option == 1);
		System.out.println("Thank  Yu");

	}

}
