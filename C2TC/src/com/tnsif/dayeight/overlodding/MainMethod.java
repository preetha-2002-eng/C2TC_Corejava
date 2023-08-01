package com.tnsif.dayeight.overlodding;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a=new Point();
		System.out.println("-----METHOD OVERLOADING-----");
		System.out.println(a.sum(10, 20));
		System.out.println(a.sum(10, 20,30));
		System.out.println(a.sum(10.23f, 20.34f));
		System.out.println(a.sum(10.23f, 20,30));
		System.out.println("-----CONSTRUCTOR OVERLOADING-----");
		ConsOverloading obj=new ConsOverloading();
		System.out.println(obj.toString());
		ConsOverloading obj1=new ConsOverloading(2f,20.3f);
		System.out.println(obj1.toString());
	}

}
