package com.cg.daythree.inheritance;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		System.out.println("----------SINGLE INHERITANCE!!!----------");
		obj.parent();
		obj.child();
		System.out.println("----------MULTILEVEL INHERITANCE!!!----------");
		ClassC cc=new ClassC();
		cc.sum(10,20);
		cc.sub(20,10);
		cc.mul(2, 10);
		System.out.println("----------HIERARCHICAL INHERITANCE!!!----------");
		Circle c=new Circle();
		c.cdraw();
		c.draw();
	}

}
