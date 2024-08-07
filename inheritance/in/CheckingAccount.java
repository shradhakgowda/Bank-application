package com.crimsonlogic.inheritance.in;


public class CheckingAccount extends BankAccount{

	final double DEFAULT_FEE=5.00 ;
	private double monthly_fee;
	public CheckingAccount() {
		super();
		monthly_fee=DEFAULT_FEE;
		
	}
	
public CheckingAccount(double balance ,double monthly_fee) {
		super(balance);
		this.monthly_fee = monthly_fee;
	}
public CheckingAccount applyMonthlyFees() throws ImproperAmount
{
	withdrawn(monthly_fee);
	return this;
	
}

public double getMonthly_fee() {
	return monthly_fee;
}

public CheckingAccount setMonthly_fee(double monthly_fee) {
	if(monthly_fee>=0)
		this.monthly_fee = monthly_fee;
	else
	{
		if(monthly_fee<=0.0)
		{
			try
			{
				throw new ImproperAmount("amount cannot be 0.0 or lesser");
			}catch(ImproperAmount e)
			{
				System.out.println(e.toString());
			}
		}
	}
	return this;
}

@Override
public String toString() {
	return "CheckingAccount [default_fee=" + DEFAULT_FEE + ", monthly_fee=" + monthly_fee + "]";
}



}
