package com.tnsif.daysix.usingfinal;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------FinalVariable----------");
		FinalVariable fv =new FinalVariable();
		fv.run();
		System.out.println("----------FinalMethod----------");
		Demo fm=new Demo();
		fm.eat();
		fm.run();
		System.out.println("----------FinalClass----------");
		Strong s=new Strong();
		s.eat();
	}

}
