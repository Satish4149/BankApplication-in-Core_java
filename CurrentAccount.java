package com.yadavsatish.developer;

     public class CurrentAccount extends Account {
		double overdraft;

		public CurrentAccount() {
			// TODO Auto-generated constructor stub
		}

		public CurrentAccount(int accountNumber, String accountHodername, double accountBalance) {
			super(accountNumber, accountHodername, accountBalance);

		}

		public double getOverdraft() {
			return overdraft;
		}

		public void setOverdraft(double overdraft) {
			this.overdraft = overdraft;
		}

		public double calRateOfAccount() {
			return 0;
		}

		@Override
		public boolean withdraow(double amount) {
			overdraft = this.accountBalance - amount;

			if (overdraft >= -50000) {
				this.accountBalance -= amount;
				System.out.println("\t\tYour Account  Overdraft Amount :  "+ overdraft);
				return true;
			} else {
				System.out.println("\t\tBecause of Overdraft Limit You Did Not Complete Transanction");
			}
			return false;
		}

	}


