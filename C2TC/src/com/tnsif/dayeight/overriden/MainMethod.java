package com.tnsif.dayeight.overriden;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		Dog d=new Dog();
		d.eat();
		Cat c=new Cat();
		c.eat();
		SBI s=new SBI();
		HDFC h=new HDFC();
		ICICI i=new ICICI();
		System.out.println("SBI Rate Of Interest: "+s.getRateOfInterest());
		System.out.println("HDFC Rate Of Interest: "+h.getRateOfInterest());
		System.out.println("ICICI Rate Of Interest: "+i.getRateOfInterest());
	}

}
