package com.yadavsatish.developer;



	public class ReportClass {
		int accountNumber;
		String name;
		String activity;
		double amount;

		public ReportClass() {
			// TODO Auto-generated constructor stub
		}

		public ReportClass(int accountNumber, String name, String activity, double amount) {
			super();
			this.accountNumber = accountNumber;
			this.name = name;
			this.activity = activity;
			this.amount = amount;
		}

		public void display() {
			System.out.println("\n---------------------------------------------------------------------------------------\n");
			System.out.printf(" |d-10% |s-12%|s-15%|lf-10%", this.accountNumber , this.name , this.activity, this.amount);
			// System.out.println("--------------------------------------------------------------------------------------------");
		}

	}


