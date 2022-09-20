package com.zoho.banking;

public class Bank {
	
	private Integer customerId;
	private String  customerName;
	private String  customerAccountNumber;
	private Integer customerCurrentBalance;
	private Integer customerPreviousBalance;
	private Integer customerWithdrawAmount;
	
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	public void setCustomerAccountNumber(String customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}
	public Integer getCustomerCurrentBalance() {
		return customerCurrentBalance;
	}
	public void setCustomerCurrentBalance(Integer customerCurrentBalance) {
		this.customerCurrentBalance = customerCurrentBalance;
	}
	
	public Integer getCustomerPreviousBalance() {
		return customerPreviousBalance;
	}
	public void setCustomerPreviousBalance(Integer customerPreviousBalance) {
		this.customerPreviousBalance = customerPreviousBalance;
	}
	public Integer getCustomerWithdrawAmount() {
		return customerWithdrawAmount;
	}
	public void setCustomerWithdrawAmount(Integer customerWithdrawAmount) {
		this.customerWithdrawAmount = customerWithdrawAmount;
	}

}
