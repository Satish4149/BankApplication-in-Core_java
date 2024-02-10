package com.yadavsatish.developer;

	public class SavingAccount extends Account {
		static double minimumBalance = 10000;
		static double rateOfinterest = 8;

		public SavingAccount() {
			// TODO Auto-generated constructor stub
		}

		public SavingAccount(int accountNumber, String accountHodername, double accountBalance) {
			super(accountNumber, accountHodername, accountBalance);
			// TODO Auto-generated constructor stub
		}

		public static double getMinimumBalance() {
			return minimumBalance;
		}

		public static void setMinimumBalance(double minimumBalance) {
			SavingAccount.minimumBalance = minimumBalance;
		}

		@Override
		public boolean withdraow(double amount) {
			if (amount <= this.accountBalance - SavingAccount.minimumBalance) {
				this.accountBalance -= amount;
				return true;
			} else
				return false;
		}

		public static double getRateOfinterest() {
			return rateOfinterest;
		}

		public static void setRateOfinterest(double rateOfinterest) {
			SavingAccount.rateOfinterest = rateOfinterest;
		}

		public boolean hasMinmumBalance() {
			if (this.accountBalance > SavingAccount.minimumBalance)
				return true;
			else
				return false;
		}

		public double calRateOfAccount() {
			return this.accountBalance * (rateOfinterest / 100);
		}

	}


