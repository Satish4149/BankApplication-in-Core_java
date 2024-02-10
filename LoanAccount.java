package com.yadavsatish.developer;

public class LoanAccount extends Account{
	
		double loanAmount, repayLoan;

		static double rateOfinterest = 12;

		public LoanAccount() {
			// TODO Auto-generated constructor stub
		}

		public LoanAccount(int accountNumber, String accountHodername, double accountBalance) {
			super(accountNumber, accountHodername, accountBalance);

		}

		public LoanAccount(int accountNumber, String accountHodername, double accountBalance, double loanAmount,
				double repayLoan) {
			super(accountNumber, accountHodername, accountBalance);
			this.loanAmount = loanAmount;
			this.repayLoan = repayLoan;

		}

		public double getLoanAmount() {
			return loanAmount;
		}

		public void setLoanAmount(double loanAmount) {
			this.loanAmount = loanAmount;
		}

		public static double getRateOfinterest() {
			return rateOfinterest;
		}

		public static void setRateOfinterest(double rateOfinterest) {
			LoanAccount.rateOfinterest = rateOfinterest;
		}

		public double calRateOfAccount() {
			return this.loanAmount * (rateOfinterest / 100);
		}

		public double getRepayLoan() {
			return repayLoan;
		}

		public void setRepayLoan(double repayLoan) {
			this.repayLoan = repayLoan;
		}

		public double calTotalLoanAmount() {
			return this.loanAmount + calRateOfAccount();
		}

		@Override
		public boolean deposite(double amount) {
			if (this.accountBalance < repayLoan) {
				this.repayLoan -= amount;
				return true;
			}
			else{

				System.out.println("Your Loan Amount 0.0000");
				return false;
			}

		}

		@Override
		public boolean withdraow(double amount) {
			System.out.println("This is Loan Account You can Not Complete Transaction");
			return false;
		}

		@Override
		public void display() {
			System.out.println();
			System.out.println("\t\t\t==================================================");
			System.out.println("\t\t\t     Account Number         |\t"+this.accountNumber);
			System.out.println("\t\t\t==================================================");
			System.out.println("\t\t\t     Account Holder Name    |\t"+this.accountHodername);
			System.out.println("\t\t\t==================================================");
			System.out.println("\t\t\t     Account Balance        |\t"+this.accountBalance);
			System.out.println("\t\t\t==================================================");
			System.out.println("\t\t\t     Loan Amount            |\t"+this.loanAmount);
			System.out.println("\t\t\t==================================================");
			System.out.println("\t\t\t    Remaning Loan Amount    |\t"+this.repayLoan);
			System.out.println("\t\t\t==================================================");
			System.out.println();

		}
		
		

	}


