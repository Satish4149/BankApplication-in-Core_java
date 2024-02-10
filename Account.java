package com.yadavsatish.developer;

public  abstract class Account {
		int accountNumber;
		String accountHodername;
		double accountBalance;



		public Account() {
			// TODO Auto-generated constructor stub
		}

		public Account(int accountNumber, String accountHodername, double accountBalance) {
			super();
			this.accountNumber = accountNumber;
			this.accountHodername = accountHodername;
			this.accountBalance = accountBalance;
		}

		public int getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getAccountHodername() {
			return accountHodername;
		}

		public void setAccountHodername(String accountHodername) {
			this.accountHodername = accountHodername;
		}

		public double getAccountBalance() {
			return accountBalance;
		}

		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}

		public boolean deposite(double amount) {
			this.accountBalance += amount;
			return true;
		}

		public abstract boolean withdraow(double amount);

		public boolean transfer(Account destiny ,Account source , double amount) {
			if (source.withdraow(amount)) {
				destiny.deposite(amount);
				return true;
			}
			return false;
		}

		public void display() {
			 System.out.println("Account Number : " + this.accountNumber);
			 System.out.println("Account Holder Name : " + this.accountHodername);
			 System.out.println("Account Balance : " + this.accountBalance);
			
		}

		// cosmic superClass

		public boolean equals(Account ref) {
			if (this.accountNumber == ref.accountNumber)
				return true;
			else
				return false;
		}

		public double calRateOfAccount() {
			return this.accountBalance;
		}

	}

