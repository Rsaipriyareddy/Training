package com.lti.day5.Exception;

public class BankAccount {

		private int accNo;
		private String name;
		private double balance;
		
		public BankAccount(int accNo, String name, double balance) {
			this.accNo = accNo;
			this.name = name;
			this.balance = balance;
		}
		
		//public double withdraw(double amount) throws Exception
		//public double withdraw(double amount) throws  Error
		//public double withdraw(double amount) throws  RuntimeException
		public double withdraw(double amount) throws  AccountException{
			if(amount>balance) {
				AccountException e=new AccountException("Insufficient Balanace!");
				throw e;
			}
			else {
				balance -=amount;	//Balance is Substract from the Amt
				return balance;
			}
		}
	
		public static void main(String[] args) {
			
		//	BankAccount ba=new BankAccount(1234,"Priya",8304);
			BankAccount ba=null;
		try {
				double balance=ba.withdraw(9000);
				System.out.println("Balance left: "+balance);
			}
		catch(AccountException e) {
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Some msg here");
		}
	}
		

}
