package com.yadavsatish.developer;

import java.util.Iterator;
import java.util.*;

public class MainApplication {

	public static void main(String[] args) {

		Account[] account = new Account[20];
		ReportClass[] report = new ReportClass[20];
		int Accountnumber = 55555, count = 0, rep = 0, choice;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("\t\t\t|    Enter Your Choice        |");
			System.out.println("------------------------------------------------------");
			System.out.println("\t\t\t| 1 | Login                   |");
			System.out.println("\t\t\t-------------------------------");
			System.out.println("\t\t\t| 2 | Open New Account        |");
			System.out.println("\t\t\t-------------------------------");
			System.out.println("\t\t\t| 0 | Exit                    |");
			System.out.println("----------------------------------------------------------------------------------");
			choice = sc.nextInt();
			System.out.println("\n---------------------------------------------------------------------------------\n");
			System.out.println();
			switch (choice) {
			case 1: {
				int loginChoice = 0;
				while (loginChoice != 3) {

					System.out.println("\t\t\t===============================");
					System.out.println("\t\t\t|    Enter Your Choice        |");
					System.out.println("\t\t\t===============================");
					System.out.println("\t\t\t| 1 | Bank Customer Login     |");
					System.out.println("\t\t\t-------------------------------");
					System.out.println("\t\t\t| 2 | Bank Admin Login        |");
					System.out.println("\t\t\t-------------------------------");
					System.out.println("\t\t\t| 3 | Exit                    |");
					System.out.println("\t\t\t===============================");
					loginChoice = sc.nextInt();

					System.out.println(
							"\n***************************************************************************************\n");

					switch (loginChoice) {
					case 1: {
						System.out.print("\t\tEnter the Account Number : ");
						int accountNumber = sc.nextInt();
						Account accountLogin = null;
						System.out.println("\n******************************************************************\n");
						for (Account ref : account) {
							if (ref != null && ref.getAccountNumber() == accountNumber) {
								accountLogin = ref;

							}
							if (accountLogin != null) {
								int loginChoice1 = 0;

								while (loginChoice1 != 10) {
									System.out.println("\n");
									System.out.println("\t\t----------------------------------");
									System.out.println("\t\t\t|    Enter Your Choice        |");
									System.out.println("\t\t\t---------------------------------");
									System.out.println("\t\t\t| 1 | Deposit                 |");
									System.out.println("\t\t\t-------------------------------");
									System.out.println("\t\t\t| 2 | Withdraw                |");
									System.out.println("\t\t\t-------------------------------");
									System.out.println("\t\t\t| 3 | Money Transfer   |");
									System.out.println("\t\t\t-------------------------------");
									System.out.println("\t\t\t| 4 | Check Balance           |");
									System.out.println("\t\t\t-------------------------------");
									System.out.println("\t\t\t| 10 | Logout                 |");
									System.out.println("\t\t\t--------------------------------");
									loginChoice1 = sc.nextInt();
									System.out.println(
											"\n-------------------------------------------------------------------------------------------\n");
									System.out.println();
									switch (loginChoice1) {
									case 1: {
										System.out.print("\t\tEnter the Deposite Amount : ");
										double amount = sc.nextDouble();
										System.out.println(
												"\n---------------------------------------------------------------------------------------\n");
										if (accountLogin.deposite(amount)) {
											report[count++] = new ReportClass(accountLogin.getAccountNumber(),
													accountLogin.getAccountHodername(), " Deposite ", amount);
											System.out.println("\t\tRs." + amount + " Successfully Deposite :");
										} else
											System.out.println("\t\t: Transaction Failed :");

										break;
									}
									case 2: {
										System.out.print("\t\tEnter the Withdraw Amount : ");
										double amount = sc.nextDouble();
										System.out.println(
												"\n---------------------------------------------------------------------------------------\n");
										if (accountLogin.withdraow(amount)) {
											report[count++] = new ReportClass(accountLogin.getAccountNumber(),
													accountLogin.getAccountHodername(), " Withraow ", amount);
											System.out.println("\t\tRs." + amount + " : Successfully Withdraw :");
										} else
											System.out.println("\t\t: Transaction Failed :");
										break;
									}
									case 3: {
										System.out.print("\t\tEnter Account Number : ");
										int Number = sc.nextInt();
										System.out.print("\t\tEnter the Transfer Amount : ");
										double amount = sc.nextDouble();
										System.out.println(
												"\n---------------------------------------------------------------------------------------\n");
										Account source = accountLogin;
										for (Account refaccount : account) {
											if (refaccount != null && refaccount.getAccountNumber() == Number) {

												if (refaccount.transfer(refaccount, source, amount)) {
													System.out.println("\t\tRs" + amount + ": Transfer Successfull  :");

												} else
													System.out.println("\t\t: Transaction Failed :");

											}
										}
										break;
									}
									case 4: {
										System.out.println(
												"\n---------------------------------------------------------------------------------------\n");
										accountLogin.display();
										double balance = accountLogin.calRateOfAccount();
										System.out.println(
												"\t\t* After Apply Rate of Interest on Account Balance * \n\t\tInterest Amount = Rs. "
														+ balance);
										break;
									}
									case 5: {
										break;
									}

									default:
										System.out.println("\t\t Invalid Choice! *");
										break;
									}

								}

							}
						}
						break;
					}
					case 2: {
						int adminLogin = 10;
						String loginId = "Admin";
						String password = "@admin";

						System.out.println("\t\t This Window Only For Bank Employee *");
						System.out.println(
								"\n---------------------------------------------------------------------------------------\n");
						sc.nextLine();
						System.out.print("\t\tEnter Your Login Id : ");
						String loginId1 = sc.nextLine();
						System.out.print("\n\t\tEnter Your Login Id : ");
						String password1 = sc.nextLine();
						System.out.println(
								"\n---------------------------------------------------------------------------------------\n");
						if (loginId.equals(loginId1) && password.equals(password1)) {
							while (adminLogin != 0) {

								System.out.println("\t\t\t------------------------------");
								System.out.println("\t\t\t|    Enter Your Choice        |");
								System.out.println("\t\t\t--------------------------------");
								System.out.println("\t\t\t| 1 | Show All Account Report |");
								System.out.println("\t\t\t-------------------------------");
								System.out.println("\t\t\t| 2 | Add Intrest All Account |");
								System.out.println("\t\t\t-------------------------------");
								System.out.println("\t\t\t| 0 | Exit                    |");
								System.out.println("\t\t\t--------------------------------");
								adminLogin = sc.nextInt();
								System.out.println(
										"\n------------------------------------------------------------------------------------------\n");
								switch (adminLogin) {
								case 1: {
									for (ReportClass ref : report) {
										if (ref != null)
											ref.display();
									}
									break;
								}
								case 2: {
									for (Account ref : account) {
										if (ref != null) {
											Double amount = ref.calRateOfAccount();
											System.out.println("\t\tAccount Number : " + ref.getAccountNumber()
													+ "\n\t\tInterest Amount = Rs. " + amount);
											ref.deposite(amount);
										}
									}
									break;
								}

								default:
									break;
								}

							}
						} else {
							System.out.println("\t\tsorry! Please Check UserId and Password ");

						}
						break;
					}
					default:
						break;
					}

				}
				break;
			}
			case 2: {
				int signinChoice = 0;

				System.out.println("\t\t\t-------------------------------");
				System.out.println("\t\t\t| Which Account are you open  |");
				System.out.println("\t\t\t--------------------------------");
				System.out.println("\t\t\t| 1 | Saving Account          |");
				System.out.println("\t\t\t-------------------------------");
				System.out.println("\t\t\t| 2 | Salary Account          |");
				System.out.println("\t\t\t-------------------------------");
				System.out.println("\t\t\t| 3 | Current Account         |");
				System.out.println("\t\t\t-------------------------------");
				System.out.println("\t\t\t| 4 | Loan Account            |");
				System.out.println("\t\t\t--------------------------------");
				signinChoice = sc.nextInt();
				System.out.println(
						"\n---------------------------------------------------------------------------------------------\n");
				System.out.println();

				switch (signinChoice) {
				case 1: {

					System.out.println("\t* Note - Minimum Inital Amount Rs. 10000 required ");
					sc.nextLine();
					System.out.print("\t\tEnter the Account Holder Name : ");
					String name = sc.nextLine();
					System.out.print("\n\t\tEnter Inital Amount = ");
					double balance = sc.nextDouble();
					SavingAccount s = new SavingAccount(Accountnumber++, name, balance);
					if (s.hasMinmumBalance()) {

						account[count++] = s;
						System.out.println(
								"\n---------------------------------------------------------------------------------------\n");
						System.out.println("\t\t\tSaving Account Created Successfully");
						account[count - 1].display();
						
						report[rep++] = new ReportClass(account[count - 1].getAccountNumber(), name,
								" Saving Account Open with Inital amount ", balance);

						break;
					} else {
						System.out.println("\t\t\n please check terms and conditions ");
					}
				}
				case 2: {
					System.out.println("\t* Note - Minimum Inital Amount Rs. 10000 required ");
					sc.nextLine();
					System.out.print("\t\tEnter the Account Holder Name : ");
					String name = sc.nextLine();
					System.out.print("\n\t\tEnter Inital Amount = ");
					double balance = sc.nextDouble();
					SalaryAccount s1 = new SalaryAccount(Accountnumber++, name, balance);
					if (s1.hasMinmumBalance()) {
						account[count++] = s1;
						System.out.println(
								"\n---------------------------------------------------------------------------------------\n");
						System.out.println("\t\t\tSalary Account Created Successfully");

						account[count - 1].display();
						// account[count-1].display();
						report[rep++] = new ReportClass(account[count - 1].getAccountNumber(), name,
								" Salary Account Open with Inital amount ", balance);

						break;
					} else {
						System.out.println("\t\t please check terms and conditions ");
					}

				}
				case 3: {

					sc.nextLine();
					System.out.print("\t\tEnter the Account Holder Name : ");
					String name = sc.nextLine();
					System.out.print("\n\t\tEnter Inital Amount = ");
					double balance = sc.nextDouble();
					account[count++] = new CurrentAccount(Accountnumber++, name, balance);
					System.out.println(
							"\n---------------------------------------------------------------------------------------\n");
					System.out.println("\t\t\tCurrent Account Created Successfully");
					account[count - 1].display();
					// account[count-1].display();
					report[rep++] = new ReportClass(account[count - 1].getAccountNumber(), name,
							" Current Account Open with Inital amount ", balance);

					break;
				}
				case 4: {

					sc.nextLine();
					System.out.print("\t\tEnter the Account Holder Name : ");
					String name = sc.nextLine();
					System.out.print("\n\t\tEnter Loan Amount = ");
					double loanAmount = sc.nextDouble();
					LoanAccount temp = new LoanAccount(Accountnumber, name, 0, loanAmount, 0);
					double totalLoanAmoun = temp.calTotalLoanAmount();
					account[count++] = new LoanAccount(Accountnumber, name, 0, loanAmount, totalLoanAmoun);
					System.out.println(
							"\n---------------------------------------------------------------------------------------\n");
					System.out.println("\t\t\tLoan Account Created Successfully");

					account[count - 1].display();
					// account[count-1].display();
					report[rep++] = new ReportClass(account[count - 1].getAccountNumber(), name,
							" Loan Account Open with Loan amount ", loanAmount);

					break;
				}
				default:
					break;
				}
			}

			default:
				break;
			}

		} while (choice != 0);
	}

}
