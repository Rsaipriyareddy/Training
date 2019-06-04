package com.lti.training.day4.exceptionhandling;

public class BankAccount {

	private int accNo;
	private String name;
	private double balance;
	
	public BankAccount(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public double withdraw(double amount) throws  Exception{
		if(amount>balance) {
			Exception e=new Exception("Insufficient Balanace!");
			throw e;
		}
		else {
			balance -=amount;	//Balance is Substract from the Amt
			return balance;
		}
	}
	
	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount(1234,"Priya",8304);
		
	try {
			double balance=ba.withdraw(9000);
			System.out.println("Balance left: "+balance);
		}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
	
}
