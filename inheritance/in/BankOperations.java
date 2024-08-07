package com.crimsonlogic.inheritance.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankOperations {
	List<User> userList = new ArrayList<>();
	static String bankOperation;
	Scanner sc = new Scanner(System.in);
	public void readUserChoice(){
		System.out.println("Enter the user choice");
		System.out.println("register : to add new user");
		System.out.println("login : to login as existing user");
		System.out.println("checkbalance : to check balance user");
		bankOperation = sc.next();
	
	}
	
	public void bankingMenu(){
		readUserChoice();
		switch (bankOperation) {
		case "register":
			registerUser();
			break;
			
		case "login":
			login();
			break;
		case "checkbalance":
			CheckBalance();
			break;
		case "save":
			savingBalance();
			break;
		case "Exit":
			System.exit(0);
			break;
		default:
			break;
			
		}
		
		
	}
	
	private void registerUser(){
		
		
		User u = new User();
		System.out.println("Enter the user details userId,name,pass,account Number");
		int userId=sc.nextInt();
		String name=sc.next();
		String pass=sc.next();
		String accNumber=sc.next();
		u.setUserId(userId);
		u.setUserName(name);
		u.setUserPassword(pass);
		u.setAccNumber(accNumber);
		userList.add(u);
		
		System.out.println("sucessfully registered");
		
		
	
		
	}
	private void login() {
		System.out.println("enter login details:");
		 String userName = sc.next();
		String userPwd = sc.next();
		for(User user:userList) {
		
		if(userName.equals(user.getUserName()) && userPwd.equals(user.getUserPassword())){
			System.out.println("enter the action withdraw or deposite ");
			String action = sc.next();
			System.out.println("enter the ammount:");
			double money = sc.nextDouble();
			switch (action) {
			case "withdraw":
				b.withdraw(money);
				break;
				
			case "deposite":
				b.deposite(money);
				break;
			default:
				break;
			
		
	}System.out.println(b);
		}
		else
		{
			System.out.println("user not found");
		}
		}
		}
	private void CheckBalance(){
		CheckingAccount c= new CheckingAccount();
		System.out.println(c.applyMonthlyFees());
		System.out.println("enter the amount to set monthely fee:");
		double monthly_fee = sc.nextDouble();
		c.setMonthly_fee(monthly_fee);
		System.out.println(c);
	}
	private void savingBalance(){
		SavingsAccount s= new SavingsAccount();
		System.out.println(s.applyInterest());
		System.out.println("enter the interest rate:");
		double interest_rate = sc.nextDouble();
		s.setInterest_rate(interest_rate);
		System.out.println(s);
	}
	}
	

