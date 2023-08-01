package com.tnsif.dayeight.Interface;

public interface Bank {
	public static final float min=25000;
	public static final float max=40000;
	public void deposit(float amt);
	public void withdraw(float amt);
}
