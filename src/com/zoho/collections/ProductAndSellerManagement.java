package com.zoho.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductAndSellerManagement {

	Scanner reader = new Scanner(System.in);
	User user = new User();
	List<Product> productDetails = new ArrayList<Product>();
	List<User> userDetails = new ArrayList<User>();
	int option = 0;
	int productCount = 1;

	public static void main(String[] args) {
		ProductAndSellerManagement productAndSellerManagement = new ProductAndSellerManagement();
		productAndSellerManagement.homePage();
	}

	public void homePage() {
		System.out.println("1.LogIn \n2.SignUp");
		option = reader.nextInt();
		if (option == 1)
		{
			loginPage();
		} 
		else if (option == 2) 
		{
			signupPage();
		}
		else 
		{
			System.out.println("Invalid Input");
		}
	}

	public void loginPage() {
		System.out.println("LogIn");
		System.out.println("Enter ur name");
		user.setUserName(reader.next());
		System.out.println("Enter password");
		user.setUserPassword(reader.next());
		validateUser(user);

	}

	public void signupPage() {
		System.out.println("Sign Up");
		System.out.println("Enter ur name");
		user.setUserName(reader.next());
		System.out.println("Enter password");
		user.setUserPassword(reader.next());
		userDetails.add(user);
		System.out.println("Product Details");
		if (productDetails.size() == 0) {
			System.out.println("Product List Is empty");
			System.out.println("Do yu want logOut press 1");
			option = reader.nextInt();
			if (option == 1) {
				System.out.println("LogOut Successfully");
				homePage();
			}
		} else {
			viewProductList();
		}

	}

	private void validateUser(User user) {
		if (user.getUserName().equalsIgnoreCase("admin") && user.getUserPassword().equalsIgnoreCase("admin")) {
			productPage();
		} else {
			boolean findUser = false;
			if (userDetails.size() != 0) {
				for (int index = 0; index < userDetails.size(); index++) {
					if (userDetails.get(index).getUserName().equalsIgnoreCase(user.getUserName())
							&& (userDetails.get(index).getUserPassword().equalsIgnoreCase(user.getUserPassword()))) {
						findUser = true;
						break;
					}
				}
				if (findUser) {
					System.out.println("Product Details");
					viewProductList();
				} else {
					System.out.println("Please Sign Up First");
					signupPage();
				}
			}

			else {
				System.out.println("Please Sign Up First");
				signupPage();
			}
		}

	}

	private void productPage() {
		System.out.println("Product Page");
		System.out.println("1.Add Product \n2.View Product \n3.Update Product \n4.Delete Product\n5.Logout");
		option = reader.nextInt();
		optionList(option);

	}

	public Product product() {

		Product product = new Product();
		
		System.out.println("Product Name");
		product.setProductName(reader.next());
		System.out.println("Product Price");
		product.setProductPrice(reader.nextFloat());
		System.out.println("Product Quantity");
		product.setProductQuantity(reader.nextInt());

		return product;
	}

	private void optionList(int option) {

		if (option == 1) {
			do {
				Product product = product();
				product.setProductId(productCount);
				productDetails.add(product);
				productCount++;
				System.out.println("Do Yu Want Add Another Product Press 1");
				option = reader.nextInt();
			} while (option == 1);

		} else if (option == 2) {
			if (productDetails.size() == 0) {
				System.out.println("Product List Is Empty");
			} else {
				viewProductList();
			}

		} else if (option == 3) {
			if (productDetails.size() == 0) {
				System.out.println("Product List Is Empty");
			} else {
				
				Product product = product();
				System.out.println("Update Product Id");
				int updateId = reader.nextInt();
				product.setProductId(updateId);
				System.out.println(updateId);
				
				productDetails.set((updateId - 1), product);
				System.out.println("Updated SuccessFully");
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

		} else if (option == 5) {
			homePage();
		} else {
			System.out.println("Invalid input");
		}
		System.out.println("Do yu Want Continue the Product page 1");
		option = reader.nextInt();
		if (option == 1) {
			productPage();
		} else {
			System.out.println("Thank Yu Logout Successfully");
			homePage();
		}

	}

	public void viewProductList() {
		for (int index = 0; index < productDetails.size(); index++) {
			System.out.println("Product Id       : " + productDetails.get(index).getProductId());
			System.out.println("Product Name     : " + productDetails.get(index).getProductName());
			System.out.println("Product Price    : " + productDetails.get(index).getProductPrice());
			System.out.println("Product Quantity : " + productDetails.get(index).getProductQuantity());

		}

	}

}
