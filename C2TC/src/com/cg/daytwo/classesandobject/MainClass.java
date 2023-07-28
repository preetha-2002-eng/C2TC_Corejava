package com.cg.daytwo.classesandobject;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodClass mc=new MethodClass();
		System.out.println("Sum is "+mc.sum());
		mc.sub(20,10);
		System.out.println("Multiple is "+mc.mul());
		mc.div(10, 2);
	}

}
