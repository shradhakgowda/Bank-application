package com.crimsonlogic.inheritance.in;

import java.text.DecimalFormat;

public class BankAccount extends Exception implements Account{
	
public final DecimalFormat MONEY=new DecimalFormat("$#,##0.00");
private double balance;

public BankAccount(double balance) {
	deposit(balance);
	
}

BankAccount()
{	
	balance=0.0;
}

public double getBalance() {
	return balance;
}
public BankAccount deposit(double money) 
{
	if(money<=0.0)
	{	
		try {
		throw new ImproperAmount("this amount can not be deposited or withdrawn enter proper amount");
	}catch(ImproperAmount e) {
		System.out.println(e.toString());
	}
	}
	else
	{
		if(money>0)
			balance+=money;
	}
	return this;
	
}
public BankAccount withdrawn(double money) 
{
	if(money>=0&&money<=balance)
	{
		balance-=money;
	}
	else
	{
		if(money<=0.0)
		{
			System.out.println("this amount can not be deposited or withdrawn enter proper amount");
		}
	}
	return this;
	
}

@Override
public String toString() {
	return "BankAccount [MONEY=" + MONEY + ", balance=" + balance + "]";
}




}
