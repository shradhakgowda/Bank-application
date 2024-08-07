package com.crimsonlogic.inheritance.in;

public class SavingsAccount extends BankAccount {

	final double DEFAULT_RATE=3.0;
	private double interest_rate;
	public SavingsAccount() {
	super();
	interest_rate=DEFAULT_RATE;
	}
	

	public SavingsAccount( double balance,double interest_rate) {
		super(balance);
		this.interest_rate = interest_rate;
	}


//	@Override
//	public String toString() {
//		return "SavingsAccount [default_rate=" + DEFAULT_RATE + ", interest_rate=" + interest_rate + "]";
//	}


	public double getInterest_rate() {
		return interest_rate;
	}

	public SavingsAccount setInterest_rate(double interest_rate) {
		if(interest_rate>0.0)
			this.interest_rate=interest_rate;
		return this;
	}
	public SavingsAccount applyInterest() 
	{
		double interest=getBalance()*(interest_rate/100);
		withdrawn(this.interest_rate);
		return this;
		
		
	}

	


	
	
	

}
