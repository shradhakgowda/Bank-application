package com.crimsonlogic.inheritance.in;

public interface Account {
	float minBal = 500f;
	double getBalance();
	BankAccount deposit(double depositAmt);

}
