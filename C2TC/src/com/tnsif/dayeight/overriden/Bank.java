package com.tnsif.dayeight.overriden;

public class Bank {
	int getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank {
	int getRateOfInterest() {
		return 10;
	}
}
class HDFC extends Bank {
	int getRateOfInterest() {
		return 20;
	}
}
class ICICI extends Bank {
	int getRateOfInterest() {
		return 30;
	}
}