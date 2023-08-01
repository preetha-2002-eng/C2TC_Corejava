package com.tnsif.dayeight.Interface;

public class SavingAccount extends Person implements Bank{
	int accNo;
	float balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void deposit(float amt)
	{
		if(amt>25000) {
			System.out.println(amt);
		}
		else {
			balance+=amt;
			System.out.println(balance);
		}
	}
	public void withdraw(float amt) {
		if(amt>balance) {
			System.out.println("Insufficient balance");
	    }
		else {
			balance-=amt;
			System.out.println("Amount withdraw "+amt);
			System.out.println("Your account balance "+balance);
		}
	}
	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
}
