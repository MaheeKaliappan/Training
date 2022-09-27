package com.zoho.banking;

import java.util.List;

public class BankService {

	static boolean findUser(List<Bank> bankDetails, int userIdNo, String userName) {
		if ((bankDetails.get(userIdNo - 1).getCustomerId() == userIdNo)
				&& (bankDetails.get(userIdNo - 1).getCustomerName().equals(userName))) {
			return true;
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
		if (bankDetails.get(userIdNo - 1).getCustomerId() == userIdNo) {
			System.out.println("Ur Id                : " + bankDetails.get(userIdNo - 1).getCustomerId());
			System.out.println("Ur Name              : " + bankDetails.get(userIdNo - 1).getCustomerName());
			System.out.println("Ur Account Number    : " + bankDetails.get(userIdNo - 1).getCustomerAccountNumber());
			System.out.println("Ur Previous Balance  : " + bankDetails.get(userIdNo - 1).getCustomerPreviousBalance());
			System.out.println("Ur Current Balance   : " + bankDetails.get(userIdNo - 1).getCustomerCurrentBalance());
			System.out.println("Ur Withdraw Amount   : " + bankDetails.get(userIdNo - 1).getCustomerWithdrawAmount());

		}
	}

	static void withdraw(int withdraw, int userIdNo, List<Bank> bankDetails) {

		if (bankDetails.get(userIdNo - 1).getCustomerId() == userIdNo) {
			if (bankDetails.get(userIdNo - 1).getCustomerCurrentBalance() >= withdraw) {
				bankDetails.get(userIdNo - 1)
						.setCustomerPreviousBalance(bankDetails.get(userIdNo - 1).getCustomerCurrentBalance());
				int withdrawAmount = bankDetails.get(userIdNo - 1).getCustomerCurrentBalance() - withdraw;
				if (bankDetails.get(userIdNo - 1).getCustomerWithdrawAmount() != null) {
					int totalWithDraw = bankDetails.get(userIdNo - 1).getCustomerWithdrawAmount() + withdraw;
					bankDetails.get(userIdNo - 1).setCustomerWithdrawAmount(totalWithDraw);
				} else {
					bankDetails.get(userIdNo - 1).setCustomerWithdrawAmount(withdraw);
				}

				bankDetails.get(userIdNo - 1).setCustomerCurrentBalance(withdrawAmount);
				System.out.println("Withdraw Successfully");

			} else {
				System.out.println("Insufficient Balance");
			}
		}
	}

	static void depositAmount(int amount, int userIdNo, List<Bank> bankDetails) {
		int totalAmount = 0;

		if (bankDetails.get(userIdNo - 1).getCustomerId() == userIdNo) {
			bankDetails.get(userIdNo - 1)
					.setCustomerPreviousBalance(bankDetails.get(userIdNo - 1).getCustomerCurrentBalance());
			totalAmount = amount + bankDetails.get(userIdNo - 1).getCustomerCurrentBalance();
			bankDetails.get(userIdNo - 1).setCustomerCurrentBalance(totalAmount);
			System.out.println("Deposit Successfully");

		}
	}

}
