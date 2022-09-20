package com.zoho.banking;

import java.util.List;

public class BankService {

	 static boolean findUser(List<Bank> bankDetails, int userIdNo, String userName) {
		for (int index = 0; index < bankDetails.size(); index++) {
			if ((bankDetails.get(index).getCustomerId() == userIdNo)
					&& (bankDetails.get(index).getCustomerName().equals(userName))) {
				return true;
			}
		}
		return false;
	}

	 static void showAdminPage(List<Bank> bankDetails) {
		if (bankDetails.size() != 0) {
			System.out.println("Over All User Details");
			for (int index = 0; index < bankDetails.size(); index++) {

				System.out.println("User Id                : " + bankDetails.get(index).getCustomerId());
				System.out.println("User Name              : " + bankDetails.get(index).getCustomerName());
				System.out.println("User Account Number    : " + bankDetails.get(index).getCustomerAccountNumber());
				System.out.println("User Previous Balance  : " + bankDetails.get(index).getCustomerPreviousBalance());
				System.out.println("User Current Balance   : " + bankDetails.get(index).getCustomerCurrentBalance());
				System.out.println("User Withdraw Amount   : " + bankDetails.get(index).getCustomerWithdrawAmount());
				System.out.println();
			}
		} else {
			System.out.println("No Users");
		}

	}

	static void viewDetails(int userIdNo, List<Bank> bankDetails) {
		System.out.println("Your Details");
		for (int index = 0; index < bankDetails.size(); index++) {
			if (bankDetails.get(index).getCustomerId() == userIdNo) {
				System.out.println("Ur Id                : " + bankDetails.get(index).getCustomerId());
				System.out.println("Ur Name              : " + bankDetails.get(index).getCustomerName());
				System.out.println("Ur Account Number    : " + bankDetails.get(index).getCustomerAccountNumber());
				System.out.println("Ur Previous Balance  : " + bankDetails.get(index).getCustomerPreviousBalance());
				System.out.println("Ur Current Balance   : " + bankDetails.get(index).getCustomerCurrentBalance());
				System.out.println("Ur Withdraw Amount   : " + bankDetails.get(index).getCustomerWithdrawAmount());
				break;
			}
		}

	}

	 static void withdraw(int withdraw, int userIdNo, List<Bank> bankDetails) {
		for (int index = 0; index < bankDetails.size(); index++) {
			if (bankDetails.get(index).getCustomerId() == userIdNo) {
				if (bankDetails.get(index).getCustomerCurrentBalance() >= withdraw) {
					bankDetails.get(index)
							.setCustomerPreviousBalance(bankDetails.get(index).getCustomerCurrentBalance());
					int withdrawAmount = bankDetails.get(index).getCustomerCurrentBalance() - withdraw;
					if (bankDetails.get(index).getCustomerWithdrawAmount() != null) {
						int totalWithDraw = bankDetails.get(index).getCustomerWithdrawAmount() + withdrawAmount;
						bankDetails.get(index).setCustomerWithdrawAmount(totalWithDraw);
					} else {
						bankDetails.get(index).setCustomerWithdrawAmount(withdraw);
					}

					bankDetails.get(index).setCustomerCurrentBalance(withdrawAmount);
					System.out.println("Withdraw Successfully");
					break;
				} else {
					System.out.println("Insufficient Balance");
				}
			}
		}

	}

	 static void depositAmount(int amount, int userIdNo, List<Bank> bankDetails) {
		int totalAmount = 0;
		for (int index = 0; index < bankDetails.size(); index++) {
			if (bankDetails.get(index).getCustomerId() == userIdNo) {
				bankDetails.get(index).setCustomerPreviousBalance(bankDetails.get(index).getCustomerCurrentBalance());
				totalAmount = amount + bankDetails.get(index).getCustomerCurrentBalance();
				bankDetails.get(index).setCustomerCurrentBalance(totalAmount);
				System.out.println("Deposit Successfully");
				break;
			}
		}


	}
}
