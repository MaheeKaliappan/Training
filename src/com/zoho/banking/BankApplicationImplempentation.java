package com.zoho.banking;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankApplicationImplempentation {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		List<Bank> bankDetails = new ArrayList<Bank>();
		System.out.println("My Bank Application");
		char continueTheProcess = ' ';
		int userId = 1;
		int choice = 0;
		Random random = new Random();

		do {
			System.out.println("1.Create Account\n2.View Account");
			choice = reader.nextInt();
			if (choice == 1) {
				Bank bank = new Bank();
				System.out.println("Create ur account");
				System.out.println("Enter User name");
				bank.setCustomerName(reader.next());
				bank.setCustomerId(userId);
				userId++;
				System.out.println("Enter Deposit Amount\nNote:Your Deposit Amount Is Greater than 1000");
				int amount = 0;
				amount = reader.nextInt();
				boolean amountStatus = true;
				if (amount < 1000) {
					while (amountStatus) {
						System.out.println("Minium Balance is 1000");
						amount = reader.nextInt();
						if (amount >= 1000) {
							amountStatus = false;
						}
					}
				}

				bank.setCustomerPreviousBalance(amount);
				bank.setCustomerCurrentBalance(amount);
				String accountNumber = "";
				for (int randomNumber = 0; randomNumber < 11; randomNumber++) {
					int number = random.nextInt(9);
					accountNumber += number;
				}
				bank.setCustomerAccountNumber(accountNumber);
				System.out.println("your Customer Id : " + bank.getCustomerId());
				bankDetails.add(bank);

			} else if (choice == 2) {
				System.out.println("Enter ur name");
				String userName = reader.next();
				System.out.println("Enter userId");
				int userIdNo = 0;
				userIdNo = reader.nextInt();
				if (userName.equalsIgnoreCase("admin") && userIdNo == 1234) {
					BankService.showAdminPage(bankDetails);
				} else if (bankDetails.size() == 0) {
					System.out.println("Invalid UserName & userId");
				} else {
					boolean userFound = BankService.findUser(bankDetails, userIdNo, userName);
					if (userFound) {
						System.out.println("1.DepositAmount\n2.Withdraw\n3.View Details");
						try {
							choice = reader.nextInt();
						} catch (InputMismatchException inputMismatchException) {
							System.out.println(inputMismatchException);
						}

						switch (choice) {
						case 1:
							System.out.println("Enter Your Deposit Amount");
							int amount = reader.nextInt();
							BankService.depositAmount(amount, userIdNo, bankDetails);
							break;
						case 2:
							System.out.println("enter withdrawAmount");
							int withdrawAmount = reader.nextInt();
							BankService.withdraw(withdrawAmount, userIdNo, bankDetails);
							break;
						case 3:
							BankService.viewDetails(userIdNo, bankDetails);
							break;
						default:
							System.out.println("Invalid Input");
							break;

						}
					}

				}
			} else {
				System.out.println("Invalid Input");
			}

			System.out.println("Do you want continue press y or Y");
			continueTheProcess = reader.next().charAt(0);
		} while (continueTheProcess == 'y' || continueTheProcess == 'Y');
		System.out.println("Thank You");

	}

}
